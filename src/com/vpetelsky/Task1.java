package com.vpetelsky;

import java.util.Scanner;

/*
1) В банк положили s денег. Какой станет сумма вклада через n лет, если процент 1,5% добавляется к сумме
вклада ежемесячно.
Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.
*/
public class Task1 {

    public static final double INTEREST_RATE = 0.015;

    public static void initDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        int initialAmount = scanner.nextInt();
        System.out.println("Enter years: ");
        int years = scanner.nextInt();

        System.out.printf("The sum will be: %.2f$\n", Task1.getDeposit(initialAmount, years));
    }

    public static double getDeposit(double initialAmount, int years) {
        double sum = initialAmount;
        for (int i = 0; i < years * 12; i++) {
            sum += initialAmount * INTEREST_RATE;
        }

        return sum;
    }
}
