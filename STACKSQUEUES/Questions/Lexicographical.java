package STACKSQUEUES.Questions;

import java.util.Arrays;

public class Lexicographical {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(smallestLexicographical(s));
    }

    public static String smallestLexicographical(String s) {
        char[] ch = s.toCharArray();
        // sort ch
        Arrays.sort(ch);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            // char smallestOrder = ch[i];
            result.append(ch[i]);
        }
        return result.toString();
    }
}
