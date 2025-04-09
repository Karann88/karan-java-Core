import java.util.Arrays;

public class gff {
    public static void main(String[] args) {
        // int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
        // int target = 2;
        // System.out.println(findPivot(arr));
        // int ans = search(arr, target);
        // System.out.println(ans);

        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        System.out.println(Arrays.toString(search(arr, target)));

    }

    // static int search(int[] arr, int target) {
    // int pivot = findPivot(arr);
    // // if the given array has sorted then do normally binary Search.
    // if (pivot == -1) {
    // return binarySearch(arr, target, 0, arr.length - 1);
    // }
    // if (arr[pivot] == target) {
    // return pivot;
    // }
    // if (arr[0] <= target) {
    // return binarySearch(arr, target, 0, pivot - 1);
    // } else {
    // return binarySearch(arr, target, pivot + 1, arr.length - 1);
    // }
    // }

    // static int findPivot(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;

    // while (start <= end) {
    // int mid = start + (end - start) / 2;

    // if (mid < end && arr[mid] > arr[mid + 1]) {
    // return mid;
    // }
    // if (start < mid && arr[mid] < arr[mid - 1]) {
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

    // if (arr[mid] < target) {
    // start = mid + 1;
    // } else if (arr[mid] > target) {
    // end = mid - 1;
    // } else {
    // return mid;
    // }
    // }
    // return -1;
    // }

    // duplicate sorted array
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

            if (arr[mid] == target) {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
