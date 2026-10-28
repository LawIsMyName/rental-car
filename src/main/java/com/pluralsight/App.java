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
    }
}
