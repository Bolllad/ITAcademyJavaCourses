package homework3;

import java.util.Scanner;

public class HomeWork3Task1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 digits: ");
        int digit1 = scanner.nextInt(), digit2 = scanner.nextInt(), digit3 = scanner.nextInt();
        int result = (digit1 + digit2 + digit3) / 3;

        System.out.println("Average = " + result);
    }

}
