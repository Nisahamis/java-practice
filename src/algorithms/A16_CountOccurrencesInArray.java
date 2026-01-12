package algorithms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements (space or Enter)

Output:
- each number and how many times it appears in the array
Example:
3 4 4 4 5 3 4
3: 2 times
4: 4 times
5: 1 time
*/
public class A16_CountOccurrencesInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers (space or Enter):");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Keeps insertion order (first time seen order)
        Map<Integer, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            int value = arr[i];

            if (frequency.containsKey(value)) {
                frequency.put(value, frequency.get(value) + 1);
            } else {
                frequency.put(value, 1);
            }
        }

        System.out.println("\nOccurrences:");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count == 1) {
                System.out.println(number + ": " + count + " time");
            } else {
                System.out.println(number + ": " + count + " times");
            }
        }
    }
}
