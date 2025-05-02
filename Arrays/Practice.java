package Arrays;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = {
        // { 4, 3, 2, -1 },
        // { 3, 2, 1, -1 },
        // { 1, 1, -1, -2 },
        // { -1, -1, -2, -3 }
        // };

        // int[] arr = { 2, 3, 4, 7, 11 };
        // int k = 5;

        // int[] arr = { 5, 7, 7, 8, 8, 10 };
        // int target = 7;

        // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

        // int[] arr = { 1, 2, 1, 3, 5, 6, 4 };

        // int[] piles = { 3, 6, 7, 11 };
        // int h = 8;

        // int[][] arr = {
        // { 1, 3, 5, 7 },
        // { 10, 11, 16, 20 },
        // { 23, 30, 34, 60 }
        // };

        int[] arr = { 3, 1, 3, 2, 5 };
        // System.out.println(Arrays.toString(sumOfTwoElement(arr, target)));
        // System.out.println(searchInsert(arr, target));
        // System.out.println(peakValue(arr));
        // System.out.println(Arrays.toString(intersectionTwoArrays(arr1, arr2)));
        // System.out.println(negativeNumbers(arr));
        // System.out.println(missingNumber(arr, k));
        // System.out.println(Arrays.toString(search(arr, target)));
        // System.out.println(singleElement(arr));
        // System.out.println(findPivot(arr));
        // System.out.println(search(arr, 1));
        // System.out.println(peakValue(arr));
        // System.out.println(peakElement(arr));
        // System.out.println(minEatingSpeed(piles, h));
        // System.out.println(Arrays.toString(search(arr, target)));
        // System.out.println(Arrays.toString(peakIn2D(arr)));
        // System.out.println(duplicateNumber(arr));
    };

    // static int binarySearch(int[] arr, int target) {
    // int start = 0;
    // int end = arr.length - 1;
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
    // }

    // static int[] sumOfTwoElement(int[] arr, int target) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start < end) {
    // if (arr[start] + arr[end] == target) {
    // return new int[] { start + 1, end + 1 };
    // } else if (arr[start] + arr[end] > target) {
    // end--;
    // } else {
    // start++;
    // }
    // }
    // return new int[] { -1, -1 };
    // }

    // static int searchInsert(int[] arr, int target) {
    // int start = 0;
    // int end = arr.length - 1;
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
    // return start;
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

    static boolean checkDoubleExist(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 2 * nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // Another approach
//     static boolean checkDoubleExist(int[] nums) {
//     Set<Integer> set = new HashSet<>();
//     for (int num : nums) {
//         if (set.contains(num * 2) || set.contains(num / 2)) {
//             return true;
//         }
//         set.add(num);
//     }
//     return false;
// }

    // static int negativeNumbers(int[][] arr) {
    // int count = 0;
    // for (int row = 0; row < arr.length; row++) {
    // for (int col = 0; col < arr[row].length; col++) {
    // if (arr[row][col] < 0) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // static int missingNumber(int[] arr, int k) {
    // int count = 0;
    // int ans = 1;
    // int index = 0;
    // while (index < arr.length && count < k) {
    // if (arr[index] == ans) {
    // ans++;
    // index++;
    // } else {
    // ans++;
    // count++;
    // }
    // }
    // return ans - 1;
    // }

    // Now let try above que through Binary Search approach.

    // static int missingNumber(int[] arr, int k) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (arr[mid] - (mid + 1) >= k) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // }
    // return start + k;
    // }

    // static int singleElement(int[] nums) {
    // int start = 0;
    // int end = nums.length - 1;
    // while(start < end) {
    // int mid = start + (end - start) / 2;
    // if(mid % 2 == 1) {
    // mid--;
    // }
    // if (nums[mid] != nums[mid + 1]) {
    // end = mid;
    // }
    // else {
    // start = mid + 2;
    // }
    // }
    // return nums[start];
    // }

    // static int search(int[] arr, int target) {
    // int pivot = findPivot(arr);
    // if (pivot == -1) {
    // return binarySearch(arr, target, 0, arr.length - 1);
    // }
    // if (arr[pivot] == target) {
    // return pivot;
    // }
    // int firstTry = binarySearch(arr, target, 0, pivot - 1);
    // if (firstTry == 1) {
    // return firstTry;
    // }
    // return binarySearch(arr, target, pivot + 1, arr.length - 1);
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
    // }

    // static int findPivot(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (mid < end && arr[mid] > arr[mid + 1]) {
    // return mid;
    // }
    // if (start < mid && arr[mid - 1] > arr[mid]) {
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

    // static int minEatingSpeed(int[] piles, int h) {
    // int start = 1;
    // int end = Integer.MAX_VALUE;
    // while(start <= end) {
    // int mid = start + (end - start) / 2;
    // if(canEatInTime(piles, mid, h)) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // }
    // return start;
    // }
    // static boolean canEatInTime(int[] piles, int k, int h) {
    // int hrs = 0;
    // for(int pile : piles) {
    // int div = pile / k;
    // hrs += div;
    // if(pile % k != 0)
    // hrs++;
    // }
    // return hrs <= h;
    // }

    // static int[] search(int[][] arr, int target) {
    // for (int row = 0; row < arr.length; row++) {
    // for (int col = 0; col < arr[row].length; col++) {
    // if (arr[row][col] == target) {
    // return new int[] { row, col };
    // }
    // }
    // }
    // return new int[] { -1, -1 };
    // }

    // static int[] peakIn2D(int[][] arr) {
    // int max = Integer.MIN_VALUE;
    // for(int row = 0; row<arr.length; row++) {
    // for(int col = 0; col<arr[row].length; col++) {
    // if(arr[row][col]>max) {
    // max = arr[row][col];
    // }
    // }
    // }
    // return findIndex(arr, max);
    // }

    // static int[] findIndex(int[][] arr, int max) {
    // for(int row=0; row<arr.length; row++) {
    // for(int col=0; col<arr[row].length; col++) {
    // if(arr[row][col] == max)
    // return new int[] {row, col};
    // }
    // }
    // return new int[] {-1, -1};
    // }

    // static int duplicateNumber(int[] arr) {
    // int ans = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 1; j < arr.length; j++) {
    // if (i != j && arr[i] == arr[j]) {
    // ans = arr[i];
    // }
    // }
    // }
    // return binarySearch(arr, ans);
    // }

    // static int binarySearch(int[] arr, int ans) {
    // int start = 1;
    // int end = Integer.MAX_VALUE;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (mid == ans) {
    // return mid;
    // } else {
    // if (mid > ans) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }
    // }
    // }
    // return -1;
    // }

    // static int frequency(int[] arr);

    // 3Sum
    // static List<List<Integer>> threeSum(int[] nums) {
    // List<List<Integer>> res = new ArrayList<>();
    // Arrays.sort(nums);
    // int n = nums.length;
    // for (int i = 0; i < n - 2; i++) {
    // if (i > 0 && nums[i] == nums[i - 1])
    // continue;
    // int target = -nums[i];
    // int start = i + 1;
    // int end = n - 1;
    // while (start < end) {
    // int sum = nums[start] + nums[end];
    // if (sum == target) {
    // res.add(Arrays.asList(nums[i], nums[start], nums[end]));
    // start++;
    // end--;
    // while (start < end && nums[start] == nums[start - 1])
    // start++;
    // while (start < end && nums[end] == nums[end + 1])
    // end--;
    // } else if (sum < target) {
    // start++;
    // } else {
    // end--;
    // }
    // }
    // }
    // return res;
    // }

    // // Duplicate Numbers
    // public int findDuplicate(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 1; j < arr.length; j++) {
    // if (i != j && arr[i] == arr[j]) {
    // return arr[j];
    // }
    // }
    // }
    // return -1;
    // }
}