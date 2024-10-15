import java.util.ArrayList;

public class Fibonacci {
    public static void run(int order){
        
        if (order < 1) {
            return;
        }

        System.out.println();
        System.out.println("Java Fibonacci:");
        iterative(order);
        recursive(order);
    }

    private static void iterative(int order){
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(1);


        long startTime = System.nanoTime();

        for (int i = 1; i <= order - 2; i++) {
            int newNumber = fibonacciNumbers.get(fibonacciNumbers.size() - 1) + fibonacciNumbers.get(fibonacciNumbers.size() - 2);
            fibonacciNumbers.add(newNumber);
        }

        int result = fibonacciNumbers.getLast();

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(result);
        System.out.println("Iterative function took " + duration + " nanoseconds.");
    }

    private static void recursive(int order){
        long startTime = System.nanoTime();

        int result = recursive_calculation(order);
        
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(result);
        System.out.println("Recursive function took " + duration + " nanoseconds.");
    }

    private static int recursive_calculation(int order){
        if (order < 3){
            return 1;
        }
        return recursive_calculation(order - 1) + recursive_calculation(order - 2);
    }
}
