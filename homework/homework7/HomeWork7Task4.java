package homework7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task4 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myEmail = scanner.next();

        Pattern pattern = Pattern.compile("\\S+@\\S+[.][\\D.]{2,6}");
        Matcher matcher = pattern.matcher(myEmail);

        if (matcher.find()) {
            System.out.println("Your email is valid");
        } else {
            System.out.println("Your email is invalid");
        }
    }

}
