package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecuRsion {
    public static void main(String[] args) {
        // int num = 14;
        // System.out.println(numberOfSteps(num, 0));

        // double x = 2.00000;
        // System.out.println(myPow(x, 10));

        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }

    public static int numberOfSteps(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return numberOfSteps(num / 2, count++);
        }
        return numberOfSteps(num - 1, count++);
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return Math.pow(x, n);
    }

    // public static List<List<Integer>> threeSum(int[] nums) {
    // Arrays.sort(nums);
    // List<List<Integer>> result = new ArrayList<>();
    // // List<Integer> first = new ArrayList<>();
    // for (int i = 0; i < nums.length - 2; i++) {
    // if (i > 0 && nums[i] == nums[i - 1]) {
    // continue;
    // }
    // int j = i + 1;
    // int k = nums.length - 1;
    // while (j < k) {
    // int sum = nums[i] + nums[j] + nums[k];
    // if (sum == 0) {
    // result.add(Arrays.asList(nums[i], nums[j], nums[k]));
    // while (j < k && nums[j] == nums[j + 1]) {
    // j++;
    // }
    // while (j < k && nums[k] == nums[k - 1]) {
    // k--;
    // }
    // j++;
    // k--;
    // } else if (sum < 0) {
    // j++;
    // } else {
    // k--;
    // }
    // }
    // }
    // return result;
    // }

    // for (int j = i + 1; j < nums.length - 1; j++) {
    // for (int k = j + 1; k < nums.length; k++) {
    // int sum = nums[i] + nums[j] + nums[k];
    // if (sum == 0) {
    // first.add(nums[j]);
    // first.add(nums[k]);
    // first.add(nums[i]);
    // ans.add(first);
    // }
    // }
    // }
    // }
    // return ans;
    // }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    } else if (sum < 0) {
                        j++;
                    } else {
                        k++;
                    }
                }
            }
        }
        return result;
    }
}
