package STACKSQUEUES.Stacks;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        // DynamicStack stack = new DynamicStack(5);
        CustomStack stack = new DynamicStack(5);

        stack.push(43);
        stack.push(2);
        stack.push(21);
        stack.push(9);
        stack.push(18);
        stack.push(22);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // System.out.println(stack.peek());
        // System.out.println(stack.peek());
    }
}
