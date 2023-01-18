package homework14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class HomeWork14Task1 {

    public static void main(String[] args) throws NoSuchFieldException {
        Collection<Integer> col = new ArrayList<Integer>();

        while (col.size() < 10) {
            Random random = new Random();

            col.add(random.nextInt(9) + 1);

        }
        System.out.println(col.toString());

        Integer max = col.stream().mapToInt(v -> v).max().orElseThrow(NoSuchFieldException::new);
        Integer min = col.stream().mapToInt(v -> v).min().orElseThrow(NoSuchFieldException::new);

        Integer average = col.stream().mapToInt(v -> v).sum() / col.size();
        Integer multiplication = col.stream().mapToInt(v -> v).reduce((x, y) -> x * y).orElseThrow();

        Integer sum = col.stream().mapToInt(v -> v).sum();

        System.out.println("max = " + max + ", min = " + min + ", average = " + average + ", multiplication = " + multiplication + ", sum = " + sum);
    }

}
