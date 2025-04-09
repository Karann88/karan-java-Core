package BinarySearch.TwoDMatrix;

import java.util.Arrays;

public class rowColMatrix {
    public static void main(String[] args) {
        // Array is not strictly sorted
        // It is sorted row and column wise
        // So we cannot apply Binary Search
        // int[][] arr = {
        // {10, 20, 30, 40},
        // {15, 25, 35, 45},
        // {28, 29, 37, 49},
        // {33, 34, 38, 50}
        // };
        // System.out.println(Arrays.toString(search(arr, 37)));

        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(Arrays.toString(search(arr, 4)));
    }

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

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Be cautions here, matrix may be empty.

        if (rows == 0 || cols == 0) {
            return new int[] { -1, -1 };
        }

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = (cols - 1) / 2;

        // run the loop till 2 rows are remaining.
        while (rStart < (rEnd - 1)) { // while this is true, it will have more than 2 rows.
            int rMid = rStart + (rEnd - rStart) / 2;
            if (matrix[rMid][cMid] == target) {
                return new int[] { rMid, cMid };
            } else if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }

            // Now two rows are remaining only.
            if (matrix[rStart][cMid] == target) {
                return new int[] { rStart, cMid };
            }
            if (matrix[rStart + 1][cMid] == target) {
                return new int[] { rStart + 1, cMid };
            }

            // search in 1st half
            if (matrix[rStart][cMid] >= target) {
                return binarySearch(matrix, rStart, 0, cMid, target);
            }
            // search in 2nd half
            if (matrix[rStart][cMid + 1] <= target) {
                return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
            }
            // search in 3rd half
            if (matrix[rStart + 1][cMid] >= target) {
                return binarySearch(matrix, rStart + 1, 0, cMid, target);
            }
            // search in 4th half
            if (matrix[rStart + 1][cMid + 1] <= target) {
                return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
            }
        return new int[] { -1, -1 };
    }
}
