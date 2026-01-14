package mini_projects;

import java.util.Scanner;

/*
Project: Zodiac Finder

Input:
- birth day (valid day for month)
- birth month (1-12)

Output:
- zodiac sign
*/
public class P01_ZodiacFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter birth day: ");
        int day = input.nextInt();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        // Month validation
        if (month < 1 || month > 12) {
            System.out.println("ERROR! Invalid month!");
            return;
        }

        // Day validation (general)
        if (day < 1 || day > 31) {
            System.out.println("ERROR! Invalid day!");
            return;
        }

        // Days in month validation
        int maxDay;

        if (month == 2) {
            maxDay = 29; // (Leap year not included in this simple project)
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else {
            maxDay = 31;
        }

        if (day > maxDay) {
            System.out.println("ERROR! Invalid date! This month has maximum " + maxDay + " days.");
            return;
        }

        String zodiac = "Unknown";

        if (month == 1) {
            zodiac = (day <= 19) ? "Capricorn" : "Aquarius";
        } else if (month == 2) {
            zodiac = (day <= 18) ? "Aquarius" : "Pisces";
        } else if (month == 3) {
            zodiac = (day <= 20) ? "Pisces" : "Aries";
        } else if (month == 4) {
            zodiac = (day <= 19) ? "Aries" : "Taurus";
        } else if (month == 5) {
            zodiac = (day <= 20) ? "Taurus" : "Gemini";
        } else if (month == 6) {
            zodiac = (day <= 20) ? "Gemini" : "Cancer";
        } else if (month == 7) {
            zodiac = (day <= 22) ? "Cancer" : "Leo";
        } else if (month == 8) {
            zodiac = (day <= 22) ? "Leo" : "Virgo";
        } else if (month == 9) {
            zodiac = (day <= 22) ? "Virgo" : "Libra";
        } else if (month == 10) {
            zodiac = (day <= 22) ? "Libra" : "Scorpio";
        } else if (month == 11) {
            zodiac = (day <= 21) ? "Scorpio" : "Sagittarius";
        } else if (month == 12) {
            zodiac = (day <= 21) ? "Sagittarius" : "Capricorn";
        }

        System.out.println("Zodiac Sign: " + zodiac);
    }
}
