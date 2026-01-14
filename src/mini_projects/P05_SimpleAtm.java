package mini_projects;

import java.util.Scanner;

/*
Project: Simple ATM

Menu:
1 - Check Balance
2 - Deposit Money
3 - Withdraw Money
4 - Exit

Input:
- menu choice
- amount (for deposit/withdraw)

Output:
- updated balance and messages
*/
public class P05_SimpleAtm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 1000; // initial balance
        int choice;

        System.out.println("=== Welcome to Simple ATM ===");

        while (true) {
            System.out.println("\n1- Check Balance");
            System.out.println("2- Deposit Money");
            System.out.println("3- Withdraw Money");
            System.out.println("4- Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.printf("Current Balance: %.2f TL%n", balance);

            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double amount = input.nextDouble();

                if (amount <= 0) {
                    System.out.println("ERROR! Amount must be positive.");
                } else {
                    balance += amount;
                    System.out.printf("Deposit successful! New balance: %.2f TL%n", balance);
                }

            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                double amount = input.nextDouble();

                if (amount <= 0) {
                    System.out.println("ERROR! Amount must be positive.");
                } else if (amount > balance) {
                    System.out.println("ERROR! Insufficient balance!");
                } else {
                    balance -= amount;
                    System.out.printf("Withdraw successful! New balance: %.2f TL%n", balance);
                }

            } else if (choice == 4) {
                System.out.println("Goodbye...");
                break;

            } else {
                System.out.println("ERROR! Invalid choice. Please select 1-4.");
            }
        }
    }
}
