package BinarySearch;

// import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

// import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        // System.out.println("Karan Jangir");
        // System.out.println("Supender Singh");
        // System.out.println("Bharat Khnadelwal");
        // Scanner sc = new Scanner(System.in);

        // int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        // int target = sc.nextInt();
        // int ans = binarySearch(arr, target);
        // System.out.println(ans);

        // }

        // static int binarySearch(int[] arr, int target) {
        // int start = 0;
        // int end = arr.length - 1;

        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // if (target < arr[mid]) {
        // end = mid - 1;
        // } else if (target > arr[mid]) {
        // start = mid + 1;
        // } else {
        // return mid;
        // }
        // }
        // return -1;

        // int ans = binarySearch(arr, target);
        // System.out.println(ans);
        // }

        // static int binarySearch(int[] arr, int target) {
        // int start = 0;
        // int end = arr.length - 1;

        // boolean isAscending;
        // if (arr[start] < arr[end]) {
        // isAscending = true;
        // } else {
        // isAscending = false;
        // }

        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // if (arr[mid] == target) {
        // return mid;
        // } else {
        // if (isAscending == true) {
        // if (arr[mid] > target) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // } else {
        // if (arr[mid] > target) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // }
        // }
        // }
        // return -1;

        // Que:- Program to find out Ceiling Number in the given array.

        /*
         * int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
         * 
         * System.out.print("Enter target value : ");
         * int target = sc.nextInt();
         * int ans = ceilingNumber(arr, target);
         * System.out.println(ans);
         * }
         * 
         * static int ceilingNumber(int[] arr, int target) {
         * int start = 0;
         * int end = arr.length - 1;
         * 
         * while (start <= end) {
         * 
         * int mid = start + (end - start) / 2;
         * if (arr[mid] > target) {
         * end = mid - 1;
         * if (target < arr[end] && target > arr[end - 1]) {
         * return arr[end];
         * } else if (target > arr[end] && target < arr[end + 1]) {
         * return arr[end + 1];
         * }
         * } else if (arr[mid] < target) {
         * start = mid + 1;
         * if (target > arr[start] && target < arr[start + 1]) {
         * return arr[start + 1];
         * } else if (target < arr[start] && target > arr[start - 1]) {
         * return arr[start];
         * }
         * } else {
         * return arr[mid];
         * }
         * }
         * return -1;
         */

        // int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        // int target = sc.nextInt();
        // int ans = ceilingNumber(arr, target);
        // System.out.println(ans);
        // }
        // static int ceilingNumber(int[] arr, int target) {
        // int start = 0;
        // int end = arr.length-1;

        // while(start<=end) {
        // int mid = start + (end-start)/2;
        // if(arr[mid]>target) {
        // end = mid-1;
        // }
        // else if(arr[mid]<target) {
        // start = mid+1;
        // }
        // else {
        // return arr[mid];
        // }
        // }
        // return arr[start];
        // return arr[end];

        // Que:- Find the next greater letter

        // char[] letters = { 'c', 'd', 'e', 'o', 's', 'u', 'w' };
        // char target = 'd';
        // char ans = nextGreaterLetter(letters, target);
        // System.out.println(ans);
        // }

        // static char nextGreaterLetter(char[] arr, char target) {
        // if (target >= arr[arr.length - 1]) {
        // return arr[0];
        // }
        // int start = 0;
        // int end = arr.length - 1;
        // while (start <= end) {
        // int mid = start + (end - start) / 2;
        // if (arr[mid] > target) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // }
        // return arr[start % arr.length];

        // Que:- Find the first and last index of the duplicate target element.

        int[] letters = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(search(letters, target)));
    }

    static int[] search(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0] = binarySearch(arr, target, true);
        ans[1] = binarySearch(arr, target, false);

        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

        // Que:- Find position of an element in a sorted array of infinite numbers.
        // int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        // int target = 100;
        // System.out.println(ans(arr, target));
        // }

        // static int ans(int[] arr, int target) {
        // int start = 0;
        // int end = 1;

        // condition for the target to lie in the range
        // while (target > arr[end]) {
        // int temp = end + 1; // this is my new start
        // double the box value
        // end = previous end + sizeofbox*2
        // end = end + (end - start + 1) * 2;
        // start = temp;
        // }
        // return binarySearch(arr, target, start, end);
        // }

        // static int binarySearch(int[] arr, int target, int start, int end) {
        // while (start <= end) {
        // int mid = start + (end - start) / 2;
        // if (arr[mid] > target) {
        // end = mid - 1;
        // } else if (arr[mid] < target) {
        // start = mid + 1;
        // } else {
        // return mid;
        // }
        // }
        // return -1;

        // int[] arr = { 1, 2, 3, 5, 7, 6, 3, 2 };

        // int ans = peakValue(arr);
        // System.out.print(ans);
        // }

        // static int peakValue(int[] arr) {
        // int start = 0;
        // int end = arr.length - 1;
        // while (start < end) {
        // int mid = start + (end - start) / 2;
        // if (arr[mid] > arr[mid+1]) {
        // end = mid;
        // } else {
        // start = mid + 1;
        // }
        // }
        // return start;

        // Que:- Search an element in mountain array.

        // int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        // int target = sc.nextInt();
        // int ans = ans(arr, target);
        // System.out.println(ans);
        // }

        // static int ans(int[] arr, int target) {
        // int peak = peakValue(arr);
        // int firstTry = binarySearch(arr, target, 0, peak);
        // if (firstTry != -1) {
        // return firstTry;
        // }
        // return binarySearch(arr, target, peak + 1, arr.length - 1);
        // }

        // static int peakValue(int[] arr) {
        // int start = 0;
        // int end = arr.length - 1;
        // while (start < end) {
        // int mid = start + (end - start) / 2;
        // if (arr[mid] > arr[mid + 1]) {
        // end = mid;
        // } else {
        // start = mid + 1;
        // }
        // }
        // return start;
        // }

        // static int binarySearch(int[] arr, int target, int start, int end) {
        // boolean isAscending = arr[start] < arr[end];
        // while (start <= end) {
        // int mid = end + (end - start) / 2;

        // if (arr[mid] == target) {
        // return mid;
        // }
        // if (isAscending) {
        // if (target < arr[mid]) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // } else {
        // if (target > arr[mid]) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // }
        // }
        // return -1;

        // Rotated duplicate sorted array Binary Search.

        // If elements at middle, start, end are equal then just skip the duplicates
        // if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
        // skip the duplicates
        // NOTE: What if these elements at start and end were the pivot ?
        // check if start is pivot
        // if (arr[start] > arr[start + 1]) {
        // return start;
        // }
        // start++;

        // if (arr[end] < arr[end - 1]) {
        // return end - 1;
        // }
        // end--;
        // } 
        // left side is sorted, so pivot should be in right
        // else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] >
        // arr[end])) {
        // start = mid + 1;
        // } else {
        // end = mid - 1;
        // }
        // }
        // return -1;

        // int[][] arr = {
        // { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 28, 29, 37, 49 },
        // { 33, 34, 38, 50 }
        // };
        // System.out.println(Arrays.toString(search(arr, 37)));
        // }

        // static int[] search(int[][] matrix, int target) {
        // int row = 0;
        // int col = matrix.length - 1;
        // while (row < matrix.length && col >= 0) {
        // if (matrix[row][col] == target) {
        // return new int[] { row, col };
        // }
        // if (matrix[row][col] < target) {
        // row++;
        // } else {
        // col--;
        // }
        // }
        // return new int[] { -1, -1 };
        // }

        // int[][] matrix = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 }
        // };
        // System.out.println(Arrays.toString(search(matrix, 14)));
        // }

        // static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int
        // target) {
        // while (cStart <= cEnd) {
        // int mid = cStart + (cEnd - cStart) / 2;
        // if (matrix[row][mid] == target) {
        // return new int[] { row, mid };
        // }
        // if (matrix[row][mid] < target) {
        // cStart = mid + 1;
        // } else {
        // cEnd = mid - 1;
        // }
        // }
        // return new int[] { -1, -1 };
        // }

        // static int[] search(int[][] matrix, int target) {
        // int rows = matrix.length;
        // int cols = matrix[0].length; // be cautious, matrix may be empty.

        // if (rows == 1) {
        // return binarySearch(matrix, 0, 0, cols - 1, target);
        // }

        // int rStart = 0;
        // int rEnd = rows - 1;
        // int cMid = cols / 2;

        // Run the loop till two rows are remaining
        // while (rStart < (rEnd - 1)) {
        // int mid = rStart + (rEnd - rStart) / 2;
        // if (matrix[mid][cMid] == target) {
        // return new int[] { mid, cMid };
        // }
        // if (matrix[mid][cMid] < target) {
        // rStart = mid;
        // } else {
        // rEnd = mid;
        // }
        // }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        // if (matrix[rStart][cMid] == target) {
        // return new int[] { rStart, cMid };
        // }
        // if (matrix[rStart + 1][cMid] == target) {
        // return new int[] { rStart + 1, cMid };
        // }

        // search in 1st half
        // if (matrix[rStart][cMid - 1] >= target) {
        // return binarySearch(matrix, rStart, 0, cMid - 1, target);
        // }

        // search in 2nd half
        // if (matrix[rStart][cMid + 1] <= target && matrix[rStart][cols - 1] >= target)
        // {
        // return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        // }

        // // search in 3rd half
        // if (matrix[rStart + 1][cMid - 1] >= target) {
        // return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        // }
        // // search in 4th half
        // else {
        // return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        // }
    }
}
