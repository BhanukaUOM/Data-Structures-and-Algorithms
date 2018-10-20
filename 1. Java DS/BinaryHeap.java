import java.util.Arrays;

public class BinaryHeap {

    private Integer[] heap;
    private int n = 0;
    private int capacity = 8;

    public BinaryHeap() {
        this.heap = new Integer[capacity];
    }

    public void insert(Integer value) {
        if (n+1 == capacity) {
            capacity *= 2;
            heap = Arrays.copyOf(heap, capacity);
        }
        heap[++n] = value;
    }

    public Integer deleteMax() {
        Integer max = heap[1];
        swap( 1, n);
        heap[n--] = null;
        sink(1);
        return max;
    }

    private void swim(int k) {
        while (k/2 > 1 && heap[k/2] < heap[k]) {
            swap(k/2, k);
            k /= 2;
        }
    }

    private void sink(int k) {
        while (k*2 < n) {
            int j = k*2;
            if (heap[j] < heap[j+1]) {
                j++;
            }
            if (!(heap[k] < heap[j])) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    private void swap(int i, int j) {
        int t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }
}
