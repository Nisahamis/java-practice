package algorithms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements (space or Enter)

Output:
- the most frequent element(s) in the array
- their frequency

Example:
Array: 2 2 3 3
Output: Most frequent elements: 2 3 (2 times)
*/
public class A26_MostFrequentElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Map<Integer, Integer> freq = new LinkedHashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int maxCount = 0;
        for (int count : freq.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.print("Most frequent element(s): ");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println("(" + maxCount + " times)");
    }
}
