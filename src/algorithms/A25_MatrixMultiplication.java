package algorithms;

import java.util.Scanner;

/*
Input:
- r1, c1: size of Matrix A
- Matrix A elements
- r2, c2: size of Matrix B
- Matrix B elements

Output:
- Result matrix (A x B) if possible
- Error message if multiplication is not possible
*/
public class A25_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows of Matrix A: ");
        int r1 = input.nextInt();
        System.out.print("Enter columns of Matrix A: ");
        int c1 = input.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter Matrix A elements (" + r1 + "x" + c1 + "):");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.print("\nEnter rows of Matrix B: ");
        int r2 = input.nextInt();
        System.out.print("Enter columns of Matrix B: ");
        int c2 = input.nextInt();

        int[][] B = new int[r2][c2];
        System.out.println("Enter Matrix B elements (" + r2 + "x" + c2 + "):");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = input.nextInt();
            }
        }

        // Check multiplication possibility
        if (c1 != r2) {
            System.out.println("\nERROR! Matrix multiplication not possible!");
            System.out.println("Because columns of A must equal rows of B (c1 must be r2).");
            return;
        }

        int[][] C = new int[r1][c2];

        // Multiply
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }

        System.out.println("\nResult matrix (A x B):");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
