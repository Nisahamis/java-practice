package algorithms;

import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements
- target: number to search

Output:
- index of target (if found)
- message if not found
*/
public class A14_LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = input.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Found! Index: " + index);
        }
    }
}
