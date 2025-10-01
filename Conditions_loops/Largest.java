package Conditions_loops;

public class Largest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Q: Find the largest of the 3 numbers

        // int max = a;
        // if (b > max) {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }
        // System.out.println(max);

        // int max = 0;
        // if (a > b) {
        // max = a;
        // } else {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }
        // System.out.println(max);

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }

}
