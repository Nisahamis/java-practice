package algorithms;

import java.util.Scanner;

public class A04_Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        // Fibonacci series: 0 1 1 2 3 5 8 ...
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;  // next term
            a = b;
            b = c;
        }
    }
}
