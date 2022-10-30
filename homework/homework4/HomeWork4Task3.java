package homework4;

import java.util.Scanner;

public class HomeWork4Task3 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n = scanner.nextInt(), result = 1;

        System.out.print("\n" + n + "! = ");        //Outputs "10! = " into console (n is 10 in this ex.)
        for (int i = 0; i < n; i++) {
            result *= n - i;
            System.out.print(n - i);

            if (i == n - 1)
                break;                  //Skips the multiply symbol output is last iteration (...3 * 2 * 1 end)
            System.out.print(" * ");
        }
        System.out.print(" = " + result);           //Outputs result at the end of the line (...3 * 2 * 1[ = result])

        scanner.close();
    }

}
