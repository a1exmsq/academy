package by.academy.deal;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Person {

    private String name;

    private double money;

    private LocalDate dateOfBirth;

    private String phone;

    private String email;

    static Scanner sc = new Scanner(System.in);

    static Pattern patternA = Pattern.compile("(^0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4}$)");

    static Pattern patternB = Pattern.compile("(^0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4}$)");

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Person() {
    }
}
