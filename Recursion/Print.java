package Recursion;

public class Print {
    public static void main(String[] args) {
        // fun(1);
        funRev(5);
    }

    // Printing 5,4,3,2,1
    static void fun(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        fun(n + 1);
    }

    // Printing 1,2,3,4,5
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    // Merge the both functions
    static void funBoth(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }
}
