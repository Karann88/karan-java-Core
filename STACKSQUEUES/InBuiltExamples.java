package STACKSQUEUES;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(2);
        // stack.push(3);
        // stack.push(5);
        // stack.push(13);
        // stack.push(21);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(9);
        queue.add(98);
        queue.add(49);
        queue.add(35);
        queue.add(19);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
