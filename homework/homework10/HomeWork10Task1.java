package homework10;

import java.net.Inet4Address;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork10Task1<K> {

    public static void main(final String[] args) {
        Float[] floatArray = {94.2f, 12f, 826.5f};
        Map<Float, Integer> testMap = arrayToMap(floatArray, 1);
        System.out.println(testMap.toString());
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks, int index) {
        Integer counter = 0;
        for (K item : ks) {
            counter++;
        }

        Map<K, Integer> newMap = new HashMap<>();
        newMap.put(ks[index], counter);

        return newMap;
    }

}
