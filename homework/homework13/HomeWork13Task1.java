package homework13;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class HomeWork13Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 digits for the array: ");

        Stream.Builder<Integer> integerArray = Stream.builder();
        for (int arraySize = 0; arraySize < 10; arraySize++) {
            integerArray.add(scanner.nextInt());
        }
        List<Integer> integerList = integerArray.build().toList();

        Runnable min, max;
        min = () -> System.out.println("min is " + Collections.min(integerList));
        max = () -> System.out.println("max is " + Collections.max(integerList));

        Thread threadMin = new Thread(min);
        Thread threadMax = new Thread(max);
        threadMin.start();
        threadMax.start();
    }

}