package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        // int[] arr = { 12, 15, 18, 2, 3, 6 };
        // int pivot = findPivot(arr);
        // System.out.println(pivot + 1);

        int[] arr = { 1, 0, 1, 1, 1 };
        int target = 0;
        System.out.println(findPivot(arr));
        System.out.println(search(arr, target));
    }

    // static int findPivot(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;

    // // 4 cases
    // if (end > mid && arr[mid] > arr[mid - 1]) {
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

    static boolean search(int[] nums, int target) {
    int pivot = findPivot(nums);

    if (pivot == -1) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    if (nums[pivot] == target) {
        return true;
    }

    if (nums[0] <= target) {
        return binarySearch(nums, target, 0, pivot - 1);
    } else {
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
}

public static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (mid > 0 && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }

        if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
            return mid;
        }

        if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
            if (start < mid && arr[start] > arr[start + 1]) {
                return start;
            }
            start++;

            if (end > mid && arr[end] < arr[end - 1]) {
                return end - 1;
            }
            end--;
        } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}

public static boolean binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return false;
}

}
