package homework3;

import java.util.Scanner;

public class HomeWork3Task4 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of seconds: ");
        int initialSeconds = scanner.nextInt();
        int overallMinutes = initialSeconds / 60, hours = overallMinutes / 60;
        int seconds = initialSeconds - overallMinutes * 60, minutes = overallMinutes - hours * 60; //

        if (hours == 1) {
            System.out.print(hours + " hour ");
        } else if (hours > 1) {
            System.out.print(hours + " hours ");
        }

        if (minutes == 1) {
            System.out.print(minutes + " minute ");
        } else if (minutes > 1) {
            System.out.print(minutes + " minutes ");
        } else if (hours > 0 && seconds > 0) {
            System.out.print(minutes + " minutes ");
        }

        if (seconds == 1) {
            System.out.print(seconds + " second");
        } else if (seconds > 1) {
            System.out.print(seconds + " seconds ");
        }

    }

}
