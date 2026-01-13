package algorithms;

import java.util.Scanner;

/*
Input:
- a sentence (text)

Output:
- number of words in the sentence

Note:
- multiple spaces are handled
*/
public class A22_WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = input.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }

        String[] words = text.split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}
