package mini_projects;

import java.util.Scanner;

/*
Project: Login System

Input:
- username
- password

Rules:
- user has 3 attempts
- if correct => login successful
- if incorrect => tries decrease

Output:
- success / fail messages
*/
public class P06_LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "nisoki";
        String correctPassword = "1234";

        int attempts = 3;

        System.out.println("=== Login System ===");

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome!");
                return;
            } else {
                attempts--;
                System.out.println("Login failed!");

                if (attempts > 0) {
                    System.out.println("Remaining attempts: " + attempts);
                } else {
                    System.out.println("No attempts left! Account locked!");
                }
            }
        }
    }
}
