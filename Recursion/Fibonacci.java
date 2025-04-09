package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(fiboFormula(i));
        // }
        System.out.println(fib(4));
    }

    static int fiboFormula(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}