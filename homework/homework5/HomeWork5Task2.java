package homework5;

public class HomeWork5Task2 {

    public static void main(final String[] args) {
        int length = 1;
        int[] array = {3, 5, 0, 1, 1, 3, 5, 2, 2, 2, 4}, longerArray = new int[length];

        for (int counter = 0; counter < array.length; counter++) {
            boolean isRepeating = false;

            for (int innerCount = 0; innerCount < longerArray.length - 1; innerCount++) {
                if (array[counter] == longerArray[innerCount]) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                longerArray[length - 1] = array[counter];
                int[] savedArray = longerArray.clone();

                if (counter < array.length - 1) {
                    length++;
                    longerArray = new int[length];
                }

                for (int arrayCounter = 0; arrayCounter < savedArray.length; arrayCounter++) {
                    longerArray[arrayCounter] = savedArray[arrayCounter];
                }
            }
        }

        for (int count = 0; count < longerArray.length; count++) {
            System.out.print(longerArray[count] + " ");
        }
    }

}