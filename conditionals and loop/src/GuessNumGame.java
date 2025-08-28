import java.util.Random;
import java.util.Scanner;

public class GuessNumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Choose difficulty level:");
        System.out.println("1. Easy (1 - 10)");
        System.out.println("2. Medium (1 - 50)");
        System.out.println("3. Hard (1 - 100)");

        int choice = sc.nextInt();
        int maxRange = 10; // default

        switch (choice) {
            case 1: maxRange = 10;
            break;
            case 2: maxRange = 50;
            break;
            case 3: maxRange = 100;
            break;
            default:
                System.out.println("Invalid choice! Setting to Easy mode.");
        }

        int numberToGuess = rand.nextInt(maxRange) + 1; // random number in range
        int guess = 0;
        int attempts = 0;

        System.out.println("I have picked a number between 1 and " + maxRange + ". Can you guess it?");

        // Game loop
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
