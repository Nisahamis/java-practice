package algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements
- target: desired sum

Output:
- indices of two numbers whose sum equals target
- message if no pair exists

Example:
Array: 2 7 11 15
Target: 9
Output: Indices: 0 and 1
*/
public class A19_TwoSumHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = input.nextInt();

        Map<Integer, Integer> seen = new HashMap<>();
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < n; i++) {
            int needed = target - arr[i];

            if (seen.containsKey(needed)) {
                index1 = seen.get(needed);
                index2 = i;
                break;
            }

            seen.put(arr[i], i);
        }

        if (index1 == -1) {
            System.out.println("No pair found!");
        } else {
            System.out.println("Pair found!");
            System.out.println("Indices: " + index1 + " and " + index2);
            System.out.println("Values: " + arr[index1] + " + " + arr[index2] + " = " + target);
        }
    }
}
