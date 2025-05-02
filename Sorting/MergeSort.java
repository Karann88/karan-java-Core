package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 4, 2, 6 };
        // arr = mergeSort(arr);
        // System.out.println(Arrays.toString(arr));

        arr = divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first, second);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    // Another method of Merge Sort 
    // static void divide(int[] arr, int start, int end) {
    //     if (start >= end) {
    //         return;
    //     }
    //     int mid = start + (end - start) / 2;

    //     divide(arr, start, mid);
    //     divide(arr, mid + 1, end);

    //     conquer(arr, start, mid, end);
    // }

    // static void conquer(int[] arr, int start, int mid, int end) {
    //     int[] mix = new int[end - start + 1];

    //     int i = start;
    //     int j = mid + 1;
    //     int k = 0;

    //     while (i <= mid && j <= end) {
    //         if (arr[i] < arr[j]) {
    //             mix[k] = arr[i];
    //             i++;
    //         } else {
    //             mix[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while (i <= mid) {
    //         mix[k] = arr[i];
    //         i++;
    //         k++;
    //     }
    //     while (j <= end) {
    //         mix[k] = arr[j];
    //         j++;
    //         k++;
    //     }
    //     for (int l = 0; l < mix.length; l++) {
    //         arr[start + l] = mix[l];
    //     }
    // }

    public static int[] divide(int[] arr, int start, int end) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = divide(arr, start, mid);
        int[] right = divide(arr, mid + 1, end);

        return conquer(left, right);
    }

    public static int[] conquer(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
