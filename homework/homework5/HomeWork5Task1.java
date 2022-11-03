package homework5;

import java.util.Random;

public class HomeWork5Task1 {

    public static void main(final String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        int max = 0, maxOdd = 0, maxEven = 0;

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = random.nextInt(10);

            if (array[counter] > max) {
                max = array[counter];
            }

            if (array[counter] % 2 == 0 && array[counter] > maxEven) {
                maxEven = array[counter];
            } else if (array[counter] % 2 != 0 && array[counter] > maxOdd) {
                maxOdd = array[counter];
            }

            System.out.print(array[counter] + " ");
        }

        System.out.println("\nMax = " + max + ", max odd = " + maxOdd + ", max even = " + maxEven);
    }

}
