package u4dpp;

import java.util.ArrayList;
import java.util.Arrays;


public class Sort {

    /**
     * Selection sort ascending order
     */
    public static int[] selectionSort(int[] x) {
        int[] arr = Arrays.copyOf(x, x.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /**
     * Insertion asscending order
     */
    public static int[] insertionSort(int[] x) {
        int[] arr = Arrays.copyOf(x, x.length);
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /**
     * Selection sort descending order
     */
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> x) {
        ArrayList<Integer> list = new ArrayList<>(x);
        for (int i = 0; i < list.size() - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > list.get(maxIdx)) {
                    maxIdx = j;
                }
            }
            int temp = list.get(maxIdx);
            list.set(maxIdx, list.get(i));
            list.set(i, temp);
        }
        return list;
    }

    /**
     * Insertion sort Descending order.
     */
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> x) {
        ArrayList<Integer> list = new ArrayList<>(x);
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) < key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
        return list;
    }

    /**
     * Recursive Merge sort Ascending
     */
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> x) {
        if (x.size() <= 1) return new ArrayList<>(x);

        int mid = x.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(x.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(x.subList(mid, x.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> merged = new ArrayList<>();
        int l = 0, r = 0;
        while (l < left.size() && r < right.size()) {
            if (left.get(l) <= right.get(r)) merged.add(left.get(l++));
            else merged.add(right.get(r++));
        }
        while (l < left.size()) merged.add(left.get(l++));
        while (r < right.size()) merged.add(right.get(r++));
        return merged;
    }
}