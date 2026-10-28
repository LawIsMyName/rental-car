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
        System.out.println("Basic Car Rental: $" + getRentalInfo.basicRental());
        System.out.println("Options Cost: $" + getRentalInfo.optionsCost());
        System.out.println("Underage Driver Surcharge: $" + getRentalInfo.underageSurcharge());
        System.out.println("Total Cost: $" + getRentalInfo.total());


    }

    private static getRentalInformation getGetRentalInformation(Scanner scanner) {

        // Rental prices
        double tollTagPrice = 3.95;
        double gpsPrice = 2.95;
        double roadsidePrice = 3.95;
        double dailyRentalPrice = 29.99;

        System.out.print("Enter pickup date: ");
        String pickupDate = scanner.nextLine();

        // Prompts for user
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

        // Calculate basic rental cost
        double basicRental = dailyRentalPrice * rentalDays;

        // Calculate optional services
        double optionsCost = 0;

        if (tollTag.equalsIgnoreCase("yes")) {
            optionsCost = optionsCost + (tollTagPrice * rentalDays);
        }

        if (gps.equalsIgnoreCase("yes")) {
            optionsCost = optionsCost + (gpsPrice * rentalDays);
        }

        if (roadside.equalsIgnoreCase("yes")) {
            optionsCost = optionsCost + (roadsidePrice * rentalDays);
        }

        // Calculate underage surcharge
        double underageSurcharge = 0;

        if (age < 25) {
            underageSurcharge = basicRental * 0.30;
        }

        // Calculate final rental cost
        double total = basicRental + optionsCost + underageSurcharge;

        return new getRentalInformation(pickupDate, rentalDays, age, basicRental, optionsCost, underageSurcharge, total);

    }

    private record getRentalInformation( String pickupDate, int rentalDays, int age, double basicRental, double optionsCost, double underageSurcharge, double total) {
    }
}
