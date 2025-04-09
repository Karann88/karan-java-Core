package Recursion;

import java.util.ArrayList;

public class Recur4 {
    public static void main(String[] args) {
        // skip("", "baccad");
        // String ans = skip1("Karan");
        // System.out.println(ans);
        // System.out.println(skipApple("bacapplecdah"));
        // System.out.println(skipApp("bacapplecdah"));

        // subseq("", "abc");
        // subseqAscii("", "abc");

        ArrayList<String> list = subseqRet("", "abc");
        System.out.println(list);

        // System.out.println(subseqAsciiRet("", "abc"));
    }

    // static void skip(String p, String up) {
    // if (up.isEmpty()) {
    // System.out.println(p);
    // return;
    // }
    // char ch = up.charAt(0);

    // if (ch == 'a') {
    // skip(p, up.substring(1));
    // } else {
    // skip(p + ch, up.substring(1));
    // }
    // }

    // static String skip1(String up) {
    // if (up.isEmpty()) {
    // return "";
    // }

    // char ch = up.charAt(0);

    // if (ch == 'a') {
    // return skip1(up.substring(1));
    // } else {
    // return ch + skip1(up.substring(1));
    // }
    // }

    // static String skipApple(String up) {
    // if (up.isEmpty()) {
    // return "";
    // }

    // if (up.startsWith("apple")) {
    // return skipApple(up.substring(5));
    // } else {
    // return up.charAt(0) + skipApple(up.substring(1));
    // }
    // }

    // static String skipApp(String up) {
    // if(up.isEmpty()) {
    // return "";
    // }
    // char ch = up.charAt(0);

    // if (up.startsWith("app") && !up.startsWith("appel")) {
    // return skipApp(up.substring(3));
    // } else {
    // return ch + skipApp(up.substring(1));
    // }
    // }

    // static void subseq(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);

    //     subseq(p + ch, up.substring(1));
    //     subseq(p, up.substring(1));
    // }

    // static void subseqAscii(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);

    //     subseqAscii(p + ch, up.substring(1));
    //     subseqAscii(p, up.substring(1));
    //     subseqAscii(p + (ch + 0), up.substring(1));
    // }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    // static ArrayList<String> subseqAsciiRet(String p, String up) {
    //     if (up.isEmpty()) {
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     char ch = up.charAt(0);

    //     ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
    //     ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
    //     ArrayList<String> third = subseqAsciiRet(p + (ch+0), up.substring(1));

    //     first.addAll(second);
    //     first.addAll(third);

    //     return first;
    // }

    // static void subseq(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch = up.charAt(0);

    //     subseq(p + ch, up.substring(1));
    //     subseq(p, up.substring(1));
    // }
}
