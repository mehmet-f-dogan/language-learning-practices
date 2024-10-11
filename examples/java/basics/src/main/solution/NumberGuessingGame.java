package solution;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void run(){
        System.out.println();
        System.out.println("Java Number Guessing Game:");
        
        int target = generateRandomInt(100);
        int numberOfGuesses = 0;
        int guess;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            guess = scanner.nextInt();
            numberOfGuesses++;
            if (guess == target) {
                break;                
            } else if (guess > target) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        scanner.close();

        System.out.println("You have found the correct number in " + numberOfGuesses + " guesses.");

    }
    
    private static int generateRandomInt(int max){
        var randomDouble = Math.random() * max;
        randomDouble++;
        return (int)randomDouble;
    }
}
