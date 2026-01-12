package algorithms;

import java.util.Scanner;

public class A05_PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = input.nextLine();

        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if (text.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not palindrome.");
        }
    }
}
