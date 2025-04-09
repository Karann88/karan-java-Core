package BinarySearch;

import java.util.Scanner;

public class MountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = { 1, 2, 3, 5, 7, 6, 3, 2 };
        // int ans = peakValue(arr);
        // System.out.print(ans);
        
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = sc.nextInt();
        System.out.println(ans(arr, target));
    }

    static int peakValue(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Search in Mountain Array
    static int ans(int[] arr, int target) {
        int peak = peakValue(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
