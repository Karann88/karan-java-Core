package Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        // Write a function that prints hello world
        // message();
        // }
        // static void message() {
        // System.out.println("Hello World");
        // message1();
        // }

        // static void message1() {
        // System.out.println("Hello World");
        // message2();
        // }

        // static void message2() {
        // System.out.println("Hello World");
        // message3();
        // }

        // static void message3() {
        // System.out.println("Hello World");
        // message4();
        // }

        // static void message4() {
        // System.out.println("Hello World");

        // Write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    // static void print1(int n) {
    // System.out.println(n);
    // print2(2);
    // }

    // static void print2(int n) {
    // System.out.println(n);
    // print3(3);
    // }

    // static void print3(int n) {
    // System.out.println(n);
    // print4(4);
    // }

    // static void print4(int n) {
    // System.out.println(n);
    // print5(5);
    // }

    // static void print5(int n) {
    // System.out.println(n);
    // }

    static void print(int n) {
        if(n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);  // Recursion:- Fuction call itself
    }
}
