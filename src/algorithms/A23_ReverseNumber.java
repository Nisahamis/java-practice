package algorithms;

import java.util.Scanner;

/*
Input:
- an integer number

Output:
- reversed number

Example:
Input:  12340
Output: 4321
*/
public class A23_ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int original = n;
        n = Math.abs(n);

        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }

        if (original < 0) reversed *= -1;

        System.out.println("Reversed number: " + reversed);
    }
}
