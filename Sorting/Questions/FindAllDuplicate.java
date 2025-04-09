package Sorting.Questions;

import java.util.ArrayList;
import java.util.List;

// import java.util.Arrays;

public class FindAllDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1 };
        List<Integer> ans = duplicateNum(arr);
        System.out.println(ans);
    }

    static List<Integer> duplicateNum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                list.add(arr[index]);
            }
        }
        return list;
    }

}
