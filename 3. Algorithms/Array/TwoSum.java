import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* First Integer denotes the Size of Array */
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        /* Second Integer is the searched Sum */
        int targetSum = scanner.nextInt();

        for (int i = 0; i < arrayLength; i++) {
                array[i] = scanner.nextInt();
        }
        int[] result = findTwoSumIndices(array, targetSum);
        System.out.printf("First Index: %d\n Second Index: %d", result[0], result[1]);
}

public static int[] findTwoSumIndices(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(target - arr[i])) {
                        int[] out = new int[2];
                        out[0] = i;
                        out[1] = map.get(target - arr[i]);
                        return out;
                }
                map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No Match Found");
}
}
