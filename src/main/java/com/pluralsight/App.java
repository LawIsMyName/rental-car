package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tollTagPrice = 3.95;
        double gpsPrice = 2.95;
        double roadsidePrice = 3.95;

        System.out.print("Enter pickup date: ");
        String pickupDate = scanner.nextLine();
        scanner.nextLine();

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

    }
}
