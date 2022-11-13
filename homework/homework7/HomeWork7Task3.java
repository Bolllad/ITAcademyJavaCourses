package homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task3 {

    public static void main(final String[] args) {
        String text = "Listen to the news from today, read the text at the same time!"
                + " Listen to the news from today - without reading the text.";

        Pattern pattern = Pattern.compile("[,.!-]");
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        System.out.println(text + "\nThere are " + counter + " punctuation marks in this text.");
    }

}
