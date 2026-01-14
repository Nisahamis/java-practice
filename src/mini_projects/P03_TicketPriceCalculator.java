package mini_projects;

import java.util.Scanner;

/*
Project: Ticket Price Calculator

Input:
- distance (km)
- age
- trip type (1 = One Way, 2 = Round Trip)

Rules:
- Price per km: 0.10 TL
- Age discounts:
  * age < 12  -> 50%
  * 12 <= age <= 24 -> 10%
  * age > 65 -> 30%
- Round trip discount: 20% (applied after age discount)
- Round trip price is multiplied by 2

Output:
- final ticket price
*/
public class P03_TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        int distance = input.nextInt();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter trip type (1 = One Way, 2 = Round Trip): ");
        int tripType = input.nextInt();

        if (distance <= 0) {
            System.out.println("ERROR! Distance error! Distance must be positive.");
            return;
        }

        if (age <= 0) {
            System.out.println("ERROR! Age error! Age must be positive.");
            return;
        }

        if (tripType != 1 && tripType != 2) {
            System.out.println("ERROR! Choice error! Trip type must be 1 or 2.");
            return;
        }


        double basePrice = distance * 0.10;
        double finalPrice = basePrice;

        // Age discount
        if (age < 12) {
            finalPrice *= 0.50;
        } else if (age <= 24) {
            finalPrice *= 0.90;
        } else if (age > 65) {
            finalPrice *= 0.70;
        }

        // Round trip discount
        if (tripType == 2) {
            finalPrice *= 0.80; // 20% discount
            finalPrice *= 2;    // round trip
        }

        System.out.printf("\nFinal ticket price: %.4f TL%n", finalPrice);

    }
}
