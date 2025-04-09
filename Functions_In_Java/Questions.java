import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rev {
    public static void main(String[] args) {

        int[] arr = { 2, 7, 11, 14, 20, 22 };
        int ans = searchIndex(arr, 1, 0, arr.length - 1);
        System.out.println(ans);

        System.out.println(sumOfDigits(9876));

        System.out.println(productOfDigit(1324));

        System.out.println(rev(1342));

        System.out.println(palin(121));

        System.out.println(countZeros(333, 0));

        System.out.println(steps(14));

        System.out.println(sort(arr, 0));

        int[] arr2 = { 2, 67, 8, 8, 3, 10 };

        System.out.println(findIndex(arr2, 8, 0));

        System.out.println(findFromLast(arr2, 8, arr.length - 1));

        System.out.println(find(arr, 7, 0));

        // findIndexes(arr2, 8, 0);
        // System.out.println(list);

        System.out.println(findAllIndexes(arr2, 8, 0, new ArrayList<>()));

        int[] arr3 = { 6, 5, 4, 1, 2, 3 };
        System.out.println(searchIndexIndex(arr3, 2, 0, arr3.length - 1));

        pattern1(4, 0);

        pattern1(1, 0);

        int[] arr4 = { 5, 3, 1, 2, 4 };
        bubbleSort(arr4, arr4.length - 1, 0);
        System.out.println(Arrays.toString(arr4));

        // bubble(arr4, 0, arr4.length - 1);
        // System.out.println(Arrays.toString(arr4));

        selectionSort(arr4, arr4.length, 0, 0);
        System.out.println(Arrays.toString(arr4));

        divide(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));

        quickSort(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));

        skip("", "baccad");

        System.out.println(skip1("baccad"));

        System.out.println(skipApple("baccappleda"));

        System.out.println(skipString("baccappleda"));

        subseq("", "abc");

        subseqAscii("", "ab");

        System.out.println(subseqRet("", "abc"));

        int[] arr5 = { 1, 2, 3 };
        List<List<Integer>> res = subset(arr5);
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }

    static int searchIndex(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            }
            if (arr[m] > target) {
                return searchIndex(arr, target, s, m - 1);
            } else {
                return searchIndex(arr, target, m + 1, e);
            }
        }
        return -1;
    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem + sumOfDigits(n / 10);
    }

    static int productOfDigit(int n) {
        if (n == n % 10) {
            return n;
        }
        int rem = n % 10;
        return rem * productOfDigit(n / 10);
    }

    static int rev(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palin(int n) {
        return n == rev1(121);
    }

    static int rev1(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper1(n, digits);
    }

    static int helper1(int n, int digits) {
        if (n == 0) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static int countZeros(int n, int count) {
        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) {
            return countZeros(n / 10, count + 1);
        } else {
            return countZeros(n / 10, count);
        }
    }

    static int steps(int n) {
        return helper2(n, 0);
    }

    static int helper2(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper2(num / 2, steps + 1);
        } else {
            return helper2(num - 1, steps + 1);
        }
    }

    // Que:- Array is sorted or not.
    static boolean sort(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sort(arr, index + 1);
    }

    // Que:- Find an element in an array using recursion.
    // Not for the duplicates.
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            // From starting of the array.
            return findIndex(arr, target, index + 1);
        }
    }

    // From Last
    static int findFromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            // From ending of the array.
            return findFromLast(arr, target, index - 1);
        }
    }

    // If an elemnt present in the array or not
    // True or False approach.

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    // Que:- Finding indexes of duplicates elements in the array.
    // In ArrayList
    // static ArrayList<Integer> list = new ArrayList<>();

    // static void findIndexes(int[] arr, int target, int index) {

    // if (index == arr.length) {
    // return;
    // }
    // if (arr[index] == target) {
    // list.add(index);
    // }
    // findIndexes(arr, target, index + 1);
    // }

    // Returning an ArrayList

    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexes(arr, target, index + 1, list);
    }

    // Find an element in a rotated array.

    static int searchIndexIndex(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] >= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return searchIndex(arr, target, s, m - 1);
            } else {
                return searchIndex(arr, target, m + 1, e);
            }
        } else {
            if (target >= arr[m] && target <= arr[e]) {
                return searchIndex(arr, target, m + 1, e);
            } else {
                return searchIndex(arr, target, s, m - 1);
            }
        }
    }

    // Pattern using Recursion.
    // static void pattern(int n) {
    // for (int i = n; i > 1; i--) {
    // for (int j = i; j > 1; j--) {
    // System.out.print(" *");
    // }
    // System.out.println();
    // }
    // }

    static void pattern(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print(" *");
            pattern(r, c + 1);
        } else {
            System.out.println();
            pattern(r - 1, 0);
        }
    }

    static void pattern1(int r, int c) {
        if (r == 5) {
            return;
        }
        if (r > c) {
            System.out.print(" *");
            pattern1(r, c + 1);
        } else {
            System.out.println();
            pattern1(r + 1, 0);
        }
    }

    static void bubbleSort(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (i > j) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                bubbleSort(arr, i, j + 1);
            }
            bubbleSort(arr, i, j + 1);
        } else {
            bubbleSort(arr, i - 1, 0);
        }
    }

    // Alternate Method of bubble sort.

    // static void bubble(int[] arr, int i, int j) {
    // if (i == arr.length - 1) {
    // return;
    // }
    // if (i < j) {
    // if (arr[j] < arr[j-1]) {
    // int temp = arr[j];
    // arr[j] = arr[j-1];
    // arr[j-1] = temp;
    // bubble(arr, i, j - 1);
    // } else {
    // bubble(arr, i, j - 1);
    // }
    // } else {
    // bubble(arr, i + 1, arr.length - 1);
    // }
    // }

    // static void selectionSort(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // int last = arr.length - i - 1;
    // int maxIndex = getMaxIndex(arr, 0, last);
    // swap(arr, last, maxIndex);
    // }
    // }
    // static int getMaxIndex(int[] arr, int start, int end) {
    // int max = start;
    // for (int i = start; i <= end; i++) {
    // if (arr[i] > arr[max]) {
    // max = i;
    // }
    // }
    // return max;
    // }

    // static void swap(int[] arr, int first, int second) {
    // int temp = arr[first];
    // arr[first] = arr[second];
    // arr[second] = temp;
    // }

    static void selectionSort(int[] arr, int i, int j, int max) {
        if (i == 0) {
            return;
        }
        if (i > j) {
            if (arr[j] > arr[max]) {
                selectionSort(arr, i, j + 1, j);
            } else {
                selectionSort(arr, i, j + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[i - 1];
            arr[i - 1] = temp;
            selectionSort(arr, i - 1, 0, 0);
        }
    }

    // Merge sort Algorithm.

    static void divide(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int m = s + (e - s) / 2;

        divide(arr, s, m);
        divide(arr, m + 1, e);

        conquer(arr, s, m, e);
    }

    static void conquer(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s + 1];

        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j <= e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    // Quick Sort Algorithm.
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }

    // Substrings and Subsets

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    private static String skip1(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip1(up.substring(1));
        } else {
            return ch + skip1(up.substring(1));
        }
    }

    private static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    private static String skipString(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipString(up.substring(3));
        } else {
            return up.charAt(0) + skipString(up.substring(1));
        }
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
