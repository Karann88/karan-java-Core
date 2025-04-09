package STACKSQUEUES.Questions;

import java.util.Stack;

public class RemoveOuterParenthesis {
    public static void main(String[] args) {
        // String s = "(()()())((()))";
        // System.out.println(removeOuterParentheses(s));

        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) {
                    result.append(ch);
                }
                count++;
            } else if (ch == ')') {
                count--;
                if (count > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }

    public static String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } 
            if (!stack.isEmpty() && !stack.contains(ch)) {
                stack.push(ch);
            }
        }
        
        // char[] ch = stack.toArray();
        // StringBuilder result = new StringBuilder();
        // for (int i = 0; i < ch.length; i++) {
        //     result.append(ch[i]);
        // }
        // return result.toString();
    }
    
}
