package u4dpp;

public class Search {

    /**
     * Recursive for binary search
     */
    public static int binarySearch(int[] arr, int targetNumber) {
        return helper(arr, targetNumber, 0, arr.length - 1);
    }

    private static int helper(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return helper(arr, target, low, mid - 1);
        return helper(arr, target, mid + 1, high);
    }
}