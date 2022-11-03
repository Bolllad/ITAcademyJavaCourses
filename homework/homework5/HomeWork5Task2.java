package homework5;

public class HomeWork5Task2 {

    public static void main(final String[] args) {
        int[] array = {3, 5, 0, 1, 1, 3, 5, 2, 2, 2, 4};
        int[] cleanArray = new int[array.length];

        for (int counter = 0; counter < array.length; counter++) {
            boolean isRepeating = false;

            for (int innerCount = counter + 1; innerCount < array.length; innerCount++) {
                if (array[counter] == array[innerCount]) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                System.out.print(array[counter] + " ");
            }
        }
    }

}