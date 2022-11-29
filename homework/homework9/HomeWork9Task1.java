package homework9;

public class HomeWork9Task1 {

    public static void main(final String[] args) {
        Pair<Integer> integerStringPair = new Pair<>(69, 16);
        System.out.println("First element in pair: " + integerStringPair.first() + ", last: "
                + integerStringPair.last());

        integerStringPair.swap();
        System.out.println("Elements were swapped! First element in pair: " + integerStringPair.first() + ", last: "
                + integerStringPair.last());

        integerStringPair.replaceFirst(129);
        integerStringPair.replaceLast(420);
        System.out.println("Elements were replaced! First element in pair: " + integerStringPair.first() + ", last: "
                + integerStringPair.last());
    }

}

class Pair<T> {
    private T firstElem;
    private T secondElem;

    Pair(T fistElem, T secondElem) {
        this.firstElem = fistElem;
        this.secondElem = secondElem;
    }

    Pair() {
        firstElem = null;
        secondElem = null;
    }

    public T first() {
        return firstElem;
    }

    public T last() {
        return secondElem;
    }

    public void swap() {
        T savedElem = firstElem;
        firstElem = secondElem;
        secondElem = savedElem;
    }

    public void replaceFirst(T newElem) {
        firstElem = newElem;
    }

    public void replaceLast(T newElem) {
        secondElem = newElem;
    }

    public T getFirstElem() {
        return firstElem;
    }

    public T getSecondElem() {
        return secondElem;
    }

}