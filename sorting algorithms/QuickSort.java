package practice.algorithms.sorting;

import static practice.utils.AppUtils.swap;

public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    /**
     * Hacker Rank
     * @param arr
     * @param left
     * @param right
     */
    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[left+(right-left)/2];
        int i = partition(arr, left, pivot, right);
        quickSort(arr, left, i-1);
        quickSort(arr, i, right);
    }

    public static int partition(int[] arr, int left, int pivot, int right) {
        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static int quickSelect(int[] arr, int k) {
        int left = 0, right = arr.length-1;

        while (left < right) {
            int j = partition(arr, left, arr[left+(right-left)/2], right);
            if (j < k) {
                left = j + 1;
            } else if (j > k) {
                right = j -1;
            } else
                return arr[k];
        }
        return arr[k];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {
                325432, 989, 547510, 3, -93, 189019, 5042, 123,
                597, 42, 7506, 184, 184, 2409, 45, 824,
                4, -2650, 9, 662, 3928, -170, 45358, 395,
                842, 7697, 110, 14, 99, 221
        };

        int[] sorted = new int[] {-2650, -170, -93, 3, 4, 9, 14,
                42, 45, 99, 110, 123, 184, 184, 221, 395, 597,
                662, 824, 842, 989, 2409, 3928, 5042, 7506, 7697,
                45358, 189019, 325432, 547510
        };

        QuickSort.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sorted[i]) {
                throw new AssertionError();
            }
        }
        QuickSort.quickSelect(arr, 1);
    }
}
