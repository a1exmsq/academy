package by.academy.homework3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Task4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        System.out.println("Введите месяц: ");
        int month = sc.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Некорректно введен месяц");
            return;
        }
        System.out.println("Введите день: ");

        int dayOfMonth = sc.nextInt();
        if (dayOfMonth < 1 || dayOfMonth > 31){
            System.out.println("Некорректно введен день");
            return;
        }

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("День: <dd> \nМесяц: <MM> \nГод: <yyyy>");
        LocalDate date = LocalDate.of(year, month, dayOfMonth);
        System.out.println(dtf.format(date));
    }
}
