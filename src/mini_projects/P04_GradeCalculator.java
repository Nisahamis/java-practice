package mini_projects;

import java.util.Scanner;

/*
Project: Grade Calculator

Input:
- midterm score (0-100)
- final score (0-100)

Rules:
- midterm: 40%
- final: 60%
- if final < 50 => FF

Output:
- average
- letter grade
*/
public class P04_GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter midterm score (0-100): ");
        double midterm = input.nextDouble();

        System.out.print("Enter final score (0-100): ");
        double fin = input.nextDouble();

        if (midterm < 0 || midterm > 100) {
            System.out.println("ERROR ❌ Midterm score must be between 0 and 100.");
            return;
        }

        if (fin < 0 || fin > 100) {
            System.out.println("ERROR ❌ Final score must be between 0 and 100.");
            return;
        }

        double average = midterm * 0.40 + fin * 0.60;

        String letter;

        if (fin < 50) {
            letter = "FF";
        } else if (average >= 90) {
            letter = "AA";
        } else if (average >= 85) {
            letter = "BA";
        } else if (average >= 80) {
            letter = "BB";
        } else if (average >= 75) {
            letter = "CB";
        } else if (average >= 70) {
            letter = "CC";
        } else if (average >= 65) {
            letter = "DC";
        } else if (average >= 60) {
            letter = "DD";
        } else if (average >= 50) {
            letter = "FD";
        } else {
            letter = "FF";
        }

        System.out.printf("%nAverage: %.2f%n", average);
        System.out.println("Letter Grade: " + letter);
    }
}
