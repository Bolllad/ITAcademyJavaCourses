package homework12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork12Task2 {

    public static void main(final String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt", StandardCharsets.UTF_8), 512)) {
            String line = reader.readLine();
            System.out.println(line);

            int symbolCounter = 0, wordCounter = 0;
            Pattern pattern = Pattern.compile("[,.]");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                symbolCounter++;
            }

            pattern = Pattern.compile("\\W+");
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                wordCounter++;
            }

            System.out.println("Symbols = " + symbolCounter + ", words = " + wordCounter);

        } catch (IOException ex) {
            ex.printStackTrace();
        }



    }

}
