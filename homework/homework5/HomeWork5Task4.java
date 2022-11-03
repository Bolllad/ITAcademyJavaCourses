package homework5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5Task4 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int count = 0; count < n; count++) {

            for (int innerCount = 0; innerCount < n; innerCount++) {

                if (count == innerCount) {
                    array[count][innerCount] = 0;
                } else if (count + innerCount == n - 1) {
                    array[count][innerCount] = 0;
                } else if (count > innerCount && count + innerCount < n) {
                    array[count][innerCount] = random.nextInt(9) - 10;
                } else if (count < innerCount && count + innerCount >= n) {
                    array[count][innerCount] = random.nextInt(9) - 10;
                } else {
                    array[count][innerCount] = random.nextInt(9) + 1;
                }

                System.out.print(array[count][innerCount] + " ");
            }

            System.out.println(" ");

            scanner.close();
        }
    }
}
