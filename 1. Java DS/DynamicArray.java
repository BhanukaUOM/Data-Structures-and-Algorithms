import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {

    private Object[] arr;
    private static final int CAPACITY = 8;
    private int elemIndex = 0;

    public DynamicArray() {
        this.arr = new Object[CAPACITY];
    }

    public DynamicArray(Object[] items) {
        this.arr = items;
        this.elemIndex = arr.length;
    }

    public void add(Object item) {
        if (elemIndex == arr.length) {
            resize(arr.length * 2);
        }
        arr[elemIndex++] = item;
    }

    public void add(int index, Object item) {
        arr[index] = item;
    }

    public void addAll(Object[] items) {
        int freeSlots = arr.length - elemIndex - items.length;
        if (freeSlots <= 0) {
            resize(arr.length * 2 + items.length);
        }
        for (Object item : items) {
            arr[elemIndex++] = item;
        }
    }

    public void addAll(Collection<T> collection) {
        this.addAll(collection.toArray());
    }

    public T at(int index) {
        return (T) arr[index];
    }

    public T get(Object item) {
        for (int i = 0; i < elemIndex; i++) {
            if (arr[i].equals(item)) {
                return (T) arr[i];
            }
        }
        return null;
    }

    public boolean contains(Object item) {
        return get(item) != null;
    }

    public void insert(int index, Object item) {
        if (index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", but array length is " + arr.length);
        }

        if (arr.length == elemIndex) {
            resize(arr.length * 2);
        }

        for (; index < elemIndex; index++) {
            Object tmp = arr[index];
            arr[index] = item;
            item = tmp;
        }
        elemIndex++;
    }

    public void prepend(Object item) {
        insert(0, item);
    }

    public T pop() {
        T value = (T) arr[--elemIndex];
        resizeIfNeed();
        return value;
    }

    public void delete(int index) {
        for (; index < arr.length - 1; index++) {
            arr[index] = arr[index + 1];
        }
        --elemIndex;
        resizeIfNeed();
    }

    public void remove(Object item) {
        int j = 0;
        Object[] a = new Object[arr.length];
        for (int i = 0; i <= elemIndex; i++) {
            if (arr[i].equals(item)) {
                elemIndex--;
            } else
                a[j++] = arr[i];
        }
        arr = a;
        resizeIfNeed();
    }

    public int find(Object item) {
        for (int i = 0; i < elemIndex; i++) {
            if (arr[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private void resizeIfNeed() {
        if (elemIndex == arr.length / 4) {
            resize(arr.length / 2);
        }
    }

    public int size() {
        return elemIndex;
    }

    public boolean isEmpty() {
        return elemIndex == 0;
    }

    private void resize(Integer size) {
        arr = Arrays.copyOf(arr, size);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<T> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current != arr.length;
        }

        @Override
        public T next() {
            return (T) arr[current++];
        }
    }
}
