package by.academy.homework4.task4;

public class Main {

    public static void main(String[] args) {

        Integer[] array = { 1, 2, 3, 5, 7, 8, 3, 2, 5, 7, 9 };
        Integer[] array1 = { null, null, null };
        ArrayIterator<Integer> arrIterator = new ArrayIterator<>(array);

        while (arrIterator.hasNext()) {
            Integer i = arrIterator.next();
            System.out.println(i);
        }

    }

}
