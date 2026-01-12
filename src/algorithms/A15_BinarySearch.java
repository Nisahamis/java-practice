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

Important:
- Binary Search works only on SORTED arrays.
*/
public class A15_BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers in ASCENDING order:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = input.nextInt();

        int left = 0;
        int right = n - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Found! Index: " + index);
        }
    }
}
