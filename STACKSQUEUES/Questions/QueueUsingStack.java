package STACKSQUEUES.Questions;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

    // Queue Using stack Removal efficient.
    class QueueUsingStackRemove {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueUsingStackRemove() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            first.push(item);
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }

        public int remove() throws Exception {
            return first.pop();
        }

        public int peek() throws Exception {
            return first.peek();
        }

        public boolean isEmpty() {
            return first.isEmpty();
        }
    }

    public static void main(String[] args) throws Exception {
        QueueUsingStack queue = new QueueUsingStack();
        // QueueUsingStackRemove queue = new QueueUsingStackRemove();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.remove());
    }
}
