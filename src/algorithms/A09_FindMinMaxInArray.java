package algorithms;

import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements

Output:
- minimum value in the array
- maximum value in the array
*/
public class A09_FindMinMaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
    }
}
