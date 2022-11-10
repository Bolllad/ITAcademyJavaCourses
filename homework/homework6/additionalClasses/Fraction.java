package homework6.additionalClasses;

public class Fraction {
    int numerator, denominator;

    public Fraction(int... num) {
        numerator = num[0];
        denominator = num[1];
    }

    public String output() {
        return numerator + "/" + denominator;
    }

    public double add(int numerator, int denominator) {
        return ((double) this.numerator / (double) this.denominator) + ((double) numerator / (double) denominator);
    }

    public double multiply(double multiplier) {
        return ((double) numerator / (double) denominator) * multiplier;
    }

    public double divide(double divider) {
        return ((double) numerator / (double) denominator) / divider;
    }
}
