package STACKSQUEUES;
import java.util.ArrayDeque;
import java.util.Deque;
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

        // Deque: double ended queue that allows insertion and deletion from both ends.
        // Implemented using LinkedList or ArrayDeque class in Java.
        // It has not capacity restrictions.
        // Faster than LinkedList & Stack.
        // 
        
        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.addFirst(6);
        deque.addLast(7);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}
