package homeworks.first.math;

public class Line {
    public Point begin;
    public Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public int getLength() {
        return (int) Math.sqrt((end.x - begin.x) * (end.x - begin.x) + (end.y - begin.y) * (end.y - begin.y));
    }

    public static int getLength(Point begin, Point end) {
        return (int) Math.sqrt((end.x - begin.x) * (end.x - begin.x) + (end.y - begin.y) * (end.y - begin.y));
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

        Line line1 = new Line(1, 3, 23, 8);
        Line line2 = new Line(5, 10, 25, 10);
        Line line3 = new Line(line1.begin, line2.end);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println();

        line1.begin.x = 10;
        line1.begin.y = 10;
        line2.end.x = 20;
        line2.end.y = 20;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println();

    }
}