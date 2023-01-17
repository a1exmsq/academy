package by.academy.homework5.task3;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] matrix;
    private int i, j;
    public MatrixIterator(T[][] matrix) {
        super();
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return i < matrix.length && j < matrix[i].length;
    }

    @Override
    public T next() {
        T next = matrix[i][j++];
        if (j >= matrix[i].length) {
            i++;
            j = 0;
        }
        return next;
    }
}








