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
            Integer counter = 0;

            if (!newMap.containsKey(chars[index])) {
                for (int innerIndex = index; innerIndex < chars.length; innerIndex++) {
                    if (chars[index] == chars[innerIndex]) {
                        counter++;
                    }
                }
                newMap.put(chars[index], counter);
            }
        }

        return newMap;
    }

}
