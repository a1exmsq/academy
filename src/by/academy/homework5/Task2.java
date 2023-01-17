package by.academy.homework5;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;



public class Task2 {
    static Random rnd = new Random();

    public static void main(String[] args) {
        LocalTime begin1 = LocalTime.now();
        ArrayList<Integer> al = new ArrayList<>();
        addToList(al);
        getFromList(al);
        LocalTime end1 = LocalTime.now();
//        System.out.println(al);
        LocalTime begin2 = LocalTime.now();
        LinkedList<Integer> ll = new LinkedList<>();
        addToList(ll);
        getFromList(ll);

//        System.out.println(ll);
        LocalTime end2 = LocalTime.now();
        System.out.println("al = " + Duration.between(begin1, end1));
        System.out.println("ll = " + Duration.between(begin2, end2));
        //results al = PT0.1670376S
        //        ll = PT33.8781825S
    }

    public static void addToList(List<Integer> list){

        for (int index = 0; index < 1000000; index++){
            list.add(index, rnd.nextInt(100));
        }
    }

    public static void getFromList (List<Integer> list){

        for (int attempt = 0; attempt < 100000; attempt++){
            System.out.println(list.get(rnd.nextInt(1000000)));

        }
    }
}
