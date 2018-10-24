package practice.algorithms.sorting;

import practice.utils.IntComparator;

import java.util.Comparator;

public class ShellSort {

    public void shellSort(Object[] a, Comparator comparator) {
        int h = 1;

        while (h < a.length/3) {
            h = 3*h + 1;
        }

        for (; h >= 1; h/=3) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h; j-=h) {
                    if (comparator.compare(a[j], a[j-h]) < 0) {
                        Object tmp = a[j-h];
                        a[j-h] = a[j];
                        a[j] = tmp;
                    } else
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {
                325432, 989, 547510, 3, -93, 189019, 5042, 123,
                597, 42, 7506, 184, 184, 2409, 45, 824,
                4, -2650, 9, 662, 3928, -170, 45358, 395,
                842, 7697, 110, 14, 99, 221
        };

        Integer[] sorted = new Integer[] {-2650, -170, -93, 3, 4, 9, 14,
                42, 45, 99, 110, 123, 184, 184, 221, 395, 597,
                662, 824, 842, 989, 2409, 3928, 5042, 7506, 7697,
                45358, 189019, 325432, 547510
        };

        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(arr, new IntComparator());

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(sorted[i])) {
                throw new AssertionError();
            }
        }
    }
}
