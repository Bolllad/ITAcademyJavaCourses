package homework2;

import java.util.Scanner;

public class HomeWork2Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 4-digit value: ");  // Получаем значение
        String value = scanner.nextLine();

        if (value.length() == 4) {                  // проверяем длинну
            String[] abcd = value.split("(?<=\\G..)");  //делим по два числа с помощью регулярного выражения
            System.out.print(abcd[0] + " + " + abcd[1] + " = " + (Integer.parseInt(abcd[0]) + Integer.parseInt(abcd[1])));
        } else {
            System.out.print("Value must be 4-digits long!!!");
        }

        scanner.close();
    }

}
