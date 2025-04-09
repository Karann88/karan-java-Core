package STACKSQUEUES.Questions;

import java.util.Stack;

// in the smallest lexicographical order
public class RemoveDup {
    public static void main(String[] args) {
        String ans = removeDuplicateLetter("cbacdcbc");
        System.out.println(ans);
    }

    public static String removeDuplicateLetter(String s) {
        Stack<Character> stack = new Stack<>();
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']--;
            if (visited[ch - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > ch && count[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            visited[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
