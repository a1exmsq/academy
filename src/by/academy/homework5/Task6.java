package by.academy.homework5;

import java.util.Arrays;
import java.util.Random;

public class Task6 {

    static Random rnd = new Random();

    public static void main(String[] args) {
        int[] arr = new int[8];
        try {
            for (int i = 0; i < 10; i++){
                arr[i] = rnd.nextInt(100);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is to small, expand the array");
        }
        System.out.println(Arrays.toString(arr));

        }
    }

