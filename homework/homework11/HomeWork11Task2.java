package homework11;

import java.util.Scanner;

public class HomeWork11Task2 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyDivider myDivider = new MyDivider();

        int a = scanner.nextInt(), b = scanner.nextInt();

        try {
            System.out.println(myDivider.divide(a, b));
        } catch (ArithmeticException zeroException) {
            System.out.println("Can't divide by zero! " + zeroException);
        }
    }
}

interface Divider {
    default float divide(int a, int b) {
        return (float) a / b;
    }
}

class MyDivider implements Divider {
    @Override
    public float divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return (float) a / b;
    }
}