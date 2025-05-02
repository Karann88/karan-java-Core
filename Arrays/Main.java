package Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Karan Jangir");
        // System.out.println("Supender Singh");
        // System.out.println("Bharat Khandelwal");
        int size = sc.nextInt();

        // int marks[] = new int[n];
        // marks[0]=95;
        // marks[1]=97;
        // marks[2]=98;
        // System.out.println("Score in english " + marks[0]);
        // System.out.println("Score in physics " + marks[1]);
        // System.out.println("Score in chemistry " + marks[2]);

        // for(int i=0; i<n; i++) {
        // System.out.println("Scores obtained in sub "+(i+1)+" is " + marks[i]);
        // }
        // int numbers[] = new int[n];

        // for(int i=0; i<n; i++) {
        // numbers[i] = sc.nextInt();
        // }
        // for(int i=0; i<n; i++) {
        // System.out.println(numbers[i]);
        // }

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }

        // String names[] = new String[size];
        // for(int i=0; i<size; i++) {
        // names[i] = sc.next();
        // }
        // for(int i=0; i<names.length; i++) {
        // System.out.println("The "+ (i+1) + "st name is : " + names[i]);
        // }

        // int[] nums = new int[size];
        // for (int i = 0; i < nums.length; i++) {
        // nums[i] = sc.nextInt();
        // }
        // change(nums);
        // System.out.println(Arrays.toString(nums));
        // }

        // static void change(int[] arr) {
        // arr[0] = 100;
        // return;

        // 2-D array

        // int[][] arr = new int[3][]; // fill the rows are to be mandatory.

        // int[][] arr2D = {
        // { 1, 2, 3, 4 },
        // { 5, 6 },
        // { 7, 8, 9 },
        // };
        // for(int row=0; row<arr2D.length; row++) {
        // for(int col=0; col<arr2D[row].length; col++) {
        // System.out.print(arr2D[row][col] + " ");
        // }
        // System.out.println();
        // }
        // for(int row=0; row<arr2D.length; row++) {
        // System.out.println(Arrays.toString(arr2D[row]));
        // }

        // int[][] arr2D = new int[3][3];
        // System.out.println(arr2D.length); // no. of rows
        // input

        // for(int row=0; row<arr2D.length; row++) {
        // for(int col=0; col<arr2D[row].length; col++) {
        // arr2D[row][col] = sc.nextInt();
        // // System.out.print(arr2D[row][col] + " ");
        // }
        // System.out.println();
        // }

        // for(int row = 0; row<arr2D.length; row++) {
        // System.out.println(Arrays.toString(arr2D[row]));
        // }

        // for(int[] a : arr2D) {
        // System.out.println(Arrays.toString(a));
        // }

        // Array-List
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(67);
        // list.add(90);
        // list.add(45);
        // list.add(76);
        // list.add(34);
        // list.add(78);

        // System.out.println(list.contains(67));
        // list.set(0, 99);
        // list.remove(2);

        // System.out.println(list);

        // input
        // for(int i=0; i<5; i++) {
        // list.add(sc.nextInt());
        // }

        // Get item at any index
        // for(int i=0; i<5; i++) {
        // System.out.println(list.get(i)); // pass index here, list[index] syntax will
        // not work here.
        // }
        // System.out.println(list);

        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // intialisation
        // for(int i=0; i<3; i++) {
        // list.add(new ArrayList<>());
        // }

        // add elements
        // for(int i=0; i<3; i++) {
        // for(int j=0; j<3; j++) {
        // list.get(i).add(sc.nextInt());
        // }
        // }
        // System.out.println(list);

        // Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][3];

        // for(int i=0; i<arr.length; i++) {
        // for(int j=0; j<arr[i].length; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // for(int i=0; i<arr.length; i++) {
        // for(int j=0; j<arr.length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // int[][] num = new int[row][col];

        // for(int i=0; i<row; i++) {
        // for(int j=0; j<col; j++) {
        // num[i][j] = sc.nextInt();
        // }
        // }

        // int x = sc.nextInt();

        // for(int i=0; i<num.length; i++) {
        // for(int j=0; j<col; j++) {
        // if(num[i][j]==x){
        // System.out.println("x is found at index : ("+ i + ", " + j + ")");
        // }
        // }
        // }
    }
}
