package com.vpetelsky;

import java.util.Scanner;

/* 1) В банк положили s денег. Какой станет сумма вклада через n лет, если процент 1,5% добавляется к сумме
вклада ежемесячно.
Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.
*/
public class Task1 {

    private static final double INTEREST_RATE = 1.5;

    public static void initDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        int initialAmount = scanner.nextInt();
        System.out.println("Enter years number: ");
        int years = scanner.nextInt();
        double depositAmount = getDepositAmount(initialAmount, years);

        System.out.printf("In %d years the deposit amount will be: %.2f$\n\n", years, depositAmount);
    }

    private static double getDepositAmount(double initialAmount, int years) {
        double sum = initialAmount;
        for (int i = 0; i < years * 12; i++) {
            sum += initialAmount * (INTEREST_RATE / 100);
        }

        return sum;
    }
}
