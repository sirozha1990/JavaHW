package HW;

import Task.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3, 8, 6, 4};
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
