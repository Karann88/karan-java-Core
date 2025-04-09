// import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = { 4, 10, 2, 6, 1, 5 };
        int x = 6;

        boolean result = linearSearch(arr, x);
        System.out.println(result);
    }

    static boolean linearSearch(int[] arr, int x) {

        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == x) {
                return true;
            }
        }
        return false;

        // String name = "Karan";
        // char x = 'r';

        // System.out.println(name.toCharArray());
        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(search1(name, x));
        // System.out.println(search2(name, x));
        // }

        // static boolean search2(String str, char target) {
        // for(char ch : str.toCharArray()) {
        // if(ch==target){
        // return true;
        // }
        // }
        // return false;
        // }

        // static boolean search1(String str, char target) {
        // if(str.length() == 0) {
        // return false;
        // }
        // for(int i=0; i<str.length(); i++) {
        // if(target == str.charAt(i)){
        // return true;
        // }
        // }
        // return false;
        // }

        // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // int[] arr = new int[size];
        // for(int i=0; i<size; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int x = sc.nextInt();
        // int ans = searchInRange(arr, x);
        // System.out.println(x+" is found at index : " + ans);
        // System.out.println(max(arr));
        // }

        // static int searchInRange(int[] arr, int x) {
        // if(arr.length==0){
        // return -1;
        // }
        // for(int i=1; i<=4; i++) {
        // if(arr[i]==x){
        // return i;
        // }
        // }
        // return -1;
        // }
        // static int max(int[] arr) {
        // int max = arr[0];
        // for(int i=1; i<arr.length; i++) {
        // if(arr[i]>max){
        // max = arr[i];
        // }
        // }
        // return max;

        // int[][] arr = {
        // { 23, 4, 1 },
        // { 18, 12, 3, 9 },
        // { 78, 99, 34, 56 },
        // { 18, 12 }
        // };
        // int x = sc.nextInt();

        // int[] ans = search(arr, x);
        // System.out.println(Arrays.toString(ans));
        // System.out.println(max(arr));
        // }

        // static int[] search(int[][] arr, int x) {
        // for(int i=0; i<arr.length; i++) {
        // for(int j=0; j<arr[i].length; j++) {
        // if(arr[i][j]==x){
        // return new int[]{i, j};
        // }
        // }
        // }
        // return new int[]{-1, -1};
        // }

        // static int max(int[][] arr) {
        // int max = Integer.MIN_VALUE; // int max = arr[0][0]
        // for(int i=0; i<arr.length; i++) {
        // for(int j=0; j<arr[i].length; j++) {
        // if(arr[i][j] > max){
        // max = arr[i][j];
        // }
        // }
        // }
        // return max;

        // int[] nums = { 12, 345, 2, 6, 7896 };
        // System.out.println(findNumbers(nums));

        // System.out.println(digits(54637));
        // }

        // static int findNumbers(int[] nums) {
        // int count = 0;
        // for (int num : nums) {
        // if (even(num)) {
        // count++;
        // }
        // }
        // return count;
        // }

        // static boolean even(int num) {
        // int numofdigits = digits(num);
        // return numofdigits % 2 == 0;
        // }

        // static int digits(int num) {
        // int count = 0;
        // while (num > 0) {
        // count++;
        // num = num / 10;
        // }
        // return count;

        // int[][] acc2 = {
        // { 1, 5 },
        // { 7, 3 },
        // { 3, 5 }
        // };
        // int ans = richerMan(acc2);
        // System.out.println("The highest wealth of the person is : "+ans);
        // }

        // static int richerMan(int[][] acc2) {
        // int max = 0;
        // for(int i=0; i<acc2.length; i++) {
        // int sum = 0;
        // for(int j=0; j<acc2[i].length; j++) {
        // sum = acc2[i][j] + sum;
        // }
        // // System.out.println("The wealth of " +(i+1)+"st person is : "+sum);
        // if(sum>max){
        // max = sum;
        // }
        // }
        // return max;

        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // System.out.print("Please pick a number : ");
        // int pick = sc.nextInt();
        // int ans = guessNum(5, pick);
        // System.out.println(ans);
        // System.out.println(pick);
    // }

    // static int guessNum(int num, int pick) {
    //     if (num > pick) {
    //         return -1;
    //     } else if (num < pick) {
    //         return 1;
    //     }
    //     return 0;
    }
}
