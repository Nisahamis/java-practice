package mini_projects;

import java.util.Random;
import java.util.Scanner;

/*
Project: Rock Paper Scissors

Input:
- user choice: rock / paper / scissors

Output:
- computer choice
- win / lose / draw
*/
public class P11_RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Rock Paper Scissors ===");
        System.out.print("Enter your choice (rock/paper/scissors): ");
        String user = input.nextLine().trim().toLowerCase();

        String[] options = {"rock", "paper", "scissors"};
        String computer = options[random.nextInt(3)];

        if (!user.equals("rock") && !user.equals("paper") && !user.equals("scissors")) {
            System.out.println("ERROR! Invalid choice!");
            return;
        }

        System.out.println("Computer choice: " + computer);

        if (user.equals(computer)) {
            System.out.println("Result: Draw!");
        } else if (
                (user.equals("rock") && computer.equals("scissors")) ||
                        (user.equals("paper") && computer.equals("rock")) ||
                        (user.equals("scissors") && computer.equals("paper"))
        ) {
            System.out.println("Result: You WIN!");
        } else {
            System.out.println("Result: You LOSE!");
        }
    }
}
