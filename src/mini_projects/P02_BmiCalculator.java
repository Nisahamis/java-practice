package mini_projects;

import java.util.Scanner;

/*
Project: BMI Calculator

Input:
- weight (kg)
- height (m OR cm)

Output:
- BMI value
- BMI category

Note:
- If user enters height like 166 => it will be treated as 1.66 m (cm -> m conversion)
- If user enters 1.66 => it will be used directly
*/
public class P02_BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (m or cm): ");
        double height = input.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("ERROR! Weight and height must be positive!");
            return;
        }

        // If height is entered like 166, 170, etc. convert cm -> m
        if (height > 3) {
            height = height / 100;
            System.out.println("(Height converted to meters: " + height + " m)");
        }

        // basic realistic validation
        if (height < 0.5 || height > 2.5) {
            System.out.println("ERROR! Invalid height value!");
            return;
        }

        double bmi = weight / (height * height);

        System.out.println("\nYour BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
    }
}
