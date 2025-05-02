package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        // for (int i = 0; i < 11; i++) {
        // System.out.println(fiboFormula(i));
        // }
        System.out.println(fibo(8));
    }

    // static int fiboFormula(int n) {
    // return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    // }

    // static int fib(int n) {
    // if (n == 0 || n == 1) {
    // return n;
    // }
    // return fib(n - 1) + fib(n - 2);
    // }

    // Fibonacci series without recursion
    static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}