package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первую строку: ");
        String str1 = sc.next();
        System.out.println("Введите вторую строку: ");
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            System.out.println("Строки имеют разное количество символов!");
            return;
        }

        System.out.printf("Является ли строка %s перестановкой символов строки %s: "
                + permutationOfSymbols(str1, str2), str1, str2);

    }
    public static boolean permutationOfSymbols(String str1, String str2) {
        int[] arr = new int[500];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i)] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i)] -= 1;
        }
        for (int j : arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
