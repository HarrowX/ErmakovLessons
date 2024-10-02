package homeworks.first.math;

public class Line {
    public Point begin;
    public Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int x2, int y1, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    @Override
    public String toString() {
        String out = "Линния от ";
        if (begin != null) out += begin;
        else out += new Point();
        out += " до ";
        if (end != null) out += end;
        else out += new Point();
        return out;
    }
}

class TestLine {
    public static void main(String[] args) {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(23, 8);
        Point point3 = new Point(5, 10);
        Point point4 = new Point(25, 10);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        Line line3 = new Line(point1, point4);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println();

        point2.x = 10; point2.y = 10;
        point3.x = 20; point3.y = 20;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
    }
}