package homework7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task2 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();

        myString = myString.trim();
        StringBuilder sb = new StringBuilder(myString);

        Pattern pattern = Pattern.compile(" {2}");
        Matcher matcher = pattern.matcher(sb);


        while (matcher.find()) {
            sb.replace(matcher.start(), matcher.start() + 2, " ");
            matcher = pattern.matcher(sb);
        }

        System.out.println(sb);
    }

}
