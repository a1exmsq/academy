package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите возраст:");
        int age = sc.nextInt();
        System.out.println("Введите сумму покупки:");
        double sum = sc.nextDouble();

        if (sum < 100) {
            sum = sum - ((sum / 100) * 5);
            System.out.println("Финальная цена: " + sum + "руб.");
        } else if (sum >= 100 && sum < 200) {
            sum = sum - ((sum / 100) * 7);
            System.out.println("Финальная цена: " + sum + "руб.");
        } else if (sum >= 200 && sum < 300) {
            if (age >= 18) {
                sum = sum - ((sum / 100) * (12 + 4));
                System.out.println("Финальная цена: " + sum + "руб.");
            } else {
                sum = sum - ((sum / 100) * (12 - 3));
                System.out.println("Финальная цена: " + sum + "руб.");
            }
        } else if (sum >= 300 && sum < 400) {
            sum = sum - ((sum / 100) * 15);
            System.out.println("Финальная цена: " + sum + "руб.");
        } else if (sum >= 400) {
            sum = sum - ((sum / 100) * 20);
            System.out.println("Финальная цена: " + sum + "руб.");
        }
    }
}
