package homework2;

import java.util.Scanner;

public class HomeWork2Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2-digit number");
        char[] n = scanner.nextLine().toCharArray(); //массив символов получаемый из строки

        if (n.length == 2) { //getNumericValue преобразет char значение в int
            System.out.print(n[0] + " + " + n[1] + " = " + (Character.getNumericValue(n[0]) + Character.getNumericValue(n[1])));
        } else {
            System.out.println("Number must be 2-digit long!!!");
        }

        scanner.close();
    }

}
