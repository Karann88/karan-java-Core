package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        // int[] arr = { 3, 5, 2, 1, 4 };
        int[] arr = { 3, 1, 3, 4, 2, 1 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

        // int ans = findDuplicate(arr);
        // System.out.println(ans);
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Find the duplicate number.
    // static int findDuplicate(int[] nums) {
    // int i = 0;
    // while (i < nums.length) {
    // int correct = nums[i] - 1;
    // if (nums[i] != nums[correct]) {
    // swap(nums, i, correct);
    // } else {
    // i++;
    // }
    // }
    // return nums[nums.length - 1];
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

}
