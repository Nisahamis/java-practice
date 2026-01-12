package algorithms;

import java.util.Scanner;

public class A03_Factorial {

    public static long factorialIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Factorial (Iterative): " + factorialIterative(n));
        System.out.println("Factorial (Recursive): " + factorialRecursive(n));
    }
}
