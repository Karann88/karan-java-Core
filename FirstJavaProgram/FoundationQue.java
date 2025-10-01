package FirstJavaProgram;

import java.util.Scanner;

public class FoundationQue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("Sum = " + sum);

        // Convert temperature celsius into Fahrenheit
        System.out.print("Please enter temp in C: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
        input.close();
    }
}
