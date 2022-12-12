package homework10;

import java.util.HashMap;
import java.util.Map;

public class HomeWork10Task2 {

    public static void main(final String[] args) {
        Map<Character, Integer> charsCount = getCharsCount("star wars");
        System.out.println(charsCount.toString());
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> newMap = new HashMap<>();
        char[] chars = s.toCharArray();

        for (int index = 0; index < chars.length; index++) {
            newMap.merge(chars[index], 1, Integer::sum);
        }

        return newMap;
    }

}
