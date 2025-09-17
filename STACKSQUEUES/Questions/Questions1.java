package STACKSQUEUES.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// import java.util.Scanner;
import java.util.Stack;

public class Questions1 {

    public static void main(String[] args) {
        // System.out.println(removeDuplicates("(()()())"));
        // System.out.println(removeDuplicates(removeDuplicates("abbaca")));

        // Stack<Integer> first = new Stack<>();
        // first.push(10);
        // first.push(20);
        // first.push(30);
        // first.push(40);
        // first.push(50);
        // deleteMid(first, first.size());

        // System.out.println(first);

        // Queue<Integer> queue = new LinkedList<>();

        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // for (int i = 0; i < size; i++) {
        // queue.add(sc.nextInt());
        // }

        // int k = sc.nextInt();
        // reverseKElements(queue, k);

        // System.out.println(queue);

        // Questions1 stack = new Questions1(3);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.increment(2, 100);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        boolean ans = validParantheses("[{()}]");
        System.out.println(ans);

        // System.out.println(minAddToMakeValid("(()))"));

        // String ans = decodeString("3[a]2[bc]");
        // System.out.println(ans);

        // int[] nums = { 3, 1, 4, 2 };
        // System.out.println(find132pattern(nums));

        // myCircularQueue queue = new myCircularQueue(3);
        // System.out.println(queue.enQueue(1));
        // System.out.println(queue.enQueue(2));
        // System.out.println(queue.enQueue(3));
        // System.out.println(queue.enQueue(4));
        // System.out.println(queue.Rear());
        // System.out.println(queue.isFull());
        // System.out.println(queue.deQueue());
        // System.out.println(queue.enQueue(4));
        // System.out.println(queue.Rear());

    }

    // Remove outermost Parantheses
    // public static String removeOuterParantheses(String s) {
    // Stack<Character> stack = new Stack<>();

    // for (char ch : s.toCharArray()) {
    // if (ch == '(') {
    // if (!stack.isEmpty() && stack.peek() == '(') {
    // stack.pop();
    // stack.push(ch);
    // } else {
    // stack.push(ch);
    // }
    // } else {
    // if (!stack.isEmpty() && stack.peek() != ')') {
    // stack.push(ch);
    // }
    // }
    // }

    // StringBuilder result = new StringBuilder();
    // while (!stack.isEmpty()) {
    // result.append(stack.pop());
    // }
    // return result.reverse().toString();
    // }

    // Remove Duplicates from string given.
    // public static String removeDuplicates(String s) { // abbaca
    // Stack<Character> stack = new Stack<>();

    // for (char ch : s.toCharArray()) {
    // if (!stack.isEmpty() && stack.peek() == ch) {
    // stack.pop();
    // } else {
    // stack.push(ch);
    // }
    // }

    // StringBuilder result = new StringBuilder();
    // while (!stack.isEmpty()) {
    // result.append(stack.pop());
    // }
    // return result.reverse().toString();
    // }

    // Delete middle element from stack.
    // private static void deleteMid(Stack<Integer> stack, int sizeOfStack) {
    // int mid = sizeOfStack / 2;
    // if (!stack.isEmpty()) {
    // if (sizeOfStack % 2 == 0) {
    // stack.remove(mid - 1);
    // } else {
    // stack.remove(mid);
    // }
    // }
    // }

    // Reverse First K elements of Queue.
    // public static void reverseKElements(Queue<Integer> queue, int k) {
    // // Using Stack
    // Stack<Integer> stack = new Stack<>();

    // // Dequeue the first K elements and push them onto stack.
    // for (int i = 0; i < k; i++) {
    // stack.push(queue.poll());
    // }

    // // Dequeue the first K elements from the queue and push them onto stack
    // while (!stack.isEmpty()) {
    // queue.add(stack.pop());
    // }

    // for (int i = 0; i < queue.size() - k; i++) {
    // queue.add(queue.poll());
    // }
    // }

    // protected int[] data;
    // private int ptr = -1;

    // public Questions1(int maxSize) {
    // this.data = new int[maxSize];
    // }

    // public void push(int item) {
    // if (ptr == data.length - 1) {
    // return;
    // }
    // data[++ptr] = item;
    // }

    // public int pop() {
    // if (ptr == -1) {
    // return -1;
    // }
    // return data[ptr--];
    // }

    // public void increment(int k, int val) {
    // for (int i = 0; i < Math.min(k, ptr + 1); i++) {
    // data[i] += val;
    // }
    // }

    // Valid Parantheses.
    public static boolean validParantheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
            if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // public static int minAddToMakeValid(String s) {
    // Stack<Character> stack = new Stack<>();
    // int count = 0;

    // for (char ch : s.toCharArray()) {
    // if (ch == '(') {
    // if (stack.isEmpty()) {
    // stack.push(ch);
    // count++;
    // } else {
    // stack.push(ch);
    // count++;
    // }
    // } else {
    // if (!stack.isEmpty() && stack.peek() == '(') {
    // stack.pop();
    // count--;
    // } else {
    // stack.push(ch);
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // public static String decodeString(String s) {
    // Stack<Integer> countStack = new Stack<>();
    // Stack<String> stringStack = new Stack<>();
    // StringBuilder currentString = new StringBuilder();
    // int k = 0;

    // for (char ch : s.toCharArray()) {
    // if (Character.isDigit(ch)) {
    // k = k * 10 + ch - '0';
    // } else if (ch == '[') {
    // countStack.push(k);
    // stringStack.push(currentString.toString());
    // currentString = new StringBuilder();
    // k = 0;
    // } else if (ch == ']') {
    // int count = countStack.pop();
    // StringBuilder temp = new StringBuilder(stringStack.pop());
    // for (int i = 0; i < count; i++) {
    // temp.append(currentString);
    // }
    // currentString = temp;
    // } else {
    // currentString.append(ch);
    // }
    // }
    // return currentString.toString();
    // }

    // public static boolean find132pattern(int[] nums) {
    // int n = nums.length;
    // int[] minLeft = new int[n];
    // minLeft[0] = nums[0];
    // for (int i = 1; i < n; i++) {
    // minLeft[i] = Math.min(minLeft[i - 1], nums[i]);
    // }

    // Stack<Integer> stack = new Stack<>();
    // for (int j = n - 1; j >= 0; j--) {
    // if (nums[j] > minLeft[j]) {
    // while (!stack.isEmpty() && stack.peek() <= minLeft[j]) {
    // stack.pop();
    // }
    // if (!stack.isEmpty() && stack.peek() < nums[j]) {
    // return true;
    // }
    // stack.push(nums[j]);
    // }
    // }
    // return false;
    // }

    // // Circular queue.
    // static class myCircularQueue {
    // List<Integer> queue;

    // public myCircularQueue() {
    // queue = new ArrayList<>();
    // }

    // public void pushFront(int val) {
    // queue.add(0, val);
    // }

    // public void pushMiddle(int val) {
    // int mid = queue.size() / 2;
    // if (queue.size() % 2 == 0) {
    // queue.add(mid, val);
    // } else {
    // queue.add(mid + 1, val);
    // }
    // }

    // public void pushBack(int val) {
    // queue.add(val);
    // }

    // public int popFront() {
    // if (queue.isEmpty()) {
    // return -1;
    // }
    // return queue.remove(0);
    // }

    // public int popMiddle() {
    // if (queue.isEmpty()) {
    // return -1;
    // }
    // int mid = queue.size() / 2;
    // if (queue.size() % 2 == 0) {
    // return queue.remove(mid - 1);
    // } else {
    // return queue.remove(mid);
    // }
    // }

    // public int popBack() {
    // if (queue.isEmpty()) {
    // return -1;
    // }
    // return queue.remove(queue.size() - 1);
    // }
    // }
}
