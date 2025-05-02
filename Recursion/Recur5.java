package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recur5 {
    public static void main(String[] args) {

        // permutation("", "abc");
        System.out.println(permutationList("", "abc"));
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            permutation(f + ch + s, up.substring(1));
        }
    }

    static List<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>(); 
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> result = new ArrayList<>();  

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            result.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return result; 
    }
}
