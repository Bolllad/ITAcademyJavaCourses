package homework5;

public class HomeWork5Task3 {

    public static void main(final String[] args) {
        int[] array1 = {2, 4, 5, 10, 21}, array2 = {3, 7, 8, 12, 20}, newArray = new int[array1.length + array2.length];
        int newArrayLength = 0, array2MinIndex = 0, min;

        for (int array1Index = 0; array1Index < array1.length; array1Index++) {
            min = array1[array1Index];

            for (int array2Index = array2MinIndex; array2Index < array2.length; array2Index++) {
                if (min > array2[array2Index]) {
                    min = array2[array2Index];
                    array2MinIndex++;
                    array1Index--;
                    break;
                }
            }

            newArray[newArrayLength] = min;
            newArrayLength++;
        }

        for (int count = 0; count < newArray.length; count++) {
            System.out.print(newArray[count] + " ");
        }
    }

}