package Recursion;

public class Recur {
    public static void main(String[] args) {
        // printNum(5);
        // fun(5);
        // funBoth(5);
        int[] arr = { 10, 20, 30, 40, 50 };
        int ans = binarySearch(arr, 30, 0, arr.length - 1);
        System.out.println(ans);

        // int ans = sumOfDigits(1342);
        // System.out.println(ans);
        // }
        // static void printNum(int n) {
        // if (n == 0) {
        // return;
        // }
        // System.out.println(n);
        // printNum(n - 1);
        // }

        // static void fun(int n) {
        // if (n == 0) {
        // return;
        // }
        // fun(n - 1);
        // System.out.println(n);
        // }

        // static void funBoth(int n) {
        // if (n == 0) {
        // return;
        // }
        // System.out.println(n);
        // funBoth(n - 1);
        // System.out.println(n);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, 0, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, arr.length - 1);
        // }

        // Que:- Sum of digits of a number.
        // static int sumOfDigits(int n) {
        // if (n == 0) {
        // return 0;
        // }
        // condition for product
        /*
         * if (n == n % 10) {
         * return n;
         * }
         */
        // return (n % 10) + sumOfDigits(n / 10);
        // }

        // Que:- Reverse a number.
        // System.out.println(rev1(1234));
        // }

        // static int rev1(int n) {
        // int digits = (int) (Math.log10(n)) + 1;
        // return helper(n, digits);
        // }

        // static int helper(int n, int digits) {
        // if (n % 10 == n) {
        // return n;
        // }
        // int rem = n % 10;
        // return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
        // }

        // Que:- Palindromic number.

        // rev2(1221);
        // System.out.println(palin(1221));
        // }

        // static boolean palin(int n) {
        // return n == rev2(n);
        // }

        // static int rev2(int n) {
        // int digits = (int) (Math.log10(n)) + 1;
        // return helper(n, digits);
        // }

        // static int helper(int n, int digits) {
        // if (n % 10 == n) {
        // return n;
        // }
        // int rem = n % 10;
        // return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
        // }

        // Que:- Count no. of zeros in a number.

        // int ans = count(30204);
        // System.out.println(ans);
        // }

        // static int count(int n) {
        // return helper(n, 0);
        // }

        // static int helper(int n, int c) {
        // if(n == 0) {
        // return c;
        // }
        // int rem = n % 10;
        // if(rem == 0) {
        // return helper(n / 10, c+1);
        // } else {
        // return helper(n / 10, c);
        // }
        // }

        // Que:- Number of steps to reduce a num to zero.

        // int ans = countSteps(14);
        // System.out.println(ans);
        // }
        // static int countSteps(int num) {
        // return helper(num, 0);
        // }
        // static int helper(int num, int c) {
        // if(num == 0) {
        // return c;
        // }
        // if(num % 2 == 0) {
        // return helper(num/2, c+1);
        // } else {
        // return helper(num - 1, c+1);
        // }
    }
}
