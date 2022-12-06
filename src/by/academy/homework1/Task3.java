package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num = sc.nextInt();
        if (num >= 10 || num < 1) {
            System.out.println("Число не подходит");
            return;
        }
        System.out.printf("Таблица умножения для числа %d:" + "\n", num );

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = " + num * i, num, i);
            System.out.println();
        }
    }
}
