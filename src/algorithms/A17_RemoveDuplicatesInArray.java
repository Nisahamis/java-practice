package algorithms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
Input:
- n: size of array
- n integers: array elements (space or Enter)

Output:
- array without duplicates (unique elements)
Example:
Input:  3 4 4 4 5 3 4
Output: 3 4 5
*/
public class A17_RemoveDuplicatesInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Keeps order + removes duplicates
        Set<Integer> unique = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            unique.add(arr[i]);
        }
        System.out.print("Array without duplicates: ");
        for (int value : unique) {
            System.out.print(value + " ");
        }
    }
}
