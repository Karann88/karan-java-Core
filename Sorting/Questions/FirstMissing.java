package Sorting.Questions;

import java.util.Arrays;

// import java.util.Arrays;

public class FirstMissing {
    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }
}
