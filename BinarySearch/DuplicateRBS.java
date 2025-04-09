package BinarySearch;

public class DuplicateRBS {
    public static void main(String[] args) {
        // int[] arr = { 2, 9, 2, 2, 2 };
        // int ans = findPivotWithDuplicate(arr);

        int[] arr = { 3, 3, 3, 1 };
        int min = findMinWithDuplicate(arr);
        if (min == -1) {
            System.out.println(arr[0]);
        } else {
            System.out.println(min);
        }
    }

    // static int findPivotWithDuplicate(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start <= end) {
    // int mid = start + (end - start) / 2;

    // if (mid < end && arr[mid] > arr[mid - 1]) {
    // return mid;
    // }
    // if (mid > start && arr[mid] < arr[mid - 1]) {
    // return mid - 1;
    // }

    // // if elements at middle, start, end are equal then just skip the duplicates.
    // if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
    // // check wehether start is pivot
    // if (arr[start] > arr[start + 1]) {
    // return start;
    // }
    // start++;
    // // check whether end is pivot
    // if (arr[end] < arr[end - 1]) {
    // return end - 1;
    // }
    // end--;
    // }
    // // if middle element is greater than start element then start is pivot
    // else if (arr[mid] > arr[start] || (arr[mid] == arr[start] && arr[mid] >
    // arr[end])) {
    // start = mid + 1;
    // }
    // // if middle element is smaller than end element then end is pivot
    // else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    static int findMinWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (start < mid && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (mid > start && arr[start] > arr[start + 1]) {
                    return arr[start + 1];
                }
                start++;
                if (end > mid && arr[end] < arr[end - 1]) {
                    return arr[end];
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // static int findMinWithDuplicate(int[] arr) {
    // int start = 0;
    // int end = arr.length - 1;

    // while (start <= end) {
    // int mid = start + (end - start) / 2;

    // if (start < mid && arr[mid] < arr[mid - 1]) {
    // return arr[mid];
    // }
    // if (end > mid && arr[mid] > arr[mid + 1]) {
    // return arr[mid + 1];
    // }
    // if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
    // if (mid > start && arr[start] > arr[start + 1]) {
    // return arr[start + 1];
    // }
    // if (end > mid && arr[end] < arr[end - 1]) {
    // return arr[end];
    // }
    // if (arr[start] < arr[end]) {
    // start++;
    // } else {
    // end--;
    // }
    // } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] >
    // arr[end])) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return arr[start];
    // }
}
