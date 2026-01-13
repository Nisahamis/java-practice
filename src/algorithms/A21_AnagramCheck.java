package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/*
Input:
- word1: first word
- word2: second word

Output:
- Anagram  (if they contain the same letters)
- Not anagram

Note:
- Case-insensitive
- Ignores spaces
*/
public class A21_AnagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String w1 = input.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Enter second word: ");
        String w2 = input.nextLine().toLowerCase().replace(" ", "");

        if (w1.length() != w2.length()) {
            System.out.println("Not anagram!");
            return;
        }

        char[] a1 = w1.toCharArray();
        char[] a2 = w2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagram!");
        } else {
            System.out.println("Not anagram!");
        }
    }
}
