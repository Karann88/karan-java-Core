package LeetCode.src;
import java.util.Arrays;

public class ImpQuestions {
    public static int[] plusOne(int[] digits) {
        // int[] result = {};
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum * 10 + digits[i];
        }
        sum += 1;
        String s = Integer.toString(sum);
        int[] result = new int[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = s.charAt(i) - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] ans = plusOne(new int[] { 1, 2, 3 });
        // System.out.println(Arrays.toString(plusOne(new int[] { 1, 2, 3 })));
        // System.out.println(mySqrt(11));
        // System.out.println(climbStairs(6));

    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return x;
        }
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid) {
                return mid;
            }
            if (mid < x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return end;
    }
}

        
    

