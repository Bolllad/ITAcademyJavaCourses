package homework2;

import java.util.Scanner;

public class HomeWork2Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        char[] value = scanner.nextLine().toCharArray();

        System.out.print("Last number in value: " + value[value.length - 1]);

        scanner.close();
    }

}
