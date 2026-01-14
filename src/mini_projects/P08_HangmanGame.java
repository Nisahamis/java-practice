package mini_projects;

import java.util.Random;
import java.util.Scanner;

/*
Project: Hangman Game

Input:
- user guesses letters

Rules:
- a random word is chosen
- user has limited attempts
- correct letters are revealed

Output:
- progress of the word + win/lose message
*/
public class P08_HangmanGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"java", "computer", "algorithm", "developer", "keyboard", "science"};
        String secret = words[random.nextInt(words.length)];

        char[] hidden = new char[secret.length()];
        for (int i = 0; i < hidden.length; i++) {
            hidden[i] = '_';
        }

        int attempts = 6;
        boolean won = false;

        System.out.println("=== Hangman Game ===");
        System.out.println("Word length: " + secret.length());
        System.out.println("You have " + attempts + " attempts.\n");

        while (attempts > 0) {
            // show current progress
            System.out.print("Word: ");
            for (char c : hidden) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Enter a letter: ");
            String letterInput = input.nextLine().toLowerCase();

            if (letterInput.length() != 1) {
                System.out.println("ERROR! Please enter only 1 letter.\n");
                continue;
            }

            char guess = letterInput.charAt(0);
            boolean found = false;

            for (int i = 0; i < secret.length(); i++) {
                if (secret.charAt(i) == guess && hidden[i] == '_') {
                    hidden[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Wrong guess! Remaining attempts: " + attempts + "\n");
            } else {
                System.out.println("Good job!\n");
            }

            // check if completed
            boolean completed = true;
            for (char c : hidden) {
                if (c == '_') {
                    completed = false;
                    break;
                }
            }

            if (completed) {
                won = true;
                break;
            }
        }

        if (won) {
            System.out.println("You WON! The word was: " + secret);
        } else {
            System.out.println("You LOST! The word was: " + secret);
        }
    }
}
