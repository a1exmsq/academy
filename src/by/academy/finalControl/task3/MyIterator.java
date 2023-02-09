package by.academy.finalControl.task3;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private T[] array;
    private int index;

    @Override
    public boolean hasNext() {
        if (array == null || array.length <= index) {
            return false;
        }

        return array[index] != null;
    }

    @Override
    public T next() {
        return array[index++];
    }

    public MyIterator(MyIterator<T>[] arrayIterators) {
        super();
    }
}
