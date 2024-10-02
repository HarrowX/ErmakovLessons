package homeworks.first.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrokenLine {
    public List<Point> points = new ArrayList<>();
    public BrokenLine(Point... points) {
        Collections.addAll(this.points, points);
    }
    public BrokenLine addPoint(Point point) {

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
    }
}