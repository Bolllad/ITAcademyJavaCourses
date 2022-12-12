package homework11;

import java.util.Random;
import java.util.Scanner;

public class HomeWork11Task1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(99) + 1;

        while (true) {
            try {
                int userNumber = scanner.nextInt();
                guessGame(userNumber, randomNumber);
                break;
            } catch (GuessGameException ex1) {
                ex1.printError();
                //ex1.printStackTrace();
            }
        }
    }

    public static void guessGame(int number, int randomNumber) throws GuessGameException {
        if (number == randomNumber) {
            System.out.println("Congrats, you've won!");
        } else {
            throw new GuessGameException(number, randomNumber);
        }
    }

}

class GuessGameException extends Exception {
    int number, randomNumber;

    public GuessGameException(int number, int randomNumber) {
        this.number = number;
        this.randomNumber = randomNumber;
    }

    public void printError() {
        if (number < randomNumber) {
            System.out.println("Your number is under the random number, try again.");
        } else {
            System.out.println("Your number is over the random number, try again.");
        }
    }
}