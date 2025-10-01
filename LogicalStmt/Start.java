package LogicalStmt;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = fac(5);
        System.out.println(res);

        // int i;
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // for (i = a; i <= b; i++) {
        // int j;
        // for (j = 2; j < i; j++) {
        // if (i % j == 0) {
        // break;
        // }
        // }
        // if (i == j) {
        // System.out.println(j);
        // }
        // }

        // Fibonacci series

        // int n1=0, n2=1, n3, count=10;
        // System.out.print(n1+" "+n2);
        // for(int i=1; i<=count; i++){
        // n3=n1+n2;
        // System.out.print(" "+n3);
        // n1=n2;
        // n2=n3;
        // }

        // Rreverse number program

        // System.out.print("Enter the value of n: ");
        // int n = 4321;
        // int reverse = 0;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // reverse = reverse * 10 + lastdigit;
        // n = n / 10;
        // }
        // System.out.println(reverse);

        // Palindrome Program

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int temp;
        // temp = n;
        // int sum = 0;
        // while(n>0) {
        // int r = n%10;
        // sum = (sum*10) + r;
        // n = n/10;
        // }
        // if(temp==sum){
        // System.out.println("Palindrome");
        // }
        // else {
        // System.out.println("Not Palindrome");
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r,sum=0;
        // int temp = n;
        // while(n>0) {
        // r = n%10;
        // sum = (r*r*r)+sum;
        // n = n/10;
        // }
        // if(temp==sum) {
        // System.out.println("Armstrong");
        // }
        // else {
        // System.out.println("Not armstrong");
        // }

        // Factorial program

        // int n = sc.nextInt();
        // int fac=1;
        // for(int i=1; i<=n; i++) {
        // fac = fac * i;
        // }
        // System.out.print("Factorial of "+n+" is:"+fac);

        // Print ASCII value

        // int ch1 = 'a';
        // int ch2 = 'b';

        // int asciivalue1 = ch1;
        // int asciivalue2 = ch2;

        // System.out.println("The ASCII value of a is "+ ch1);
        // System.out.println("The ASCII value of b is "+ ch2);

        // System.out.print("Enter a character: ");
        // char ch = sc.next().charAt(0);
        // int asciiValue = ch;
        // System.out.print("ASCII value of "+ch+" is "+asciiValue);

        // for(int i=0; i<=255; i++) {
        // System.out.println("The ascii value of "+(char)i+" = "+i);
        // }

        // System.out.print("Enter the value of base : ");
        // int base = sc.nextInt();
        // System.out.print("Enter the value of power : ");
        // int power = sc.nextInt();

        // int result = 1;
        // for (int i = 0; i < power; i++) {
        // result *= base;
        // }
        // System.out.println(result);

        /*
         * System.out.print("Enter the value of ch : ");
         * int ch = sc.nextInt();
         * 
         * switch (ch) {
         * case 1:
         * System.out.println("Good Morning");
         * break;
         * 
         * case 2:
         * System.out.println("Good afternoon");
         * break;
         * 
         * case 3:
         * System.out.println("Good evening");
         * break;
         * 
         * case 4:
         * System.out.println("Good Night");
         * break;
         * 
         * default:
         * System.out.println("Something special coming soon");
         * break;
         * }
         */

        // print 4 8 13 19 26
        /*
         * int a = 4;
         * int i = 4;
         * while (a <= 26) {
         * System.out.println(a);
         * a += i;
         * i++;
         * }
         */

        //  char ch = 'a';
        //  System.out.println(ch + 0);

        
    }
    static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }
}
