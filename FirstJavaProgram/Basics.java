package FirstJavaProgram;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        int x = 10;
        x += (x++) + (++x) + x;
        System.out.println(x);
        // int a = 10;
        // if (a == 10) {
        // System.out.println("Hello World");
        // }
        // int count = 1;
        // while(count != 5) {
        // System.out.println(count);
        // count++;
        // }

        // for loop
        for (int count = 1; count != 5; count++) {
            System.out.println(count);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        // int rollno = input.nextInt();
        // System.out.println("Your roll number is " + rollno);

        // String name = input.next();
        // System.out.println(name);

        // float marks = input.nextFloat();
        // System.out.println(marks);
        sc.close();
    }
}
