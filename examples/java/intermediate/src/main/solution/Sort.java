package solution;

import java.util.ArrayList;

public class Sort {
    public static void run() {
        System.out.println();
        System.out.println("Java Sort Algorithms:");

        var size = 10000;
        var numbers = Util.generateRandomArray(size);

        selectionSort(numbers.clone());
        insertionSort(numbers.clone());
    }

    private static void selectionSort(int[] values) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(values.length);
        long startTime = System.nanoTime();

        for (int i = 0; i < values.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < values.length; j++) {
                min = Integer.min(min, values[j]);
            }
            numbers.add(min);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Selection sort took " + duration + " nanoseconds.");
    }

    private static void insertionSort(int[] values) {

        ArrayList<Integer> unsortedNumbers = new ArrayList<Integer>();
        for (Integer integer : values) {
            unsortedNumbers.add(integer);
        }
        ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();

        long startTime = System.nanoTime();

        for (int i = 0; i < values.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < unsortedNumbers.size(); j++) {
                var currentNumber = unsortedNumbers.get(j);
                if (min > currentNumber) {
                    min = currentNumber;
                    index = j;
                }
            }
            sortedNumbers.add(min);
            unsortedNumbers.remove(index);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Insertion sort took " + duration + " nanoseconds.");
    }

}
