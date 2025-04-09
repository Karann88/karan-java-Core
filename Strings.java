import java.util.ArrayList;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String a = "Karan";
        // String b = "Karan";

        // // ==
        // System.out.println(a == b);

        // a ---> "Kunal"
        // b ---> "Kunal"
        // a == b will give false

        // a & b both are pointing to the same object
        // a == b will give true

        // Que:- How to create diff objects of same value.

        String name1 = new String("Karan");
        String name2 = new String("Karan");

        // It will give a == b false
        // System.out.println(name1 == name2); // It will care about objects, values and
        // location.

        // System.out.println(name1.equals(name2)); // It will only care about the
        // values.

        // System.out.println(name1.charAt(0));

        // System.out.println(56);
        Integer num = new Integer(56);
        System.out.println(num.toString());
        System.out.println(num);

        float a = 453.1274f;
        System.out.printf("Formatted number is %.2f", a);

        System.out.printf("Pie: %.3f", Math.PI);

        System.out.println();

        System.out.printf("Hello, My name is %s and I am %s", "Kunal", "cool");

        // Operators
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);
        // Integer will be converted to Integer that will call toString()

        System.out.println("Karan" + new ArrayList<>());
        System.out.println("Karan" + new Integer(56));

        String ans = new Integer(56) + " " + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'b');

        String series = "";
        for (int i = 0; i < 25; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;
        }
        System.out.println(series);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string to be reversed: ");
        // String s = sc.next();
        // // Reverse the string
        // String rev = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        // rev += s.charAt(i);
        // }
        // System.out.println(rev);

        int[] arr = { 5, 1, 7, 9, 2, 3 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
