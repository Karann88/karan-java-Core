package STACKSQUEUES.Questions;

import java.util.Arrays;
import java.util.Stack;
import java.lang.Math;
// import java.util.Scanner;

public class TwoStacks {

    static int twoStacks(int x, int[] a, int[] b) {
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) {
            return count;
        }

        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

    // public static void main(String[] args) {
    // int[] a = { 4, 2, 4, 6, 1 };
    // int[] b = { 2, 1, 8, 5 };
    // System.out.println(twoStacks(10, a, b));
    // }

    // Valid Parentheses
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    // public void isValid() {
    // isValid("({[]})");
    // }

    public static void main(String[] args) {
        // System.out.println(isValid("({[]})"));
        // System.out.println(minAddToMakeValid("())"));
        System.out.println(minInsertions("(()"));
    }

    // Minimum add to make parantheses valid.
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();

        // Stack<Character> stack = new Stack<>();
        // int size = 0;

        // for (char ch : s.toCharArray()) {
        // if (ch == '(' || ch == '{' || ch == '[') {
        // stack.push(ch);
        // size++;
        // } else {
        // if (ch == ')') {
        // if (!stack.isEmpty() && stack.pop() == '(') {
        // size--;
        // }
        // }
        // if (ch == '}') {
        // if (!stack.isEmpty() && stack.pop() == '{') {
        // size--;
        // }
        // }
        // if (ch == ']') {
        // if (!stack.isEmpty() && stack.pop() == '[') {
        // size--;
        // }
        // }
        // }
        // }
        // return size;
    }

    // Minimum insertions to Balance a Parantheses String.
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int insertions = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                count++;
                if (count == 2) {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        insertions++;
                    }
                    count = 0;
                }
            }
        }
        if (count == 1) {
            insertions++;
        }
        return insertions + stack.size();
    }
}
