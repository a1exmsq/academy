package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task4 {

    static Random rnd = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i < 18; i++) {
            al.add(rnd.nextInt(10) + 1);
            System.out.println("Ученик " + i + ": " + al.get(i - 1));
        }

        Iterator<Integer> listIterator = al.iterator();

        Integer maxValue = 0;

        while (listIterator.hasNext()) {
            Integer grade = listIterator.next();

            if (grade > maxValue)
                maxValue = grade;
            }
            System.out.println("Самая высокая оценка: " + maxValue);

    }
}
