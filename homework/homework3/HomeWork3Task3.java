package homework3;

import java.util.Scanner;

public class HomeWork3Task3 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter finger num (between 1 and 10): ");
        int fingerNum = scanner.nextInt();

        switch (fingerNum) {
            case 1:
                System.out.println("Left little finger");
                break;
            case 2:
                System.out.println("Left ring finger");
                break;
            case 3:
                System.out.println("Left middle finger");
                break;
            case 4:
                System.out.println("Left index finger");
                break;
            case 5:
                System.out.println("Left thumb");
                break;
            case 6:
                System.out.println("Right thumb");
                break;
            case 7:
                System.out.println("Right index finger");
                break;
            case 8:
                System.out.println("Right middle finger");
                break;
            case 9:
                System.out.println("Right ring finger");
                break;
            case 10:
                System.out.println("Right little finger");
                break;
            default:
                System.out.println("People usually don't have finger number " + fingerNum);
        }
    }

}
