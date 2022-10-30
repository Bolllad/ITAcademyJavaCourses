package homework4;

public class HomeWork4Task5 {

    public static void main(final String[] args) {
        int result = 0;

        for (int hrNum = 0; hrNum < 24; hrNum++) {
            for (int minNum = 0; minNum < 60; minNum++) {
                if (isSymmetric(hrNum, minNum)) {
                    result++;
                    //System.out.println(hrNum + ":" + minNum + " make a symmetric pair! " + hrNum + ":" + (minNum / 10) + (minNum % 10));
                }
            }
        }
        System.out.println(result);
    }

    static boolean isSymmetric(int digitOne, int digitTwo) {
        int digitOneFirstTmp = digitOne % 10, digitOneSecondTmp = digitOne / 10;
        int digitTwoFirstTmp = digitTwo % 10, digitTwoSecondTmp = digitTwo / 10;

        return digitOneFirstTmp == digitTwoSecondTmp && digitOneSecondTmp == digitTwoFirstTmp;
    }

}
