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
            } catch (GuessGameException exception) {
                System.err.println(exception.getMessage());
            }
        }
    }

    public static void guessGame(int number, int randomNumber) throws GuessGameException {
        if (number == randomNumber) {
            System.out.println("Congrats, you've won!");
            return;
        }

        String errorMessage = number > randomNumber
                ? "Your number is over the random number, try again."
                : "Your number is under the random number, try again.";
            throw new GuessGameException(errorMessage);
    }

}

class GuessGameException extends Exception {
    public GuessGameException(String message) {
        super(message);
    }
}