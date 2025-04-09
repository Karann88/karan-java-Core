package Recursion;

import java.util.ArrayList;

public class Recur2 {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,5,6,8};
        // System.out.println(sorted(arr, 0));
        // }
        // static boolean sorted(int[] arr, int index) {
        // if(index == arr.length - 1) {
        // return true;
        // }
        // return arr[index] < arr[index + 1] && sorted(arr, index + 1);
        // }

        // Que:- Find the element in the array.
        int[] arr = { 1, 3, 5, 8, 8, 9, 12 };
        // System.out.println(find(arr, 18, 0));
        // System.out.println(findIndexLast(arr, 8, arr.length-1));

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> ans = findAllIndex(arr, 8, 0, new ArrayList<>());
        // System.out.println(ans);
        // System.out.println(list);

        System.out.println(findIndexes(arr, 8, 0));

        int[] arr1 = { 5, 6, 7, 8, 1, 2 };
        System.out.println(search(arr1, 7, 0, arr1.length - 1));
    }

    // static int find(int[] arr, int target, int index) {
    // if (index == arr.length) {
    // return -1;
    // }
    // if (arr[index] == target) {
    // return index;
    // } else {
    // return find(arr, target, index + 1);
    // }
    // }

    // True and false
    // static boolean find(int[] arr, int target, int index) {
    // if (index == arr.length) {
    // return false;
    // }
    // return arr[index] == target || find(arr, target, index + 1);
    // }

    // Or findLast
    // static int findIndexLast(int[] arr, int target, int index) {
    // if (index == -1) {
    // return -1;
    // }
    // if (arr[index] == target) {
    // return index;
    // } else {
    // return findIndexLast(arr, target, index - 1);
    // }
    // }

    // static ArrayList<Integer> list = new ArrayList<>();

    // static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,
    // ArrayList<Integer> list) {
    // if (index == arr.length) {
    // return list;
    // }
    // if (arr[index] == target) {
    // list.add(index);
    // }
    // return findAllIndex(arr, target, index + 1, list);
    // }

    // When return type is arrayList
    // Every function calls we create new Arraylist
    // Object is being create again and again , Hence Do not use this approach
    static ArrayList<Integer> findIndexes(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findIndexes(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    // Que:- Find an element in rotated Binary serach.

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(target == arr[mid]) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <=arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        } else {
            if (target >= arr[mid] && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            } else {
                return search(arr, target, start, mid - 1);
            }
        }
    }
}
