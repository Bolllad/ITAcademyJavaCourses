package homework9;

import java.lang.reflect.Array;

public class HomeWork9Task2 {

    public static void main(final String[] args) {
        Iterator<Integer> myArray = new Iterator<>(new Integer[][]{{93, 25}, {12, 354}, {12, 93}});
        System.out.println(myArray.next());
    }

}

class Iterator<T> {
    private final T[][] array;
    private int index1 = 0, index2 = 0;

    Iterator(T[][] array) {
        this.array = array.clone();
    }

    public boolean hasNext(int index1, int index2) {
        if (index1 + 1 < array.length) {
            this.index1++;
            return true;
        } else if (index2 + 1 < array[index1].length) {
            this.index1 = 0;
            this.index2++;
            return true;
        }
        return false;
    }

    public Object next() {
        if (hasNext(index1, index2)) {
            next();
        }
        return array[index1][index2];
    }
}