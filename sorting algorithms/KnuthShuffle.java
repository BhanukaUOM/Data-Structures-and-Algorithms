package practice.algorithms.sorting;

import java.util.concurrent.ThreadLocalRandom;

public class KnuthShuffle {

    public static void shuffle(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = ThreadLocalRandom.current().nextInt(0, i+1);
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }
}
