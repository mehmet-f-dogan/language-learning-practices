package solution;

import java.util.Arrays;

public class Search {

    public static void run() {
        System.out.println();
        System.out.println("Java Search Algorithms:");

        var size = 1000000;
        var numbers = Util.generateRandomArray(size);
        var target = numbers[(int) (Math.random() * size)];
        Arrays.sort(numbers);

        linearSearch(numbers, target);
        binarySearch(numbers, target);

    }

    private static void linearSearch(int[] numbers, int target) {
        long startTime = System.nanoTime();

        for (int i : numbers) {
            if (i == target) {
                break;
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Linear search took " + duration + " nanoseconds.");
    }

    private static void binarySearch(int[] numbers, int target) {
        var newNumbers = numbers.clone();

        long startTime = System.nanoTime();

        binarySearchRecursive(newNumbers, 0, numbers.length - 1, target);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Binary search took " + duration + " nanoseconds.");
    }

    private static void binarySearchRecursive(int[] numbers, int lo, int hi, int target) {
        var index = (hi + lo) / 2;
        var mid = numbers[index];
        if (mid > target) {
            binarySearchRecursive(numbers, lo, index - 1, target);
        } else if (mid < target) {
            binarySearchRecursive(numbers, index + 1, hi, target);
        } else {
            return;
        }
    }

}
