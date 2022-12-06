package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String type = sc.next();

        switch (type) {
            case "int" -> {
                int i = sc.nextInt();
                System.out.println(i % 2);
            }
            case "double" -> {
                double d = sc.nextDouble();
                System.out.println(d / 100 * 70);
            }
            case "float" -> {
                float f = sc.nextFloat();
                System.out.println(Math.abs(f));
            }
            case "char" -> {
                String str = sc.next();
                char c = str.charAt(0);
                System.out.println(c + ((int) c));
            }
            case "String" -> {
                String s = sc.next();
                System.out.println("Hello" + s);
            }
            default -> System.out.println("Unsupported type");
        }

    }
}
