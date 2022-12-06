package by.academy.homework1;

public class Task4 {

    public static void main(String[] args) {
        int x = 2;
        int exp = 0;
        int res = 0;

        for(int i = 1; exp <= 1_000_000; i++) {
            exp = (int) Math.pow(x, i);
            res = i;
            System.out.println(i);
        }
        System.out.printf("При %d-ой степени числа %d результат будет больше чем 1_000_000",res, x);
    }
}

