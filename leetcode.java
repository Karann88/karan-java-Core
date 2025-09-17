import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Stack;

public class leetcode {
    // 7. Reverse Integer
    public static void main(String[] args) {
        // int num = 120;
        // int reversed = reverse(num);
        // System.out.println("Reversed number is: " + reversed);

        // String s = "Hello World";
        // System.out.println("Length of last word is: " + lengthOfLastWord(s));

        // int res = romanToInt("LVIII");
        // System.out.println(res);

        // String num = "1432219";
        // int k = 3;
        // String ans = removeKdigits("1432219", 3);
        // System.out.println(ans);

        // int[] asteroids = { 5, 10, -5 };
        // int[] ans = asteroidCollision(asteroids);
        // System.out.println("Asteroid Collision Result: " + Arrays.toString(ans));

        // int[] nums = { 1, 1, 0, 0, 1, 1, 0, 1 };
        // int k = 2;
        // int maxLength = longestOnes(nums, k);
        // System.out.println("Max consecutive ones with " + k + " flips: " +
        // maxLength);

        // int[] nums = { 1, 1, 2, 1, 1 };
        // int k = 3;
        // int ans = numberOfsubarrays(nums, k);
        // System.out.println("Number of subarrays with " + k + " distinct elements: " + ans);

        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        setZeroes(matrix);
        System.out.println("Matrix after setting zeroes:");
    }

    static long reversed = 0;

    private static int reverse(int num) {

        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            return reverse(num / 10);
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }

    public static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                return length;
            }
        return length;
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] last = new int[128];
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)]);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i + 1;
        }
        return res;
    }

    // Roman to Integer
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = getRomanValue(c);
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        return result;
    }

    private static int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    // https://leetcode.com/problems/remove-k-digits/
    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && k > 0 && (stack.peek() - '0') > (num.charAt(i) - '0')) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }

    // https://leetcode.com/problems/asteroid-collision/
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid)) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    // https://leetcode.com/problems/max-consecutive-ones-iii/
    public static int longestOnes(int[] nums, int k) {
        int start = 0, end = 0;
        int flip = 0, maxLength = 0;

        while (end < nums.length) {
            if (nums[end] == 0)
                flip++;
            while (flip > k) {
                if (nums[start] == 0)
                    flip--;
                start++;
            }
            end++;
            maxLength = Math.max(maxLength, end - start);
        }
        return maxLength;
    }

    // https://leetcode.com/problems/count-number-of-nice-subarrays/
    public static int numberOfsubarrays(int[] nums, int k) {
        int start = 0, end = 0;
        int ans = 0, odd = 0;

        while (end < nums.length) {
            if (nums[end] % 2 == 1)
                odd++;
            while (odd > k) {
                if (nums[start] % 2 == 1)
                    odd--;
                start++;
            }
            ans += end - start + 1;
            end++;
        }
        return ans;
    }

    // https://leetcode.com/problems/set-matrix-zeroes/
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] row = new int[n];
        int[] col = new int[m];

        // First pass to find all zeroes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1; // Mark the row
                    col[j] = 1; // Mark the column
                }
            }
        }

        // Second pass to set zeroes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
