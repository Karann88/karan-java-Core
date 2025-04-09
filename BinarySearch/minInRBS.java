package BinarySearch;

// Minimum in Rotated sorted binary search
public class minInRBS {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        int min = search(arr);
        if (min == -1) {
            System.out.println(arr[0]);
        } else {
            System.out.println(min);
        }
    }

    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (end > mid && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
