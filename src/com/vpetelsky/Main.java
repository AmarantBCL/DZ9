package com.vpetelsky;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to show 'Task #1'");
        scanner.nextLine();
        Task1.initDeposit();

        System.out.println("Press ENTER to show 'Task #2'");
        scanner.nextLine();
        Task2.initHelloWorld();

        System.out.println("Press ENTER to show 'Task #3'");
        scanner.nextLine();
        Task3.initBinarySearch();
    }
}