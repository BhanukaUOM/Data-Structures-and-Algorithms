package practice.algorithms.sorting;

public class MergeSort {

    public static void mergeSort(int[] array) {
        mergeSort(array, new int[array.length], 0, array.length-1);
    }

    public static void mergeSort(int[] array, int[] temp,  int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }

        int middle = leftStart + (rightEnd - leftStart) / 2;
        mergeSort(array, temp, leftStart, middle); // left half
        mergeSort(array, temp, middle+1, rightEnd); // right half
        mergeHalves(array, temp, leftStart, middle, rightEnd);
    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int middle, int rightEnd) {
        int rightStart = middle + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= middle && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index++] = array[left++];
            } else
                temp[index++] = array[right++];
        }

        System.arraycopy(array, left, temp, index, middle-left+1); // copy the rest of elements from left
        System.arraycopy(array, right, temp, index, rightEnd-right+1); // copy the rest of elements from right
        System.arraycopy(temp, leftStart, array, leftStart, size); // copy from where we started all elements to temp
    }

//    public static void bottomUpMergeSort(int[] arr) {
//        int[] temp = new int[arr.length];
//
//        for (int i = 1; i < arr.length; i+=i) {
//            for (int j = 0; j < arr.length; j+=i+i) {
//                mergeHalves(arr, temp, j, Math.min(j+i+i-1, arr.length-1));
//            }
//        }
//    }

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

        MergeSort.mergeSort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sorted[i]) {
                throw new AssertionError();
            }
        }
    }
}
