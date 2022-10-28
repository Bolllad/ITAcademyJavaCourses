import java.util.Scanner;

public class HomeWork3Task5 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 integers (day, month, year): ");
        int day = scanner.nextInt() + 1, month = scanner.nextInt(), year = scanner.nextInt();

        if (day > 32 || day < 2 || month > 12 || month < 1) {
            System.out.println("There can't be such thing as " + day + "." + month + "." + year + " please enter proper date!");
        } else {

            if (day > 31 && month == 12) {
                day = 1;
                month = 1;
                year++;
            } else if (day > 31) {
                day = 1;
                month++;
            }

            System.out.print(day);
            switch (month) {
                case 1:
                    System.out.print(" January ");
                    break;
                case 2:
                    System.out.print(" February ");
                    break;
                case 3:
                    System.out.print(" March ");
                    break;
                case 4:
                    System.out.print(" April ");
                    break;
                case 5:
                    System.out.print(" May ");
                    break;
                case 6:
                    System.out.print(" June ");
                    break;
                case 7:
                    System.out.print(" July ");
                    break;
                case 8:
                    System.out.print(" August ");
                    break;
                case 9:
                    System.out.print(" September ");
                    break;
                case 10:
                    System.out.print(" October ");
                    break;
                case 11:
                    System.out.print(" November ");
                    break;
                case 12:
                    System.out.print(" December ");
                    break;
            }
            System.out.print(year);
        }
    }

}
