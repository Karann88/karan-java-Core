package LeetCode.src;
import java.util.ArrayList;
import java.util.Arrays;

public class maximumSum {
    public static void main(String[] args) {
        // int[] nums = {18, 43, 36, 13, 7};
        // int[] sums = sumOfDigits(nums);
        // System.out.println(Arrays.toString(sums));

        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] != nums[i - 1]) {
        // System.out.println("Found different numbers: " + nums[i] + " and " + nums[i -
        // 1]);
        // }

        // }
        int[] nums = { 5, 2, 3, 1 };
        System.out.println(Arrays.toString(nums));

        // int maxSum = findMaxSum(sums);System.out.println("Maximum sum of digits:
        // "+maxSum);
    }

    private static int[] sumOfDigits(int[] arr) {
        int[] sums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sums[i] = sumOfDigit(arr[i]);
        }
        return sums;
    }

    private static int sumOfDigit(int num) {
        return String.valueOf(num).chars().map(c -> c - '0').sum();
    }

    private static int findMaxSum(int[] sums) {
        int maxSum = Integer.MIN_VALUE;
        for (int sum : sums) {
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        // int n = nums.length;
        // int[] result = new int[n];
        // for (int i = 0; i < nums.length; i++) {
        //     result[i] = nums[i];
        // }
        // return result;
        return nums;
    }
}