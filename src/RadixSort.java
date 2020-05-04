
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {

    public static String radixSortInt(int[] arr) {
        long iter = 0;
        Queue<Integer>[] buckets = new Queue[10];
        for (int i = 0; i < 10; i++)
            buckets[i] = new LinkedList<Integer>();

        boolean sorted = false;
        int exponenta = 1;

        while (!sorted) {
            sorted = true;
            for (int item : arr) {
                int bucket = (item / exponenta) % 10;
                if (bucket > 0) sorted = false;
                buckets[bucket].add(item);
            }

            exponenta *= 10;
            int index = 0;

            for (Queue<Integer> bucket : buckets)
                while (!bucket.isEmpty()) {
                    arr[index++] = bucket.remove();
                }

            iter++;
            if (!isSorted(arr)) sorted = false;
        }

        return String.valueOf(iter);
    }


    public static String radixSortChar(char[] arr) {
        long iter = 0;
        Queue<Integer>[] buckets = new Queue[10];
        for (int i = 0; i < 10; i++)
            buckets[i] = new LinkedList<Integer>();

        boolean sorted = false;
        int exponenta = 1;

        while (!sorted) {
            sorted = true;
            // 1 10 100 1000
            for (int item : arr) {
                int bucket = (item / exponenta) % 10;
                if (bucket > 0) sorted = false;
                buckets[bucket].add(item);
            }

            exponenta *= 10;
            int index = 0;

            for (Queue<Integer> bucket : buckets)
                while (!bucket.isEmpty()) {
                    arr[index++] = (char) (bucket.remove().intValue());
                }
            iter++;
            if (!isSorted(arr)) sorted = false;
        }
        return String.valueOf(iter);
    }

    public static String radixLinkedSort(LinkedList<Integer> arr) {
        long iter = 0;
        Queue<Integer>[] buckets = new Queue[10];
        for (int i = 0; i < 10; i++)
            buckets[i] = new LinkedList<Integer>();

        boolean sorted = false;
        int exponenta = 1;

        while (!sorted) {
            sorted = true;
            // 1 10 100 1000
            for (int item : arr) {
                int bucket = (item / exponenta) % 10;
                if (bucket > 0) sorted = false;
                buckets[bucket].add(item);
            }

            exponenta *= 10;
            int index = 0;

            for (Queue<Integer> bucket : buckets)
                while (!bucket.isEmpty()) {
                    arr.set(index++, bucket.remove());
                }
            iter++;
            if (!isSortedLinkedInt(arr)) sorted = false;
        }
        return String.valueOf(iter);
    }

    public static String radixLinkedSortChar(LinkedList<Character> arr) {
        long iter = 0;
        Queue<Integer>[] buckets = new Queue[10];
        for (int i = 0; i < 10; i++)
            buckets[i] = new LinkedList<Integer>();

        boolean sorted = false;
        int exponenta = 1;

        while (!sorted) {
            sorted = true;
            // 1 10 100 1000
            for (int item : arr) {
                int bucket = (item / exponenta) % 10;
                if (bucket > 0) sorted = false;
                buckets[bucket].add(item);
            }

            exponenta *= 10;
            int index = 0;

            for (Queue<Integer> bucket : buckets)
                while (!bucket.isEmpty()) {
                    arr.set(index++, (char) bucket.remove().intValue());
                }
            iter++;
            if (!isSortedLinkedChar(arr)) sorted = false;
        }
        return String.valueOf(iter);
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    private static boolean isSorted(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    private static boolean isSortedLinkedInt(LinkedList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).compareTo(arr.get(i + 1)) > 0) return false;
        }
        return true;
    }

    private static boolean isSortedLinkedChar(LinkedList<Character> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).compareTo(arr.get(i + 1)) > 0) return false;
        }
        return true;
    }
}
