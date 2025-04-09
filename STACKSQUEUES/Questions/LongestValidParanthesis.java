package STACKSQUEUES.Questions;

import java.util.Stack;

public class LongestValidParanthesis {
    public static void main(String[] args) {
        // String s = ")()())";
        // System.out.println(longestValidParentheses(s)); // 2

        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParantheses(s)); // 8

    }

    // public static int longestValidParentheses(String s) {
    // Stack<Integer> stack = new Stack<>();
    // int max = 0;
    // stack.push(-1);
    // for (int i = 0; i < s.length(); i++) {
    // if (s.charAt(i) == '(') {
    // stack.push(i);
    // } else {
    // stack.pop();
    // if (stack.isEmpty()) {
    // stack.push(i);
    // } else {
    // max = Math.max(max, i - stack.peek());
    // }
    // }
    // }
    // return max;
    // }

    public static String removeOuterParantheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != ch) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
