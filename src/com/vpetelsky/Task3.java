package com.vpetelsky;

import java.util.Scanner;

/* 3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
Входящие параметры: массив и число.

(считаем что массива который нам передали отсортирован, проверять это не нужно)
*/
public class Task3 {
    public static void initBinarySearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find: ");
        //int[] testArray = new int[] { 23, 2, 12, 22, 53, 94, 32, 54, 11, 45 }; // Unsorted
        int[] testArray = new int[]{2, 11, 12, 22, 23, 32, 45, 53, 54, 94}; // Sorted
        int number = scanner.nextInt();
        System.out.printf("Searching result for number '%d' returned '%s'\n", number, binarySearch(testArray, number));
    }

    private static boolean binarySearch(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            int mid = (left + right) / 2;
            if (array[mid] == number) {
                return true;
            } else if (array[mid] < number) {
                left = mid + 1;
            } else if (array[mid] > number) {
                right = mid - 1;
            }
        }

        return false;
    }
}
