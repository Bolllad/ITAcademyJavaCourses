package homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomeWork13Task2 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        Generator generator = new Generator(integerList);
        Thread generatorThread;

        while (integerList.size() < 100) {
            generatorThread = new Thread(generator);
            generatorThread.start();
        }
    }

}

class Generator extends Thread {
    List<Integer> integerList;

    public Generator(List<Integer> integerList) {
        this.integerList = integerList;
    }


    @Override
    public void run() {
        Random random = new Random();

        integerList.add(random.nextInt(499) + 1);
        System.out.println(integerList.get(integerList.size() - 1));

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}