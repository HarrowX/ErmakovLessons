package homeworks.first.math;

import lombok.Getter;

public class Line {
    @Getter
    private Point begin, end;

    public void setBegin(Point begin) {
        this.begin = new Point(begin);
    }

    public void setEnd(Point end) {
        this.end = new Point(end);
    }

    public Line(Point begin, Point end) {
        setBegin(begin);
        setEnd(end);
    }

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);

    }

    public int length() {
        return (int) Math.sqrt((end.getX() - begin.getX()) * (end.getX() - begin.getX()) +
                (end.getY() - begin.getY()) * (end.getY() - begin.getY()));
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
        Line line3 = new Line(line1.getBegin(), line2.getEnd());

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println();

        line1.getBegin().setX(10);
        line1.getEnd().setX(10);
        line2.getBegin().setY(20);
        line2.getEnd().setY(20);

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);

        System.out.println();

    }
}