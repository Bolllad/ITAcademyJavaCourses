package homework6;

import homework6.additionalClasses.Fraction;

public class HomeWork6Task1 {

    public static void main(final String[] args) {
        Fraction myFraction = new Fraction(4, 3);
        System.out.println("Fraction: " + myFraction.output() + ", addition: " + myFraction.add(2, 4) + ", multiply: " + myFraction.multiply(3.28) + ", division: " + myFraction.divide(1.337));
    }

}
