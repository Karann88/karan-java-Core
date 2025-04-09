package Sorting.Questions;

import java.util.Arrays;

public class intersection {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = findIntersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    static int[] findIntersection(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                result[k] = nums1[i];
                k++;
                i++;
                j++;
            }
        }
        return Arrays.copyOf(result, k);
    }
}
