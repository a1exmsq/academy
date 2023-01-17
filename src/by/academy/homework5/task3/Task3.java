package by.academy.homework5.task3;

public class Task3 {
    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][]{{1,9,2},{2,6,8},{1,7,3},{0,0,0,0,0,0,0,0,0}};
        MatrixIterator<Integer> matrixIterator = new MatrixIterator<>(matrix);
        while (matrixIterator.hasNext()) {
            Integer i = matrixIterator.next();
            System.out.println(i);
        }
    }
}
