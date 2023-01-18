package homework14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HomeWork14Task2 {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

        Pattern pattern = Pattern.compile("[^a-z3]");
        List<String> filtered = myList.stream().filter(pattern.asPredicate()).sorted(Comparator.comparingInt(s -> Integer.parseInt(s))).peek(System.out::println).toList();
    }

}
