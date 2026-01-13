package algorithms;

import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements

Output:
- maximum subarray sum (largest sum of a contiguous subarray)

Example:
Array: -2 1 -3 4 -1 2 1 -5 4
Output: Max subarray sum: 6
*/
public class A29_MaxSubarraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Max subarray sum: " + maxSum);
    }
}
