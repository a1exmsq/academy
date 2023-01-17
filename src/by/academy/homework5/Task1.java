package by.academy.homework5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 55, 55, "a", "a", "bbb", "bbb"));
        System.out.println(al);
        System.out.println(collectionWithoutDuplicates(al));
    }

    public static Set<Object> collectionWithoutDuplicates(Collection<Object> al) {
        return new LinkedHashSet<>(al);
    }
}
