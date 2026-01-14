package mini_projects;

import java.util.Random;
import java.util.Scanner;

/*
Project: Password Generator

Input:
- length of password

Output:
- generated random password

Note:
- uses letters + digits + symbols
*/
public class P12_PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter password length: ");
        int length = input.nextInt();

        if (length < 4) {
            System.out.println("ERROR! Password length must be at least 4.");
            return;
        }

        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_=+<>?";

        String allChars = letters + digits + symbols;

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password += allChars.charAt(index);
        }

        System.out.println("Generated password: " + password);
    }
}
