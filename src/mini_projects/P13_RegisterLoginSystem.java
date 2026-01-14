package mini_projects;

import java.util.Scanner;

/*
Project: Register + Login System (Simple)

Flow:
1) Register (create username & password)
2) Login (3 attempts)
3) If wrong password -> option to reset password

Input:
- username & password (register)
- username & password (login)

Output:
- success/fail messages
*/
public class P13_RegisterLoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Register ===");
        System.out.print("Create username: ");
        String registeredUsername = input.nextLine().trim();

        System.out.print("Create password: ");
        String registeredPassword = input.nextLine();

        if (registeredUsername.isEmpty() || registeredPassword.isEmpty()) {
            System.out.println("ERROR! Username and password cannot be empty.");
            return;
        }

        System.out.println("\nRegistered successfully!");

        System.out.println("\n=== Login ===");
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Username: ");
            String username = input.nextLine().trim();

            System.out.print("Password: ");
            String password = input.nextLine();

            if (!username.equals(registeredUsername)) {
                System.out.println("ERROR! Username not found.");
                attempts--;
            } else if (password.equals(registeredPassword)) {
                System.out.println("Login successful! Welcome!");
                return;
            } else {
                System.out.println("Wrong password!");
                attempts--;

                if (attempts > 0) {
                    System.out.println("Remaining attempts: " + attempts);

                    System.out.print("Do you want to reset password? (yes/no): ");
                    String answer = input.nextLine().trim().toLowerCase();

                    if (answer.equals("yes")) {
                        System.out.print("Enter new password: ");
                        String newPass = input.nextLine();

                        if (newPass.isEmpty()) {
                            System.out.println("ERROR! Password cannot be empty.");
                        } else if (newPass.equals(registeredPassword)) {
                            System.out.println("ERROR! New password cannot be the same as old password.");
                        } else {
                            registeredPassword = newPass;
                            System.out.println("Password updated! Try login again.\n");
                        }
                    }
                }
            }

            if (attempts == 0) {
                System.out.println("No attempts left! Account locked!");
            }
        }
    }
}
