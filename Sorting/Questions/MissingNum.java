package Sorting.Questions;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        // int[] arr = { 3, 0, 2, 5, 4 };
        // insertion(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(missingNum(arr));

        int[] arr = { 0, 1 };
        System.out.println(missingNum(arr));
    }

    // static void insertion(int[] arr) {
    // for (int i = 0; i <= arr.length - 2; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (arr[j] < arr[j - 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // } else {
    // break;
    // }
    // }
    // }
    // }

    // static int missingNum(int[] arr) {
    // int i = 0;
    // while (i < arr.length) {
    // int next = i + 1;
    // if (arr[next] != arr[i] + 1) {
    // return arr[i] + 1;
    // } else {
    // i++;
    // }
    // }
    // return -1;

    // static int missingNum(int[] arr) {
    // int i = 0;
    // while (i < arr.length) {
    // int correct = arr[i];
    // if (arr[i] < arr.length && arr[i] != arr[correct]) {
    // swap(arr, i, correct);
    // } else {
    // i++;
    // }
    // }
    // for (int idx = 0; idx < arr.length; idx++) {
    // if (arr[idx] != idx) {
    // return idx;
    // }
    // }
    // return arr.length;
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    static int missingNum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
