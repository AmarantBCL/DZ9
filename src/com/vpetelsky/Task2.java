package com.vpetelsky;

/* 2) Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99 со
следующими изменениями:
(!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)

- если число кратно 3 то вывести вместо него Hello
- если число кратно 5 то вывести вместо него World
- если число кратно и 3 и 5 то вывести вместо него HelloWorld
*/
public class Task2 {

    private static final int MIN = 1;
    private static final int MAX = 99;

    public static void initHelloWorld() {
        System.out.println(getHelloWorld() + "\n");
    }

    private static String getHelloWorld() {
        StringBuilder sb = new StringBuilder();
        for (int i = MIN; i < MAX + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sb.append("HelloWorld ");
            } else if (i % 3 == 0) {
                sb.append("Hello ");
            } else if (i % 5 == 0) {
                sb.append("World ");
            } else {
                sb.append(i + " ");
            }
        }

        return sb.toString();
    }
}
