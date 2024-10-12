package solution;

import java.util.Random;

public class ArrayRotation {
    public static void run(int rotationAmount){
        System.out.println();
        System.out.println("Java Array Rotation:");

        var baseArray = generateRandomArray(10);
        printArray(baseArray);

        int normalizedRotationAmount = rotationAmount % baseArray.length;

        for (int i = 0; i < normalizedRotationAmount; i++) {
            baseArray = rotateArrayOnce(baseArray);
        }

        printArray(baseArray);

    }

    private static int[] rotateArrayOnce(int[] base){
        var newArray = new int[base.length];
        newArray[0] = base[base.length - 1];
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = base[i - 1];
        }
        return newArray;
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Random integers from 0 to 99
        }
        
        return array;
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
