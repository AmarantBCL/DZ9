package com.company;

import java.util.Scanner;

public class Task1 {

    public static final double INTEREST_RATE = 0.015;

    public static void initDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        int initialAmount = scanner.nextInt();
        System.out.println("Enter years: ");
        int years = scanner.nextInt();

        System.out.printf("The sum will be: %.2f$", Task1.getDeposit(initialAmount, years));
    }

    public static double getDeposit(double initialAmount, int years) {
        double sum = initialAmount;
        for (int i = 0; i < years * 12; i++) {
            sum += initialAmount * INTEREST_RATE;
        }

        return sum;
    }
}
