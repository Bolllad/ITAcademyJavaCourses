package homework5;

public class HomeWork5Task3 {

    public static void main(final String[] args) {
        int[] array1 = {2, 4, 5, 10, 21}, array2 = {3, 7, 8, 12, 20}, newArray = new int[array1.length + array2.length];

        for (int counter = 0; counter < newArray.length; counter++) {
            for (int innerCount = counter; innerCount < array1.length; innerCount++) {
                if (array1[innerCount] < array2[innerCount]) {
                    newArray[counter] = array1[innerCount];
                    newArray[counter + 1] = array2[innerCount];
                    System.out.print(newArray[counter] + " " + newArray[counter + 1] + " ");
                    break;
                } else {
                    newArray[counter] = array2[innerCount];
                    newArray[counter + 1] = array1[innerCount];
                    System.out.print(newArray[counter] + " " + newArray[counter + 1] + " ");
                    break;
                }
            }
        }

        /*for (int counter = 0; counter < newArray.length - array1.length; counter++) {
            newArray[counter] = array1[counter];
        }

        for (int counter = 0; counter < newArray.length - array2.length; counter++) {
            newArray[counter + array1.length] = array2[counter];
        }

        for (int counter = 0; counter < newArray.length; counter++) {
            System.out.print(newArray[counter] + " ");
        } */
    }

}