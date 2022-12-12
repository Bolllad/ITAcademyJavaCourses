package homework9;

import java.lang.reflect.Array;

public class HomeWork9Task2 {

    public static void main(final String[] args) {
        int size = 6, counter = 0;

        Iterator<Integer> integerIterator = new Iterator<>(size);

        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + ", ");
            counter++;

            if (counter % size == 0) {
                System.out.print("\n");
            }
        }
    }

}

class Iterator<T> {
    private final T[][] array;
    int innerIndex = 0, outerIndex = 0;

    Iterator(T[][] array) {
        this.array = array;
    }

    Iterator(int size) {
        array = (T[][]) new Array[size][size];
    }

    public boolean hasNext() {
        if (outerIndex == array[innerIndex].length) {
            outerIndex = 0;
            innerIndex++;
        }
        return innerIndex < array.length && (outerIndex < array[innerIndex].length);
    }

    public Object next() {
        T result = array[innerIndex][outerIndex];
        outerIndex++;
        return result;
    }
}