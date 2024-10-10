package homeworks.first.math;

import lombok.Getter;

public class Square {
    @Getter
    private Point leftCornerPoint;
    @Getter
    private int lengthSide;

    public void setLengthSide(int lengthSide) {
        if (lengthSide <= 0) throw new IllegalArgumentException("side must be positive");
        this.lengthSide = lengthSide;
    }

    public Square(Point leftCorner, int lengthSide) {
        setLengthSide(lengthSide);
        this.leftCornerPoint = leftCorner;
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
