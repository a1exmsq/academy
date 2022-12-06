package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));

        for (String s : arr) {
            System.out.println(String.valueOf((s.toCharArray())));
        }
    }
}
