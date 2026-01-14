package mini_projects;

import java.util.Random;
import java.util.Scanner;

/*
Project: Number Guessing Game

Input:
- guesses from user (1-100)

Rules:
- computer picks a random number between 1 and 100
- user guesses until correct
- program says "Higher" or "Lower"

Output:
- hints + number of attempts
*/
public class P07_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1; // 1..100
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I picked a number between 1 and 100. Try to guess it!");

        while (true) {
            System.out.print("Enter your guess (1-100): ");
            int guess = input.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("ERROR! Guess must be between 1 and 100.");
                continue;
            }

            if (guess == secret) {
                System.out.println("Correct! You found it in " + attempts + " attempt(s)!");
                break;
            } else if (guess < secret) {
                System.out.println("Your guess is LOWER than the secret number.⬆ Try a higher number!");
            } else {
                System.out.println("Your guess is HIGHER than the secret number.⬇ Try a lower number!");
            }
        }
    }
}
