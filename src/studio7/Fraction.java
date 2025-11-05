package studio7;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int initNumerator, int initDenominator) {
        this.numerator = initNumerator;
        this.denominator = initDenominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction addFraction(Fraction fraction2) {
        int new Num = fraction1.getNumerator() * fraction2.getNumerator;
        int new Den = fraction1.getDenominator() * fraction2.getDenominator;
        return new Fraction(new Num, new Den);
    }
}
