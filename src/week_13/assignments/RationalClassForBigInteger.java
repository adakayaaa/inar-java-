package week_13.assignments;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class RationalClassForBigInteger extends Number implements Comparable<RationalClassForBigInteger> {
    private BigInteger numerator;
    private BigInteger denominator;

    public RationalClassForBigInteger() {
        this(new BigInteger("0"), new BigInteger("1"));
    }

    public RationalClassForBigInteger(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.denominator = denominator.divide(gcd).abs();

        this.numerator = ((this.denominator.compareTo(new BigInteger("0")) == 1) ? new BigInteger("1") : new BigInteger("-1")).multiply((numerator.divide(gcd)));
    }

    public BigInteger getNumerator() {
        return this.numerator;
    }

    public BigInteger getDenominator() {
        return this.denominator;
    }

    public void setNumerator(BigInteger numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(BigInteger denominator) {
        this.denominator = denominator;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        BigDecimal numberForNumerator = new BigDecimal(this.numerator);
        BigDecimal numberForDenominator = new BigDecimal(this.denominator);
        BigDecimal result = numberForNumerator.divide(numberForDenominator, 2, RoundingMode.DOWN);
        return result.doubleValue();
    }

    public RationalClassForBigInteger add(RationalClassForBigInteger secondRational) {
        BigInteger n = this.numerator.multiply(secondRational.getDenominator()).add(this.denominator.multiply(secondRational.getNumerator()));
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new RationalClassForBigInteger(n, d);
    }

    public RationalClassForBigInteger subtract(RationalClassForBigInteger secondRational) {
        BigInteger n = this.numerator.multiply(secondRational.getDenominator()).subtract(this.denominator.multiply(secondRational.getNumerator()));
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new RationalClassForBigInteger(n, d);
    }

    public RationalClassForBigInteger multiply(RationalClassForBigInteger secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalClassForBigInteger(n, d);
    }

    public RationalClassForBigInteger divide(RationalClassForBigInteger secondRational) {
        BigInteger n = this.numerator.multiply(secondRational.getDenominator());
        BigInteger d = this.denominator.multiply(secondRational.getNumerator());
        return new RationalClassForBigInteger(n, d);
    }


    @Override
    public String toString() {
        if (denominator.equals(new BigInteger("1"))) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    public boolean equals(Object o) {
        if ((this.subtract((RationalClassForBigInteger) (o))).getNumerator().equals(new BigInteger("0"))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(RationalClassForBigInteger o) {
        if (this.subtract(o).getNumerator().compareTo(new BigInteger("0"))==1) {
            return 1;
        } else if (this.subtract(o).getNumerator().compareTo(new BigInteger("0"))==0){
            return 0;
        } else {
            return -1;
        }
    }
}
