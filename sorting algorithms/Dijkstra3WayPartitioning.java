package practice.algorithms.sorting;

import static practice.utils.AppUtils.swap;

public class Dijkstra3WayPartitioning {

    public static void sort(int[] a) {

    }

    private static void sort(int[] a, int left, int right) {
        if (right <= left) {
            return;
        }
        int lt = left;
        int gt = right;
        int i = left;
        int pivot = left + (right - left) / 2;

        while (i <= gt) {
            if (a[i] < pivot) {
                swap(a, a[lt++], a[i++]);
            } else if (a[i] > pivot) {
                swap(a, a[gt--], a[i]);
            } else
                i--;
        }

        sort(a, left, lt-1);
        sort(a, gt+1, right);
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

        Dijkstra3WayPartitioning.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sorted[i]) {
                throw new AssertionError();
            }
        }
    }
}
