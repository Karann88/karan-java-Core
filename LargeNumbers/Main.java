package LargeNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BD();
    }

    static void BD() {
        double x = 0.03;
        double y = 0.04;
        // double ans = y - x;
        // System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        // System.out.println(ans);

        BigDecimal a = new BigDecimal("345678987654309.45678987");
        BigDecimal b = new BigDecimal("23456789875.987654323");

        // Operations
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        // Constants
        BigDecimal con = BigDecimal.ONE;
        
    }

    static void BI() {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(5);
        BigInteger B = BigInteger.valueOf(6); // Convert int/long to BI
        int c = B.intValue(); // Convert BI to int
        BigInteger C = new BigInteger("234679589765679");
        BigInteger X = new BigInteger("9876543235467");

        // Constants
        BigInteger D = BigInteger.TEN;

        // addition
        BigInteger s = A.add(B);
        // System.out.println(s);

        // System.out.println(C);
        // System.out.println(D);

        BigInteger s1 = C.add(X);

        BigInteger mul = C.multiply(X);

        BigInteger sub = C.subtract(X);

        BigInteger d = C.divide(X);

        BigInteger rem = C.remainder(X);

        if (X.compareTo(C) < 0) {
            System.out.println("Yes");
        }

        System.out.println(Factorial.fact(100));
    }
}
