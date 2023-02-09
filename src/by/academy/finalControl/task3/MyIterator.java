package by.academy.finalControl.task3;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private MyIterator<MyIterator<T>> iterators;

    private MyIterator<T> iterator;

    @Override
    public boolean hasNext() {
       return iterator != null;
    }

    @Override
    public T next() {
        T t = iterator.next();

        while (iterator != null && !iterator.hasNext()){
            iterator = this.iterators.hasNext() ? this.iterators.next() : null;
        }

        return t;
    }


}
