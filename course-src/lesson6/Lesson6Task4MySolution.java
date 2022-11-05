package lesson6;

import java.util.Random;

public class Lesson6Task4MySolution {

    public static void main(final String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];

        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < array[rowIndex].length; columnIndex++) {
                array[rowIndex][columnIndex] = random.nextInt(10);
                System.out.print(array[rowIndex][columnIndex] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for (int resultCount = 0; resultCount < (array.length * 2 - 1); resultCount++) {
            int multiplyResult = 1;

            if (resultCount < 5) {
                for (int rowIndex = 4 - resultCount, columnIndex = 0; rowIndex < array.length; rowIndex++, columnIndex++) {
                    multiplyResult *= array[rowIndex][columnIndex];
                    System.out.print(array[rowIndex][columnIndex] + " * ");
                }
            } else {
                for (int rowIndex = 0, columnIndex = resultCount - 4; columnIndex < array[rowIndex].length; rowIndex++, columnIndex++) {
                    multiplyResult *= array[rowIndex][columnIndex];
                    System.out.print(array[rowIndex][columnIndex] + " * ");
                }
            }

            System.out.print("\b\b= " + multiplyResult + "\n");
        }
    }

}