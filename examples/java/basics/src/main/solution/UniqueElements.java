package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UniqueElements {
    public static void run() {
        System.out.println();
        System.out.println("Java Unique Elements:");

        var baseArray = generateRandomArray(100);
        var baseIntegerArray = removeDuplicates(baseArray);
        printArray(baseArray);
        printArray(baseIntegerArray);

    }

    private static Integer[] removeDuplicates(int[] base) {
        Map<Integer, Integer> itemCountMap = HashMap.newHashMap(base.length);
        for (Integer integer : base) {
            var count = itemCountMap.getOrDefault(integer, 0);
            count++;
            itemCountMap.put(integer, count);
        }

        ArrayList<Integer> resultArrayList = new ArrayList<>();
        for (Integer integer : base) {
            if (itemCountMap.get(integer) == 1) {
                resultArrayList.add(integer);
            }
        }

        return resultArrayList.toArray(new Integer[]{});
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Random integers from 0 to 99
        }

        return array;
    }

    private static void printArray(Object[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
