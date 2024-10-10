package homeworks.first.math;


public record Fractions(int numerator, int denominator) {

    public Fractions(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        if (denominator < 0) {
            numerator = - numerator;
            denominator = -denominator;
        }
        if (gcd < 0) {
            gcd = -gcd;
        }
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator can't be zero");
        }
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    public Fractions(int numerator) {
        this(numerator, 1);
    }
    private int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public Fractions sum(Fractions other) {
        return new Fractions(numerator * other.denominator + denominator * other.numerator,
                denominator * other.denominator);
    }
    public Fractions negative(Fractions other) {
        return new Fractions(-numerator, denominator);
    }
    public Fractions minus(Fractions other) {
        return sum(negative(other));
    }
    public Fractions minus(int other) {
        return sum(negative(new Fractions(other)));
    }
    public Fractions div(Fractions other) {
        return new Fractions(numerator * other.denominator,
                denominator * other.numerator);
    }
    public Fractions multiply(Fractions other) {
        return new Fractions(numerator * other.numerator,
                denominator * other.denominator);
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
        System.out.println(f1.sum(f2).div(f3).minus(5));
        System.out.println(f1.sum(f1).sum(f1).sum(f1));
    }
}
