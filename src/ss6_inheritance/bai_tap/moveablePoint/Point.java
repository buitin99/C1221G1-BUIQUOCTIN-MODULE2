package ss6_inheritance.bai_tap.moveablePoint;

import java.util.Arrays;

public class Point {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        float[] array = {getX(), getY()};
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
