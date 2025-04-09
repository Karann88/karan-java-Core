package Sorting;

// import java.lang.Math;
// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

// import Practice.sorting;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        // System.out.println("Karan Jangir");
        // System.out.println("Bharat Khandelwal");
        // bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    // Insertion Sort

    // int[] arr = { 5, 3, 4, 1, 2 };
    // System.out.println("Karan Jangir");
    // insertion(arr);
    // System.out.println(Arrays.toString(arr));
    // }

    // static void insertion(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (arr[j] < arr[j - 1]) {
    // swap(arr, j, j - 1);
    // } else {
    // break;
    // }
    // }
    // }
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    // Cyclic Sort

    // int[] arr = { 3, 5, 2, 1, 4 };
    // cyclic(arr);
    // System.out.println(Arrays.toString(arr));
    // }

    // static void cyclic(int[] arr) {
    // int i = 0;
    // while (i < arr.length) {
    // int correct = arr[i] - 1;
    // if (arr[i] != arr[correct]) {
    // swap(arr, i, correct);
    // } else {
    // i++;
    // }
    // }
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    // Que:- Find the missing number from the given array which numbers is in the
    // range [0, n].

    // int[] nums = { 3, 0, 1 };
    // System.out.println(missingNumber(nums));
    // }

    // static int missingNumber(int[] nums) {
    // int i = 0;
    // while (i < nums.length) {
    // int correct = nums[i];
    // if (nums[i] < nums.length && nums[i] != nums[correct]) {
    // swap(nums, i, correct);
    // } else {
    // i++;
    // }
    // }

    // for (int index = 0; index < nums.length; index++) {
    // if (nums[index] != index) {
    // return index;
    // }
    // }
    // return nums.length;
    // }

    // static void swap(int[] nums, int first, int second) {
    // int temp = nums[first];
    // nums[first] = nums[second];
    // nums[second] = temp;
    // }

    // Que:- Find the disappearing Numbers in the array.

    // int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    // System.out.println(findDisappeared(arr));

    // }

    // static List<Integer> findDisappeared(int[] arr) {
    // int i = 0;
    // while (i < arr.length) {
    // int correct = arr[i] - 1;
    // if (arr[i] != arr[correct]) {
    // swap(arr, i, correct);
    // } else {
    // i++;
    // }
    // }
    // List<Integer> ans = new ArrayList<>(arr.length);
    // for (int index = 0; index < arr.length; index++) {
    // if (arr[index] != index + 1) {
    // ans.add(index + 1);
    // }
    // }
    // return ans;
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    // Que:- Find the duplicate Number.

    // int[] arr = { 1, 3, 4, 2, 2 };
    // System.out.println(findDuplicate(arr));
    // }

    // static int findDuplicate(int[] arr) {
    // int i = 0;
    // while (i < arr.length) {
    // if (arr[i] != i + 1) {
    // int correct = arr[i] - 1;
    // if (arr[i] != arr[correct]) {
    // swap(arr, i, correct);
    // } else {
    // return arr[i];
    // }
    // } else {
    // i++;
    // }
    // }
    // return -1;
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    // Que:- Find all duplicate in an array.

    // int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    // System.out.println(findDuplicate(arr));
    // }

    // static List<Integer> findDuplicate(int[] arr) {
    // int i = 0;
    // while (i < arr.length) {
    // int correct = arr[i] - 1;
    // if (arr[i] != arr[correct]) {
    // swap(arr, i, correct);
    // } else {
    // i++;
    // }
    // }

    // List<Integer> ans = new ArrayList<>(arr.length);
    // for(int index=0; index< arr.length; index++) {
    // if(arr[index] != index + 1) {
    // ans.add(arr[index]);
    // }
    // }
    // return ans;
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    // Que:- Set mismatch

    // int[] arr = { 1, 2, 2, 4 };
    // System.out.println(Arrays.toString(findErrorNums(arr)));
    // }

    // static int[] findErrorNums(int[] arr) {
    // int i = 0;
    // while (i < arr.length) {
    // int correct = arr[i] - 1;
    // if (arr[i] != arr[correct]) {
    // int temp = arr[i];
    // arr[i] = arr[correct];
    // arr[correct] = temp;
    // } else {
    // i++;
    // }
    // }
    // for (int index = 0; index < arr.length; index++) {
    // if (arr[index] != index + 1) {
    // return new int[] { arr[index], index + 1 };
    // }
    // }
    // return new int[] { -1, -1 };
    // }

    // Que:- First Missing Positive number.

    // int[] arr = { 3, 4, -1, 1 };
    // System.out.println(firstMissingPositive(arr));
    // }

    // static int firstMissingPositive(int[] arr) {
    // int i = 0;
    // while (i < arr.length) {
    // int correct = arr[i] - 1;
    // if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
    // swap(arr, i, correct);
    // } else {
    // i++;
    // }
    // }
    // for (int index = 0; index < arr.length; i++) {
    // if (arr[index] != index + 1) {
    // return index + 1;
    // }
    // }
    // return arr.length + 1;
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    // Que:- Third Maximum Number

    // int[] arr = { 2, 2, 3, 1 };
    // System.out.println(thirdMaxNum(arr));
    // }

    // static int thirdMaxNum(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // boolean swapped = false;
    // for (int j = 1; j <= arr.length - i - 1; j++) {
    // if (arr[j] < arr[j - 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // swapped = true;
    // }
    // }
    // if (!swapped) {
    // break;
    // }
    // }
    // int distnictcount = 1;
    // int thirdMax = arr[arr.length - 1];

    // for (int i = arr.length - 1; i > 0; i--) {
    // if (arr[i] != arr[i - 1]) {
    // distnictcount++;
    // }
    // if (distnictcount == 3) {
    // thirdMax = arr[i - 1];
    // break;
    // }
    // }
    // if (distnictcount < 3) {
    // thirdMax = arr[arr.length - 1];
    // }
    // return thirdMax;
    // }

    // Que:- Maximum Product of Three Numbers.

    // int[] nums = { 3, 1, 4, 2 };
    // System.out.println(productThreeNumbers(nums));
    // }

    // static int productThreeNumbers(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // boolean swapped = false;
    // for (int j = 1; j < arr.length - i; j++) {
    // if (arr[j] < arr[j - 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // swapped = true;
    // }
    // }
    // if (!swapped) {
    // break;
    // }
    // }
    // int distnictCount = 1;
    // int mul = arr[arr.length - 1];
    // for (int i = arr.length - 2; i >= 0; i--) {
    // if (arr[i] != arr[i + 1]) {
    // distnictCount++;
    // }

    // if (distnictCount == 3) {
    // mul = mul * arr[i];
    // break;
    // }
    // }
    // if (distnictCount < 3) {
    // mul = -1;
    // }
    // return mul;
    // }

    // Que:- Sort array by parity;

    // int[] nums = { 3, 1, 2, 4 };
    // System.out.println(Arrays.toString(sortArrayByParity(nums)));
    // }

    // static int[] sortArrayByParity(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // boolean swapped = false;
    // for (int j = 1; j < arr.length - i; j++) {
    // if (arr[j] < arr[j - 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // swapped = true;
    // }
    // }
    // if (!swapped) {
    // break;
    // }
    // }
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (arr[j] % 2 == 0) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // } else {
    // break;
    // }
    // }
    // }
    // return arr;
    // }

    // Que:- Largest perimeter of Triangle.

    // int[] nums = { 1, 2, 1, 10 };
    // int result = largestPerimeter(nums);
    // System.out.println("Largest Perimeter of triangle: " + result);
    // }

    // static int largestPerimeter(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // boolean swapped = false;
    // for (int j = 1; j < arr.length - i; j++) {
    // if (arr[j] < arr[j - 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // swapped = true;
    // }
    // }
    // if (!swapped) {
    // break;
    // }
    // }

    // for (int i = arr.length - 1; i >= 2; i--) {
    // int x = arr[i];
    // int y = arr[i - 1];
    // int z = arr[i - 2];
    // if (y + z > x) {
    // return x + y + z;
    // }
    // }
    // return 0;
    // }

    // Que - Square of a Sorted Array.

    // int[] arr = { -4, -1, 0, 3, 10 };
    // squareArr(arr);
    // System.out.println(Arrays.toString(arr));
    // }

    // static void squareArr(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = arr[i] * arr[i];
    // }
    // insertion(arr);
    // }

    // static void insertion(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (arr[j] < arr[j - 1]) {
    // swap(arr, j, j - 1);
    // }
    // }
    // }
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    // Que:- Maximum Product of two elements in an Array

    // int[] arr = { 1, 5, 4, 5 };
    // System.out.println(maxProduct(arr));
    // }

    // static int maxProduct(int[] arr) {
    // int max1 = 0;
    // int max2 = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max1) {
    // max2 = max1;
    // max1 = arr[i];
    // } else if (arr[i] > max2) {
    // max2 = arr[i];
    // }
    // }
    // return (max1 - 1) * (max2 - 1);
    // }

    // Que:- Average salary excluding the minimum and maximum salary.

    // int[] arr = { 4000, 3000, 1000, 2000 };
    // sort(arr);
    // double avg = claculateAvgExcludingMinMax(arr);
    // System.out.println(avg);
    // }

    // static void sort(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // boolean swapped = false;
    // for (int j = 1; j < arr.length - i; j++) {
    // if (arr[j] < arr[j - 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // swapped = true;
    // }
    // }
    // if (!swapped) {
    // break;
    // }
    // }
    // }

    // static double claculateAvgExcludingMinMax(int[] arr) {
    // if (arr.length <= 2) {
    // return 0;
    // }

    // double sum = 0;
    // for (int i = 1; i < arr.length - 1; i++) { // Starting from 1 and terminate
    // length - 2
    // sum += arr[i];
    // }
    // return sum / (arr.length - 2); // Subtract 2 to exclude min and max.
    // }

    // Que:- Can make Arithmetic Progression from Sequence.

    // int[] arr = { 3, 5, 1 };
    // insertionSort(arr);
    // boolean isArithmetic = isArithmetic(arr);
    // System.out.println(isArithmetic);
    // }

    // static void insertionSort(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (arr[j] < arr[j - 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // } else {
    // break;
    // }
    // }
    // }
    // }

    // static boolean isArithmetic(int[] arr) {
    // int commonDiff = arr[1] - arr[0];
    // for (int i = 2; i < arr.length; i++) {
    // if(arr[i] - arr[i-1] != commonDiff) {
    // return false;
    // }
    // }
    // return true;
    // }

    // Que:- Sort Array by increasing Frequency.

    // int[] arr = { 1, 1, 2, 2, 2, 3 };
    // insertion(arr);
    // int countNums = incFrequency(arr);
    // System.out.println(countNums);
    // }

    // static void insertion(int[] arr) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (arr[j] < arr[j - 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j - 1];
    // arr[j - 1] = temp;
    // }
    // }
    // }
    // }

    // static int incFrequency(int[] arr) {
    // int i = 0;
    // while(i < arr.length - 1) {
    // if (arr[i] == arr[i + 1]) {
    // for(int count = 1; count < arr.length; count++) {

    // }
    // } else {
    // i++;
    // }
    // return count;
    // }
    // }
}
