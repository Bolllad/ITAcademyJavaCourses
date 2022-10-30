package homework4;

public class HomeWork4Task5AlternativeSolution {

    public static void main(final String[] args) {
        int result = 0;
        String hrTmp, minTmp;

        for (int hrNum = 0; hrNum < 24; hrNum++) {
            for (int minNum = 0; minNum < 60; minNum++) {
                hrTmp = Integer.toString(hrNum).length() == 1 ? "0" + hrNum : Integer.toString(hrNum);
                minTmp = Integer.toString(minNum).length() == 1 ? "0" + minNum : Integer.toString(minNum);

                StringBuilder sB = new StringBuilder(minTmp);
                if (sB.reverse().toString().equals(hrTmp)) {
                    result++;
                    //System.out.println(hrTmp + ":" + minTmp + " make a symmetric pair! " + hrTmp + ":" + sB.reverse());
                }
            }
        }
        System.out.println(result);
    }

}
