package Strings;
import java.util.Arrays;

public class StringBuilder {
    public static void main(String[] args) {

        // StringBuilder is defined as only an object is made and changes in done only that object only.
        // StringBuilder builder = new StringBuilder();
        // // StringBuilder is mutable.
        // for(int i=0; i<26; i++) {
        //     char ch = (char)('a' + i);
        //     builder.append(ch);
        // }
        // System.out.println(builder.toString());
        // System.out.println(builder.append(" Java"));
        // System.out.println(builder.deleteCharAt(0));
        // System.out.println(builder.charAt(0));
        
        // builder.reverse();
        // System.out.println(builder);

        // String name = "Karan Jangid Hello World";
        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(name.toLowerCase());
        // System.out.println(name);
        // System.out.println(name.indexOf("a", 4));
        // System.out.println("    Karan    ".strip());
        // System.out.println(Arrays.toString(name.split(" ")));

        // Que:- Palindromic number.

        String str = null;
        System.out.println(isPalindrome(str));
       
    }
    static boolean isPalindrome(String str) {
        if(str == null || str.length() == 0) {
            return true;
        }

        str = str.toLowerCase();
        for(int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
