package STACKSQUEUES.Questions;

public class CustomStack {
    protected int[] data;
    private int maxSize;
    private int ptr = -1;

    public CustomStack(int maxSize) {
        this.data = new int[maxSize];
    }

    public void push(int item) {
        if (ptr == data.length - 1) {
            return;
        }
        data[++ptr] = item;
    }

    public int pop() {
        if (ptr == -1) {
            return -1;
        }
        return data[ptr--];
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, maxSize); i++) {
            data[i] += val;
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.increment(2, 100);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
