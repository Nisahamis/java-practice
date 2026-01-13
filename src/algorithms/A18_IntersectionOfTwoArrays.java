package algorithms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
Input:
- n1: size of first array
- n1 integers: elements of first array
- n2: size of second array
- n2 integers: elements of second array

Output:
- intersection (common elements) of two arrays (unique)

Example:
Array1: 1 2 2 3 4
Array2: 2 4 4 5
Output: 2 4
*/
public class A18_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of first array (n1): ");
        int n1 = input.nextInt();

        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " integers for first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.print("Enter size of second array (n2): ");
        int n2 = input.nextInt();

        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " integers for second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        Set<Integer> set1 = new LinkedHashSet<>();
        for (int x : arr1) set1.add(x);

        Set<Integer> intersection = new LinkedHashSet<>();
        for (int x : arr2) {
            if (set1.contains(x)) {
                intersection.add(x);
            }
        }

        System.out.print("Intersection (common elements): ");
        if (intersection.isEmpty()) {
            System.out.print("No common elements");
        } else {
            for (int x : intersection) {
                System.out.print(x + " ");
            }
        }
    }
}
