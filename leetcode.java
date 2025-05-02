public class leetcode {
    // 7. Reverse Integer
    public static void main(String[] args) {
        // int num = 120;
        // int reversed = reverse(num);
        // System.out.println("Reversed number is: " + reversed);

        // String s = "Hello World";
        // System.out.println("Length of last word is: " + lengthOfLastWord(s));

        int res = romanToInt("LVIII");
        System.out.println(res);
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
}
