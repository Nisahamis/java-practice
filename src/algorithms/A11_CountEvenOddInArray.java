package algorithms;

import java.util.Scanner;

/*
Input:
- n: size of array
- n integers: array elements (space or Enter)

Output:
- count of even numbers
- count of odd numbers
*/
public class A11_CountEvenOddInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size (n): ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
