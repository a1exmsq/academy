package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество слов: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите слово №%d: ", i + 1);
            arr[i] = sc.next();
        }

        int[] unique = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char[] word = arr[i].toCharArray();
            int[] counter = new int[500];
            for (char c : word) {
                counter[c]++;
                if (counter[c] == 1) {
                    unique[i]++;
                }
            }
        }

        int min = unique[0];
        int minIndex = 0;

        for (int l = 0; l < unique.length; l++) {
            if (min > unique[l]) {
                min = unique[l];
                minIndex = l;
            }
        }

        System.out.println("Первое слово с минимальным количеством различных символов: " + arr[minIndex]);
        System.out.printf("Количество уникальных символов в слове %s: " + unique[minIndex], arr[minIndex]);
    }
}

