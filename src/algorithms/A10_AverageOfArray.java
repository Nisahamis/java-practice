package algorithms;

import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements (can be entered with spaces or Enter)

Output:
- average of the numbers
*/
public class A10_AverageOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Average: " + average);
    }
}
