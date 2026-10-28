package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        getRentalInformation getRentalInfo = getGetRentalInformation(scanner);

        System.out.println("===== RENTAL SUMMARY =====");
        System.out.println("Pickup Date: " + getRentalInfo.pickupDate());
        System.out.println("Rental Days: " + getRentalInfo.rentalDays());
        System.out.println("Customer Age: " + getRentalInfo.age());
        System.out.println("Optional Services Total: $" + getRentalInfo.total());

    }

    private static getRentalInformation getGetRentalInformation(Scanner scanner) {
        double tollTagPrice = 3.95;
        double gpsPrice = 2.95;
        double roadsidePrice = 3.95;

        System.out.print("Enter pickup date: ");
        String pickupDate = scanner.nextLine();

        System.out.print("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Would you like an electronic toll tag? (yes/no): ");
        String tollTag = scanner.nextLine();

        System.out.print("Would you like GPS? (yes/no): ");
        String gps = scanner.nextLine();

        System.out.print("Would you like roadside assistance? (yes/no): ");
        String roadside = scanner.nextLine();

        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        double total = 0;

        if (tollTag.equalsIgnoreCase("yes")) {
            total = total + (tollTagPrice * rentalDays);
        }

        if (gps.equalsIgnoreCase("yes")) {
            total = total + (gpsPrice * rentalDays);
        }

        if (roadside.equalsIgnoreCase("yes")) {
            total = total + (roadsidePrice * rentalDays);
        }
        return new getRentalInformation(pickupDate, rentalDays, age, basicRental, optionsCost, underageSurcharge, total);

    }

    private record getRentalInformation( String pickupDate, int rentalDays, int age, double basicRental, double optionsCost, double underageSurcharge, double total) {
    }
}
