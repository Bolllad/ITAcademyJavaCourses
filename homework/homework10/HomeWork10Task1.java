package homework10;

import java.util.HashMap;
import java.util.Map;

public class HomeWork10Task1<K> {

    public static void main(final String[] args) {
        Integer[] integers = {4, 6, 3, 2, 2, 1, 6};
        Map<Integer, Integer> testMap = arrayToMap(integers);
        System.out.println(testMap.toString());
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> newMap = new HashMap<>();

        for (int index = 0; index < ks.length; index++) {
            newMap.merge(ks[index], 1, Integer::sum);
        }

        return newMap;
    }

}
