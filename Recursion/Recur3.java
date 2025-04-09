package Recursion;

import java.util.Arrays;

public class Recur3 {
    public static void main(String[] args) {
        int[] arr = { 32, 64, 12, 22, 11, 45 };
        // int n = 4;
        // for(int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }
        // Solving it with Recursion.
        pattern(4, 0);
        // pattern1(4, 0);
        // bubbleSort(arr, arr.length - 1, 0);
        // System.out.println(Arrays.toString(arr));
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void pattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print(" *");
            pattern(r, c + 1);
        } else {
            System.out.println();
            pattern(r - 1, 0);
        }
    }

    // static void pattern1(int r, int c) {
    // if (r == 0) {
    // return;
    // }
    // if (r > c) {
    // pattern1(r, c + 1);
    // System.out.print(" *");
    // } else {
    // pattern1(r - 1, 0);
    // System.out.println();
    // }
    // }

    // static void bubbleSort(int[] arr, int i, int j) {
    // if (i == 0) {
    // return;
    // }
    // if (i > j) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // bubbleSort(arr, i, j + 1);
    // } else {
    // bubbleSort(arr, i - 1, 0);
    // }
    // }

    // static void selection(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // int last = arr.length - i - 1;
    // int maxIndex = getMaxIndex(arr, 0, last);
    // swap(arr, maxIndex, last);
    // }
    // }

    // static int getMaxIndex(int[] arr, int start, int end) {
    // int max = start;
    // for (int i = start; i <= end; i++) {   // int[] arr = { 32, 64, 12, 22, 11, 45
    // }
    // if (arr[i] > arr[max]) {
    // max = i;
    // }
    // }
    // return max;
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    static void selection(int[] arr, int i, int j, int max) {
        if (i == 0) {
            return;
        }
        if (i > j) {
            if (arr[j] > arr[max]) {        // int[] arr = { 32, 64, 12, 22, 11, 45 }
                selection(arr, i, j + 1, j);
            } else {
                selection(arr, i, j + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[i - 1];
            arr[i - 1] = temp;
            selection(arr, i - 1, 0, 0);
        }
    }
}