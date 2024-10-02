package homeworks.first.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrokenLine {
    public List<Point> points = new ArrayList<>();

    public BrokenLine(Point... points) {
        this(Arrays.stream(points).toList());
    }

    public BrokenLine(List<Point> points) {
        this.points.addAll(points);
    }

    public BrokenLine addPoint(Point point) {
        points.add(point);
        return this;
    }

    @Override
    public String toString() {
        return "Line: " + points.toString();
    }
}

class TestBrokenLine {
    public static void main(String[] args) {
        BrokenLine line = new BrokenLine();

        line.addPoint(new Point())
                .addPoint(new Point(1, 2))
                .addPoint(new Point(2, 3));

        List<Point> points = new ArrayList<>();
        points.add(new Point());
        points.add(new Point(1, 2));
        points.add(new Point(2, 3));

        BrokenLine line2 = new BrokenLine(points);
        System.out.println(line);
        System.out.println(line2);

    }
}