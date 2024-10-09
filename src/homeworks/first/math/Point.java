package homeworks.first.math;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }
    public Point sum(Point other) {
        return new Point(other.x + x, other.y + y);
    }
    public Point sum(int x, int y) {
        return new Point(this.x + x, this.y + y);
    }
    @Override
    public String toString() {
        String out = "{";
        out += x;
        out += ";";
        out += y;
        out += "}";
        return out;
    }
}

class TestPoint {
    public static void main(String[] args) {
        Point A = new Point(3, 5),
                B = new Point(25, 6),
                C = new Point(7, 8);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}

