package homework9;

public class HomeWork9Task1 {

    public static void main(final String[] args) {
        Pair<Integer, Float> integerStringPair = new Pair<>(69, 16.7f);
        System.out.println("First element in pair: " + integerStringPair.first() + ", last: " + integerStringPair.last());

        integerStringPair.swap();
        System.out.println("Elements were swapped! First element in pair: " + integerStringPair.first() + ", last: " + integerStringPair.last());

        integerStringPair.replaceFirst(129);
        integerStringPair.replaceLast(420.99f);
        System.out.println("Elements were replaced! First element in pair: " + integerStringPair.first() + ", last: " + integerStringPair.last());
    }

}

class Pair<T, Y> {
    private T firstElem;
    private Y secondElem;

    Pair(T fistElem, Y secondElem) {
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

    public Y last() {
        return secondElem;
    }

    public void swap() {
        T savedElem = firstElem;
        firstElem = (T) secondElem;
        secondElem = (Y) savedElem;
    }

    public void replaceFirst(T newElem) {
        firstElem = newElem;
    }

    public void replaceLast(Y newElem) {
        secondElem = newElem;
    }

    public T getFirstElem() {
        return firstElem;
    }

    public Y getSecondElem() {
        return secondElem;
    }

}