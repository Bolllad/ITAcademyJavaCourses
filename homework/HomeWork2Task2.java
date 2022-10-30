import java.util.Scanner;

public class HomeWork2Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value q: ");
        int q = scanner.nextInt();

        System.out.print("Enter value w: ");
        int w = scanner.nextInt();

        if ((q > 0) && (w > 0)) {
            System.out.println("q / w = " + (q / w) + "\nremainder = " + (q % w));
        } else {
            System.out.println("Both values must be greater than 0!!!");
        }

        scanner.close();
    }

}
