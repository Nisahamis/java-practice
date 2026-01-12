package algorithms;

import java.util.Scanner;

public class A08_SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n (to calculate sum of even numbers from 1 to n): ");
        int n = input.nextInt();

        int sum = 0;

        // Sum of even numbers between 1 and n
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers between 1 and " + n + ": " + sum);
    }
}
