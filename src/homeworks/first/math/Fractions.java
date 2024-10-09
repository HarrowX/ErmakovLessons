package homeworks.first.math;

public class Fractions {
    int numerator, denominator;

    public Fractions(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }
    public Fractions(int numerator) {
        this(numerator, 1);
    }
    private int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    private Fractions normalize() {
        int k = gcd(numerator, denominator);
        numerator /= k;
        denominator /= k;
        return this;
    }

    public Fractions sum(Fractions other) {
        return new Fractions(numerator * other.denominator + denominator * other.numerator,
                denominator * other.denominator).normalize();
    }
    public Fractions negative(Fractions other) {
        return new Fractions(-numerator, denominator);
    }
    public Fractions minus(Fractions other) {
        return sum(negative(other)).normalize();
    }
    public Fractions div(Fractions other) {
        return new Fractions(numerator * other.denominator,
                denominator * other.numerator).normalize();
    }
    public Fractions multiply(Fractions other) {
        return new Fractions(numerator * other.numerator,
                denominator * other.denominator).normalize();
    }

    @Override
    public String toString() {
        if (numerator == 0) return "0";
        if (denominator == 1) return "" + numerator;
        return numerator + "/" + denominator;
    }
}

class TestFractions {
    public static void main(String[] args) {
        Fractions f1 = new Fractions(1, 3);
        Fractions f2 = new Fractions(2, 3);
        Fractions f3 = new Fractions(3, 4);
        System.out.println(f1.sum(f2).div(f3).minus(new Fractions(5)));
    }
}
