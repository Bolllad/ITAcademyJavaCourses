package homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork4Task4AlternativeSolution {

    public static void main(final String[] args) {
        int result = 0;

        for (int i = 1; i < 100000; i++) {
            Pattern pattern = Pattern.compile("4|13");
            Matcher matcher = pattern.matcher(Integer.toString(i));
            boolean matchFound = matcher.find();

            if(matchFound) {
                System.out.println(i);
                result++;
            }
        }
        System.out.println(result);
    }

}
