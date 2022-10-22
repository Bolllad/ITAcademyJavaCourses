import java.util.Scanner;

public class HomeWork2Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5-digit value: ");
        char[] value = scanner.nextLine().toCharArray();

        if (value.length == 5) {
            System.out.print("3rd digit: " + value[2]);
        } else {
            System.out.print("Value must be 5-digits long!!!");
        }
    }

}
