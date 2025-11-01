package CollectionFW;

import java.util.LinkedList;
import java.util.Stack;

// Stack is a class that implements a last-in-first-out (LIFO) stack of objects.
// It extends Vector class and is present in java.util package.
// It contains methods like push(), pop(), peek(), empty(), search() etc.
// Stack is synchronized and is thread safe.

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);  // [10, 20, 30]
        System.out.println(stack.peek()); // 30
        System.out.println(stack.pop()); // 30
        System.out.println(stack); // [10, 20]
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.search(10)); // 2
        System.out.println(stack.search(50)); // -1
        System.out.println(stack.size()); // 2

        stack.remove(1);
        System.out.println(stack); // [10]
        

        // LinkedList as Stack
        LinkedList<Integer> list = new LinkedList<>();
        list.push(10);
        list.push(20);  // Push: is a method that insert at front of the list.
        list.push(30);
        System.out.println(list);  // [30, 20, 10]
        list.pop();  // Pop: is a method that removes and returns the first element of the list.
        list.peek(); // Peek: is a method that returns the first element of the list without removing it.
        list.size(); // Size: is a method that returns the number of elements in the list.
        list.remove(); // Remove: is a method that removes the first element of the list.
        list.isEmpty(); // isEmpty: is a method that checks if the list is empty or not.
        list.getLast(); // getLast: is a method that returns the last element of the list.
    }
}
