package practice.algorithms.sorting;

import static practice.utils.AppUtils.swap;

public class HeapSort {

    public static void sort(Integer[] pq) {
        int n = pq.length-1;
        for (int k = (n-1)/2; k >= 0; k--)
            sink(pq, k, n);
        while (n >= 1) {
            swap(pq, 0, n--);
            sink(pq, 0, n);
        }
    }

    private static void sink(Integer[] pq, int k, int n) {
        while (2*k < n) {
            int j = 2*k;
            if (pq[j] < pq[j+1]) j++;
            if (!(pq[k] < pq[j])) break;
            swap(pq, k, j);
            k = j;
        }
    }

    public void recursiveSort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    private static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
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

        HeapSort.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(sorted[i])) {
                throw new AssertionError();
            }
        }

        for (int i = 0; i < 1; i++) {
            int t = sorted[0];
            sorted[0] = sorted[sorted.length-1];
            for (int j = 1; j < sorted.length; j++) {
                int tmp = sorted[j];
                sorted[j] = t;
                t = tmp;
            }
        }
    }
}
