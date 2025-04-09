package Practice;

import java.util.*;

public class sorting {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // int[] numbers = new int[size];
        // for (int i = 0; i < size; i++) {
        // numbers[i] = sc.nextInt();
        // }
        // for(int i=0; i<numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        // System.out.println();
        // System.out.println(Arrays.toString(numbers));

        // Sort in ascending order.

        // for (int i = 0; i < numbers.length; i++) {
        // for (int j = i + 1; j < numbers.length; j++) {
        // if (numbers[i] > numbers[j])

        // sorting Descending order
        
        // if (numbers[i] < numbers[j]) {
        // int temp = numbers[i];
        // numbers[i] = numbers[j];
        // numbers[j] = temp;
        // }
        // }
        // }
        // System.out.println(Arrays.toString(numbers));

        // int[] num = { 12, 21, 3, 11, 76 };
        // System.out.println(max(num));
        // }

        // static int max(int[] num) {
        // int max = num[0];
        // for (int i = 1; i < num.length; i++) {
        // if (num[i] > max) {
        // max = num[i];
        // }
        // }
        // return max;
        // }

        // Program to print second largest number in array.

    //     int[] a = { 1, 2, 5, 6, 3, 2 };
    //     int[] b = { 44, 66, 99, 77, 33, 22, 55 };
        
    //     int result = getSecondLargest(a, a.length);
    //     int res = getSecondLargest(b, b.length);
    //     System.out.println("Second Largest number " + result);
    //     System.out.println("Second largest number " + res);

    // }

    // static int getSecondLargest(int[] a, int size) {
    //     for (int i = 0; i < size; i++) {
    //         for (int j = i + 1; j < size; j++) {
    //             if (a[i] > a[j]) {
    //                 int temp = a[i];
    //                 a[i] = a[j];
    //                 a[j] = temp;
    //             }
    //         }
    //     }
    //     return a[size - 2];

    // Program to print Second Smallset number in array.

    // int[] arr1 = {1,2,5,6,3,2};
    // int[] arr2 = {44,66,99,77,33,22,55};

    
    // System.out.println("Second smallest " + getSecondSmallest(arr1, arr1.length));
    // System.out.println("Second smallest " + getSecondSmallest(arr2, arr2.length));
    // }
    // static int getSecondSmallest(int[] arr, int size) {
    //     for(int i=0; i<size; i++) {
    //         for(int j=i+1; j<size; j++) {
    //             if(arr[i] < arr[j]){
    //                 int temp = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    //     return arr[size-2];

    ArrayList<Integer> list = new ArrayList<>(5);
    list.add(43);
    list.add(21);
    list.add(11);
    list.add(89);
    list.add(32);
    list.add(76);
    list.add(52);
    list.add(4);
    list.add(65);

    list.set(3, 11);
    list.remove(3);
    list.remove(6);
    System.out.println(list);
    }
}
