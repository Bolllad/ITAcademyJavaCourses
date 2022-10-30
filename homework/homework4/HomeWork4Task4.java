package homework4;

public class HomeWork4Task4 {

    static int result = 0;
    public static void main(final String[] args) {


        for (int i = 1; i < 100000; i++) {
            findMatchingNums(i);
        }
        System.out.println(result);
    }

    static void findMatchingNums(int num) {
        for (int i = 10; i <= 100000; i *= 10) {
            if ((num % i) / (i / 10) == 4) {
                System.out.println(num);
                result++;
                return;
            }
        }

        int tmpFirstDigit = num % 10;
        for (int i = 100; i <= 100000; i *= 10) {
            int tmpSecondDigit = tmpFirstDigit;
            tmpFirstDigit = (num % i) / (i / 10);

            if (tmpFirstDigit == 1 && tmpSecondDigit == 3) {
                System.out.println(num);
                result++;
                return;
            }
        }
    }

}
