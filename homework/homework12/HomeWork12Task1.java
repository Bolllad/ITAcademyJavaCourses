package homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class HomeWork12Task1 {

    static void createFile(String fileName) {
        Random random = new Random();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, StandardCharsets.UTF_8), 256)) {
            for (int counter = 0; counter <= 1000; counter++) {
                bufferedWriter.append(String.valueOf(random.nextInt(99999) + 1)).append(" ");
            }

            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static List<Integer> readFile(String fileName) {
        List<Integer> integerList = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8), 512)) {
                String line = reader.readLine();

                integerList = Stream.of(line.split(" "))
                        .map(Integer::parseInt)
                        .toList();
                return integerList;

        } catch (FileNotFoundException ex) {
            System.out.println("File " + fileName + " does not exist.");
        } catch (IOException ex) {
            System.out.println("Something went wrong.");
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
            return integerList;
    }

    public static void main(final String[] args) {
        createFile("in1.txt");
        createFile("in2.txt");
        List<Integer> integerList = Stream.concat(readFile("in1.txt").stream(), readFile("in2.txt").stream())
                .sorted()
                .toList();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt", StandardCharsets.UTF_8), 256)) {
            for (Integer integer : integerList) {
                bufferedWriter.append(String.valueOf(integer)).append(" ");
            }

            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
