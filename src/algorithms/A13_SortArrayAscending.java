package algorithms;

import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements (space or Enter)

Output:
- sorted array in ascending order
*/
public class A13_SortArrayAscending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers (space or Enter):");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Bubble Sort (Ascending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array (ascending): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
