package homework9;

import java.lang.reflect.Array;

public class HomeWork9Task2 {

    public static void main(final String[] args) {
        Iterator<Integer> integerIterator = new Iterator<>(6);
        System.out.println("integerIterator.hasNext(3,5) = " + integerIterator.hasNext(3, 4));
        System.out.println("Next item after 3, 5 = " + integerIterator.next(3, 4));
    }

}

class Iterator<T> {
    private T[][] array;

    Iterator(T[][] array) {
        this.array = array;
    }

    Iterator(int size) {
        array = (T[][]) new Array[size][size];
    }

    public boolean hasNext(int index, int index2) {
        if (index + 1 < array.length && index2 + 1 < array[index].length) {
            return true;
        }
        return false;
    }

    public Object next(int index, int index2) {
        if (index + 1 < array.length && index2 + 1 < array[index].length) {
            return array[index + 1][index2 + 1];
        }
        return -1;
    }
}