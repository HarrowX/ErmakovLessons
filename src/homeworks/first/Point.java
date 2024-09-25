package homeworks.first;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
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
        Point A = new Point(1, 2),
                B = new Point(2, 1),
                C = new Point(0, 0);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}

