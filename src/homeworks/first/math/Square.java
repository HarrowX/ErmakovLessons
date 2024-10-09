package homeworks.first.math;

public class Square {
    Point leftCornerPoint;
    int lengthSide;

    public Square(Point leftCorner, int lengthSide) {
        this.leftCornerPoint = leftCorner;
        this.lengthSide = lengthSide;
    }
    public Square(int x, int y, int lengthSide) {
        this(new Point(x, y), lengthSide);
    }
    public BrokenLine getBrokenLine() {
        return new BrokenLine(
                leftCornerPoint,
                leftCornerPoint.sum(lengthSide, 0),
                leftCornerPoint.sum(lengthSide, -lengthSide),
                leftCornerPoint.sum(0, -lengthSide)
        );
    }
    @Override
    public String toString() {
        return "квадрат в точке " + leftCornerPoint + " со стороной " + lengthSide;
    }
}
