import java.util.Scanner;

public class HomeWork2Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3-digit number");
        char[] n = scanner.nextLine().toCharArray(); //массив символов получаемый из строки

        if (n.length == 3) {
            System.out.print("Sum = " + (Character.getNumericValue(n[0]) + Character.getNumericValue(n[1]) + Character.getNumericValue(n[2])));
        } else {
            System.out.println("Number must be 3-digit long!!!");
        }
    }

}
