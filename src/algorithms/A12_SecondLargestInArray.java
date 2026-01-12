package algorithms;

import java.util.Scanner;

/*
Input:
- n: size of array (n must be >= 2)
- n integers: array elements (space or Enter)

Output:
- largest number in the array
- second largest number in the array
*/
public class A12_SecondLargestInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("ERROR! Array size must be at least 2.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers (space or Enter):");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Largest value: " + max);

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second largest value: Not found (all numbers may be equal).");
        } else {
            System.out.println("Second largest value: " + secondMax);
        }
    }
}
