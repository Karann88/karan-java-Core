package Practice;

import java.util.*;

public class QuesArray {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();

    // int[] arr = new int[size];

    // for(int i=0; i<size; i++) {
    // arr[i] = sc.nextInt();
    // }
    // for(int i=0; i<arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // System.out.println(Arrays.toString(arr));

    // int temp = arr[0];
    // arr[0] = arr[1];
    // arr[1] = temp;

    // for(int i=0; i<arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    // System.out.println(Arrays.toString(arr));

    // int[] arr = { 1, 4, 65, 33, 87 };
    // swap(arr, 1, 4);

    // System.out.println(Arrays.toString(arr));
    // }
    // static void swap(int[] arr, int index1, int index4) {
    // int temp = arr[index1];
    // arr[index1] = arr[index4];
    // arr[index4] = temp;
    // return;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the array : ");
        // int size = sc.nextInt();

        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 3;
        // arr[2] = 23;
        // arr[3] = 9;
        // arr[4] = 18;

        // System.out.println(maxRange(arr, 1, 3));
        // System.out.println(max(arr));
        // }

        // static int maxRange(int[] arr, int start, int end) {
        // int maxVal = arr[start];
        // for(int i=start; i<=end; i++) {
        // if(arr[i] > maxVal){
        // maxVal = arr[i];
        // }
        // }
        // return maxVal;
        // }

        // static int max(int[] arr) {
        // int maxVal = arr[0];
        // for(int i=1; i<arr.length; i++) {
        // if(arr[i] > maxVal) {
        // maxVal = arr[i];
        // }
        // }
        // return maxVal;
        // }

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // int[] arr = new int[size];

        // for (int i = 0; i < size; i++) {
        // arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(max(arr));
        // System.out.println(min(arr));
        // }

        // reverse(arr);
        // System.out.println(Arrays.toString(arr));

        // for(int i=0; i<arr.length; i++) {
        // System.out.print(arr[i] + ",");
        // }
        // }
        // static void reverse(int[] arr) {
        // int start = 0;
        // int end = arr.length-1;
        // while(start<end){
        // swap(arr, start, end);
        // start++;
        // end--;
        // }
        // }
        // static void swap(int[] arr, int index1, int index2) {
        // int temp = arr[index1];
        // arr[index1] = arr[index2];
        // arr[index2] = temp;
        // }

        // static void demo(int[] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // if (i % 2 == 0) {
        // System.out.println(arr[i]);
        // }
        // }
        // return;
        // }

        // static int max(int[] arr) {
        // int max = arr[0];
        // for(int i=1; i<arr.length; i++) {
        // if(arr[i] > max) {
        // max = arr[i];
        // }
        // else{
        // max = arr[i];
        // }
        // }
        // return max;
        // }

        // static int min(int[] arr) {
        // int min = arr[0];
        // for(int i=1; i<arr.length; i++) {
        // if(arr[i] < min){
        // min = arr[i];
        // }
        // }
        // return min;
        // }

        // int[] num = new int[size];

        // System.out.print("Enter the elements in num array : ");
        // for(int i=0; i<size; i++) {
        //     num[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(num));

        // int sum = 0;
        // for(int i=0; i<num.length; i++) {
        //     sum = sum + num[i];
        // }
        // System.out.print("The sum of all items of the array is : " + sum);

        // Spiral order matrix
        
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // for(int i=0; i<n; i++) {
        //     for(int j=0; j<m; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("The Spiral order matrix is : ");

        // int rowStart = 0;
        // int rowEnd = n-1;
        // int colStart = 0;
        // int colEnd = m-1;

        // while(rowStart<=rowEnd && colStart<=colEnd) {
        //     for(int col=colStart; col<=colEnd; col++) {
        //         System.out.print(matrix[rowStart][col]+" ");
        //     }
        //     rowStart++;

        //     for(int row=rowStart; row<=rowEnd; row++) {
        //         System.out.print(matrix[row][colEnd]+" ");
        //     }
        //     colEnd--;

        //     for(int col=colEnd; col>=colStart; col--) {
        //         System.out.print(matrix[rowEnd][col]+" ");
        //     }
        //     rowEnd--;

        //     for(int row=rowEnd; row>=rowStart; row--) {
        //         System.out.print(matrix[row][colStart]+" ");
        //     }
        //     colStart++;
        // }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++)  {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}