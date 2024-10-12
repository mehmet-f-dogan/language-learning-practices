package solution;

import java.util.Arrays;
import java.util.Random;

public class MergeSortedArrays {
    public static void run() {
        System.out.println();
        System.out.println("Java Merge Sorted Arrays:");

        var array1 = generateRandomArray(100);
        var array2 = generateRandomArray(100);
        Arrays.sort(array1);
        Arrays.sort(array2);

        naiveCombine(array1, array2);
        smartCombine(array1, array2);
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Random integers from 0 to 99
        }

        return array;
    }

    private static int[] concatArrays(int[] array1, int[] array2) {
        var newArray = new int[array1.length + array2.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i < array1.length) {
                newArray[i] = array1[i];
            } else {
                int j = i - array1.length;
                newArray[i] = array2[j];
            }
        }
        return newArray;
    }

    private static void naiveCombine(int[] array1, int[] array2) {
        long startTime = System.nanoTime();

        var baseArray = concatArrays(array1, array2);
        Arrays.sort(baseArray);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Naive combine took " + duration + " nanoseconds.");
        printArray(baseArray);

    }

    private static void smartCombine(int[] array1, int[] array2) {
        long startTime = System.nanoTime();

        int array1Ptr = 0;
        int array2Ptr = 0;
        int combinedPtr = 0;
        var combinedArr = new int[array1.length + array2.length];

        int totalLen = array1.length + array2.length;

        while (array1Ptr + array2Ptr < totalLen) {
            int numberToAdd;
            int array1Number = Integer.MAX_VALUE;
            int array2Number = Integer.MAX_VALUE;

            if (array1Ptr < array1.length) {
                array1Number = array1[array1Ptr];
            }

            if (array2Ptr < array2.length) {
                array2Number = array2[array2Ptr];
            }

            if (array1Number < array2Number) {
                numberToAdd = array1Number;
                array1Ptr++;
            } else {
                numberToAdd = array2Number;
                array2Ptr++;
            }

            combinedArr[combinedPtr] = numberToAdd;
            combinedPtr++;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Smart combine took " + duration + " nanoseconds.");
        printArray(combinedArr);
    }

    public static void printArray(int[] array) {
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
