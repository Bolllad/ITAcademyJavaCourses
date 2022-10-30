import java.util.Scanner;

public class HomeWork3Task2 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter whole number: ");
        int wholeNum = scanner.nextInt();

        if (wholeNum % 2 == 0) {
            System.out.println("Number " + wholeNum + " is even.");
        } else {
            System.out.println("Number " + wholeNum + " is odd.");
        }
    }

}
