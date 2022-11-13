package homework7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();

        StringBuilder sb = new StringBuilder(myString);
        Pattern pattern = Pattern.compile("^abc");
        Matcher matcher = pattern.matcher(myString);

        if (matcher.find()) {
            sb.replace(0, 3, "www");
        } else {
            sb.append("ttt");
        }

        System.out.println(sb);
    }

}
