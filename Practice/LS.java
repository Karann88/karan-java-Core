package Practice;

import java.util.Arrays;
// import java.util.Arrays;
import java.util.Scanner;

public class LS {
    public static void main(String[] args) {
        // Find the next greater letter
        // char[] letters = { 'c', 'd', 'e', 'o', 's', 'u', 'w' };
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of target: ");
        // char target = sc.next().charAt(0);
        // System.out.println(nextGreaterLetter(letters, target));
        // }

        // static char nextGreaterLetter(char[] arr, char target) {
        // // if (target >= arr[arr.length - 1]) {
        // // return arr[0];
        // // }

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
        // int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of target: ");
        // int target = sc.nextInt();
        // System.out.println(Arrays.toString(binarySearch(arr, target)));
        // }

        // static int[] binarySearch(int[] arr, int target) {
        // int[] ans = { -1, -1 };
        // ans[0] = search(arr, target, true);
        // ans[1] = search(arr, target, false);

        // return ans;
        // }

        // static int search(int[] arr, int target, boolean findStartIndex) {
        // int ans = -1;
        // int start = 0;
        // int end = arr.length - 1;

        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // if (arr[mid] == target) {
        // ans = mid;
        // if (findStartIndex) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // } else if (arr[mid] > target) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // }
        // return ans;

        // Que:- Find position of an element in a sorted array of infinite numbers.
        // int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 200, 220, 250 };
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the target value: ");
        // int target = sc.nextInt();
        // System.out.println(ans(arr, target));
        // }

        // static int ans(int[] arr, int target) {
        // int start = 0;
        // int end = 1;

        // // condition for target to lie in the range
        // while (arr[end] < target) {
        // int temp = end + 1; // This is my new start index

        // // double the size of box
        // // end = previous end + sizeofbox*2
        // end = end + (end - start + 1) * 2;
        // start = temp;
        // }
        // return binarySearch(arr, target, start, end);
        // }

        // static int binarySearch(int[] arr, int target, int start, int end) {
        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // if (arr[mid] == target) {
        // return mid;
        // } else if (arr[mid] < target) {
        // start = mid + 1;
        // } else {
        // end = mid - 1;
        // }
        // }
        // return -1;

        // int[] arr = { 1, 2, 3, 5, 7, 6, 3, 2 };
        // int ans = peakValue(arr);
        // System.out.println(ans);
        // }

        // static int peakValue(int[] arr) {
        // int start = 0;
        // int end = arr.length - 1;

        // while (start < end) {
        // int mid = start + (end - start) / 2;

        // if (arr[mid] < arr[mid + 1]) {
        // start = mid + 1;
        // } else {
        // end = mid;
        // }
        // }
        // return start;

        // Que: Search element in the mountain array
        // int[] arr = { 1, 2, 4, 5, 3, 1 };
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of target: ");
        // int target = sc.nextInt();
        // System.out.println(ans(arr, target));
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

        // if (arr[mid] < arr[mid + 1]) {
        // start = mid + 1;
        // } else {
        // end = mid;
        // }
        // }
        // return start;
        // }

        // static int binarySearch(int[] arr, int target, int start, int end) {
        // boolean isAscending = arr[start] < arr[end];
        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // if (arr[mid] == target) {
        // return mid;
        // }
        // if (isAscending) {
        // if (arr[mid] > target) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // } else {
        // if (arr[mid] > target) {
        // start = mid + 1;
        // } else {
        // end = mid - 1;
        // }
        // }
        // }
        // return -1;

        // Que:- Rotated sorted array Binary Search
        // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        // int target = 0;
        // System.out.println(findPivot(arr));
        // int ans = search(arr, target);
        // System.out.println(ans);
        // }

        // static int search(int[] arr, int target) {
        // int pivot = findPivot(arr);
        // if (pivot == -1) {
        // return binarySearch(arr, target, 0, arr.length - 1);
        // }
        // // if pivot is found, you have found 2 asc sorted arrays
        // if (arr[pivot] == target) {
        // return pivot;
        // }
        // if (arr[0] <= target) {
        // return binarySearch(arr, target, 0, pivot - 1);
        // }
        // return binarySearch(arr, target, pivot + 1, arr.length - 1);
        // }

        // static int findPivot(int[] arr) {
        // int start = 0;
        // int end = arr.length - 1;

        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // if (mid < end && arr[mid] > arr[mid + 1]) {
        // return mid;
        // }
        // if (mid > start && arr[mid] < arr[mid - 1]) {
        // return mid - 1;
        // }
        // if (arr[start] >= arr[mid]) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }
        // }
        // return -1;
        // }

        // static int binarySearch(int[] arr, int target, int start, int end) {
        // while (start <= end) {
        // int mid = start + (end - start) / 2;

        // if (arr[mid] == target) {
        // return mid;
        // }
        // if (arr[mid] < target) {
        // start = mid + 1;
        // } else {
        // end = mid - 1;
        // }
        // }
        // return -1;

        // Que:- sum of two elements of the array.\
        int[] arr = { 2, 7, 3, 11, 18, 15 };
        int target = 18;
        int[] ans = sumOfTwo(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sumOfTwo(int[] arr, int target) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // return new int[] {i, j};
        // }
        // }
        // }
        // return new int[] {-1, -1};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                return new int[] { i, i + 1 };
            }
        }
        return new int[] {-1, -1};
    }
}
