package algorithms;

import java.util.Scanner;

/*
Input:
- n1: size of first array
- n1 integers in ascending order
- n2: size of second array
- n2 integers in ascending order

Output:
- merged sorted array (ascending)

Example:
Array1: 1 3 5 7
Array2: 2 4 6
Output: 1 2 3 4 5 6 7
*/
public class A28_MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of first array (n1): ");
        int n1 = input.nextInt();

        int[] a = new int[n1];
        System.out.println("Enter " + n1 + " integers for first array (ascending order):");
        for (int i = 0; i < n1; i++) {
            a[i] = input.nextInt();
        }

        System.out.print("\nEnter size of second array (n2): ");
        int n2 = input.nextInt();

        int[] b = new int[n2];
        System.out.println("Enter " + n2 + " integers for second array (ascending order):");
        for (int i = 0; i < n2; i++) {
            b[i] = input.nextInt();
        }

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            merged[k] = a[i];
            i++;
            k++;
        }

        while (j < n2) {
            merged[k] = b[j];
            j++;
            k++;
        }

        System.out.print("\nMerged sorted array: ");
        for (int x : merged) {
            System.out.print(x + " ");
        }
    }
}
