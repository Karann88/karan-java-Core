package Functions_In_Java;
import java.util.*;

// import java.lang.Math;
public class Main {
    // public static void printMyname(String name) {
    // System.out.println(name);
    // return;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();

    // printMyname(name);
    // }

    // public static int calculateSum(int x, int y) {
    // int result = x + y;
    // return result;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the value of x: ");
    // int x = sc.nextInt();
    // System.out.println("Enter the value of y :");
    // int y = sc.nextInt();

    // int result = calculateSum(x, y);
    // System.out.println("Sum of two numbers is : " + result);
    // }

    // public static int calculateProduct(int a, int b) {
    // return a * b;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter first number : ");
    // int a = sc.nextInt();
    // System.out.println("Enter the second number : ");
    // int b = sc.nextInt();

    // System.out.println("The product of a and b is " + calculateProduct(a, b));
    // }

    // public static void calculateFactorial(int n) {
    // if(n<0) {
    // System.out.println("Invalid Number");
    // return;
    // }
    // int fac = 1;
    // for(int i=n; i>=1; i--) {
    // fac = fac * i;
    // }
    // System.out.println(fac);
    // return;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // calculateFactorial(n);
    // }

    // public static void printTable(int n) {
    // int table;
    // for(int i=1; i<=10; i++){
    // table = n * i;
    // System.out.println(table);
    // }
    // return;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the value of n :");
    // int n = sc.nextInt();

    // printTable(n);
    // }

    // public static void printEvenOdd(int n) {
    // if(n%2==0){
    // System.out.println("Even");
    // }
    // else {
    // System.out.println("Odd");
    // }
    // return;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the value of n : ");
    // int n = sc.nextInt();
    // printEvenOdd(n);
    // }

    // public static void checkPrimeNum(int n) {
    // int i;
    // for(i=2; i<n; i++) {
    // if(n%i==0){
    // System.out.println("Non-prime");
    // break;
    // }
    // }
    // if(i==n){
    // System.out.println("Prime");
    // }
    // return;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // checkPrimeNum(n);
    // }

    // public static void printAvg(int a, int b, int c) {
    // float average = (a+b+c)/3;
    // System.out.println("The average of three numbers is :" + average);
    // return;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    // printAvg(a, b, c);
    // }

    // public static int printSumofallOdd(int n) {
    // int sum = 0;
    // for(int i=1; i<=n; i++) {
    // if(i%2==0){
    // continue;
    // }
    // else{
    // sum = sum + i;
    // }
    // }
    // return sum;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();

    // int result = printSumofallOdd(n);
    // System.out.println("The sum of all odd numbers is " + result);
    // }

    // public static int printGreaternum(int a , int b) {
    // if(a>b){
    // return a;
    // }
    // else{
    // return b;
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int greater = printGreaternum(a, b);
    // System.out.println("The greater number is " + greater);
    // }

    // public static float calCirofCircle(float r) {
    // float pi = 3.14f;
    // float cir = 2*pi*r;
    // return cir;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // float r = sc.nextFloat();
    // float result = calCirofCircle(r);

    // System.out.println("The circumference of a circle is :" + result);
    // }

    // public static void printForVote(int age) {
    // if(age>18){
    // System.out.println("Can vote");
    // return;
    // }
    // else if(age==18){
    // System.out.println("Depend on other conditions");
    // }
    // else{
    // System.out.println("Cannot vote");
    // return;
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();

    // printForVote(age);
    // }

    // public static double calRaisedpower(double x, double n) {
    // double result = Math.pow(x, n);
    // return result;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // double x = sc.nextInt();
    // double n = sc.nextInt();

    // double c = calRaisedpower(x, n);
    // System.out.println("x to the power n is : " + c);
    // }

    // public static void printFib(int n1, int n2, int count) {
    // System.out.print(n1+" "+n2);
    // for(int i=1; i<=count; i++) {
    // int n3 = n1+n2;
    // System.out.print(" " + n3);
    // n1 = n2;
    // n2 = n3;
    // }
    // return;
    // }
    // public static void main(String[] args) {
    // int n1 = 0, n2 = 1, count=10;
    // printFib(n1, n2, count);
    // }

    // public static void main(String[] args) {
    // int positive = 0, negative = 0, zeros = 0;
    // System.out.println("Press 1 to continue & 0 to stop");
    // Scanner sc = new Scanner(System.in);
    // int input = sc.nextInt();
    // while(input==1) {
    // System.out.println("Enter your number : ");
    // int num = sc.nextInt();
    // if(num>0){
    // positive++;
    // }
    // else if(num<0){
    // negative++;
    // }
    // else{
    // zeros++;
    // }
    // System.out.println("Press 1 to continue & 0 to stop");
    // input = sc.nextInt();
    // }
    // System.out.println("Positives : "+positive);
    // System.out.println("negatives : "+negative);
    // System.out.println("Zeros : "+zeros);
    // }

    // public static void calculateGCD(int n1, int n2) {
    // System.out.println("GCD is : "+ n2);
    // return;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // while(a!=b){
    // if(a>b){
    // a = a-b;
    // }
    // else{
    // b = b-a;
    // }
    // }
    // calculateGCD(a, b);
    // }

    // public static void main(String[] args) {

    // printArmstrong();

    // }
    // public static void printArmstrong() {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int r, sum = 0, temp;
    // temp=n;
    // while(n>0){
    // r = n%10;
    // sum = (r*r*r) + sum;
    // n = n/10;
    // }
    // if(sum==temp) {
    // System.out.println("Armstrong");
    // }
    // else {
    // System.out.println("Not Armstrong");
    // }
    // }

    // public static void mygreet(int...v) {
    // System.out.println(Arrays.toString(v));
    // return;
    // }
    // static void multiple(int a, int b, int...v) {
    // System.out.println(Arrays.toString((),v));
    // return;
    // }
    // public static void main(String[] args) {
    // int[] arr = {1,2,3,4,5};
    // arr[0]=10;
    // mygreet(arr);
    // multiple(2, 5, 10,11,12,13,14);
    // }

    // static String demo(String name) {
    // String message = "Hello , " + name;
    // return message;
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your name : ");
    // String naam = sc.next();
    // String result = demo(naam);
    // System.out.println(result);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // swap(a, b);
    // System.out.println(a + " " + b);

    // String name = "Karan Jangid";
    // changename(name);
    // System.out.println(name);
    // }

    // static void changename(String naam) {
    // naam = "Virat Kohli";
    // return;
    // }
    // static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // return;
    // }

    // public static void main(String[] args) {
    // // Create an array
    // int[] arr = { 1, 3, 2, 45, 6 };
    // change(arr);
    // System.out.println(Arrays.toString(arr));
    // }
    // static void change(int[] nums) {
    // nums[0] = 99;
    // return;
    // }

    // public static void main(String[] args) {
    // int a = 10;
    // int b = 20;
    // String name = "Karan";
    // System.out.println(a);
    // System.out.println(name);
    // {
    // a = 78; // reassign the original ref variable to some other value
    // int c = 01;
    // name = "Kiran";
    // System.out.println(a);
    // System.out.println(c);
    // System.out.println(name);
    // }
    // System.out.println(a);
    // System.out.println(name );
    // }

    // static int x = 90; // This will be shadowed at line 379
    // public static void main(String[] args) {
    // System.out.println(x); // 90
    // int x = 45;
    // System.out.println(x); // 45
    // fun();
    // }
    // static void fun() {
    // System.out.println(x);
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     System.out.println(fun(a, b, c));
    //     System.out.println(fun(b, c));
    // }

    // static int fun(int num1, int num2) {
    //     return num1 + num2;
    // }

    // static int fun(int num1, int num2, int num3) {
    //     int result = num1 + num2 + num3;
    //     return result;
    // }

    
}
