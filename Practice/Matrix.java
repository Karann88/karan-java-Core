package Practice;

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr1[i][j] = sc.nextInt(); 
            }
        }
        System.out.println();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        addArrays(arr1, arr2, n, m);
        multiplyArrays(arr1, arr2, n, m);
        subtractArrays(arr1, arr2, n, m);
        equalMatrices(arr1, arr2, n, m);
    }

    static void addArrays(int[][] arr1, int[][] arr2, int n, int m) {
        System.out.println("The sum of two matrices are : " );
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int a = arr1[i][j] + arr2[i][j];
                System.out.print(a + " ");
            }
            System.out.println();
        }
        return;
    }

    static void multiplyArrays(int[][] arr1, int[][] arr2, int n, int m) {
        System.out.println("The product of two matrices are : ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr1[i][j]*arr2[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

    static void subtractArrays(int[][] arr1, int[][] arr2, int n, int m) {
        System.out.println("The difference of two matrices are : ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if((arr1[i][j] - arr2[i][j]) < 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(arr1[i][j] - arr2[i][j] + " ");
                }
            }
            System.out.println();
        }
        return;
    }

    static void equalMatrices(int[][] arr1, int[][] arr2, int n, int m) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr1[i][j] == arr2[i][j]){
                    System.out.print("Equal matrix.");
                }
                else{
                    System.out.print("Not equal");
                }
            }
        }
        return ;
    }
}
