package Recursion;

public class Questions {
    public static void main(String[] args) {

        // System.out.println(fact(5));
        // System.out.println(sumOfDigits(1342));
        // reverse(1342);
        // System.out.println(sum);
        // palin(151);
        // System.out.println(sum);
        // System.out.println(countZeros(30204, 0));
        int[] arr = { 2, 3, 3, 1, 4, 2, 1 };
        System.out.println(ans(arr));
    }
    // static int fact(int n) {
    // if(n == 0 || n == 1) {
    // return 1;
    // }
    // return n * fact(n - 1);
    // }

    // Sum of digits

    // static int sumOfDigits(int n) {
    // if (n == 0) {
    // return 0;
    // }
    // return (n % 10) + sumOfDigits(n / 10);
    // }

    // Reverse the digits

    // static int sum = 0;

    // static void reverse(int n) {
    // if (n == 0) {
    // return;
    // } else {
    // int rem = n % 10;
    // sum = sum * 10 + rem;
    // reverse(n / 10);
    // }
    // }

    // Count no. of zeros in a number.

    // static int countZeros(int n, int count) {
    // int rem = n % 10;
    // if(rem == 0) {
    // countZeros(n / 10, count++);
    // } else {
    // countZeros(n / 10, count);
    // }
    // }

    // Que:- Find the unique number in the array.
    static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
