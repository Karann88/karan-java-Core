package BinarySearch;

import java.util.Arrays;

public class Sqrt {
    public static void main(String[] args) {
        // int num = 2147483647;
        // boolean result = sqrt(num);
        // int result = sqrt(num);
        // System.out.println("Square root of " + num + " is " + result);

        // int[] arr = { 2, 7, 11, 15 };
        // int target = 22;
        // int[] result = twoSum(arr, target);
        // System.out.println(Arrays.toString(result));

        // int[][] arr = {
        // { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 28, 29, 37, 49 },
        // { 33, 34, 38, 50 }
        // };
        // System.out.println(Arrays.toString(search(arr, 37)));

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(Arrays.toString(search(matrix, 14)));

    }

    // static boolean sqrt(int num) {
    // if (num < 1) {
    // return false;
    // }
    // int start = 1;
    // int end = num;
    // while (start <= end) {
    // int mid = (start + end) / 2;

    // if (mid == num / mid) {
    // return true;
    // } else if (mid < num / mid) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return false;
    // }

    // static boolean sqrt(int num) {
    // if (num < 1) {
    // return false;
    // }
    // long start = 1;
    // long end = num;
    // while (start <= end) {
    // long mid = start + (end - start) / 2;
    // long square = mid * mid;
    // if (square == num) {
    // return true;
    // } else if (square < num) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return false;
    // }

    static int[] twoSum(int[] arr, int target) {
        if (arr.length < 2) {
            return new int[] { -1, -1 };
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[] { start, end };
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] { -1, -1 };
    }
}
