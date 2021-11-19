package com.company;

import java.util.Scanner;

/*
1) В банк положили s денег. Какой станет сумма вклада через n лет, если процент 1,5% добавляется к сумме
вклада ежемесячно.
Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to show 'Task #1'");
        scanner.nextLine();
        Task1.initDeposit();
    }


}