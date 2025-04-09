package Sorting.Questions;

// import java.util.Arrays;

public class minSubArrayLen {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        System.out.println(minSubArrayLen(arr, target));
    }

    static int minSubArrayLen(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target <= 0) {
            return 0;
        }

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        return (minLen != Integer.MAX_VALUE) ? minLen : 0;
    }
}
