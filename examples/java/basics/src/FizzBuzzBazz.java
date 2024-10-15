public class FizzBuzzBazz {
    public static void run(int limit) {
        System.out.println();
        System.out.println("Java Loops:");
        whileLoop(limit);
        doWhileLoop(limit);
        forLoop(limit);
    }

    private static void whileLoop(int limit){
        var iterator = 1;
        while (iterator <= limit) {
            if (iterator %7 == 0) {
                System.out.println(iterator + " Bazz");
            } else if (iterator %15 == 0) {
                System.out.println(iterator + " FizzBuzz");
            } else if (iterator %5 == 0) {
                System.out.println(iterator + " Buzz");
            } else if (iterator %3 == 0) {
                System.out.println(iterator + " Fizz");
            } else {
                System.out.println(iterator);
            }
            iterator++;
        }
    }
    private static void doWhileLoop(int limit){
        var iterator = 1;
        do {
            if (iterator %7 == 0) {
                System.out.println(iterator + " Bazz");
            } else if (iterator %15 == 0) {
                System.out.println(iterator + " FizzBuzz");
            } else if (iterator %5 == 0) {
                System.out.println(iterator + " Buzz");
            } else if (iterator %3 == 0) {
                System.out.println(iterator + " Fizz");
            } else {
                System.out.println(iterator);
            }
            iterator++;
        }while (iterator <= limit);
    }

    private static void forLoop(int limit){
        for (int iterator = 1; iterator <= limit; iterator++) {
            if (iterator %7 == 0) {
                System.out.println(iterator + " Bazz");
            } else if (iterator %15 == 0) {
                System.out.println(iterator + " FizzBuzz");
            } else if (iterator %5 == 0) {
                System.out.println(iterator + " Buzz");
            } else if (iterator %3 == 0) {
                System.out.println(iterator + " Fizz");
            } else {
                System.out.println(iterator);
            }
        }
    }
}
