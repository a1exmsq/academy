package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            System.out.println("Строки имеют разное количество символов!");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        System.out.println(Arrays.toString(arr1) + " ");
        System.out.println();
        System.out.println(Arrays.toString(arr2) + " ");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

            }
        }
    }
}
