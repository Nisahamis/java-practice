package algorithms;

import java.util.Scanner;

public class A07_SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        n = Math.abs(n);

        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
