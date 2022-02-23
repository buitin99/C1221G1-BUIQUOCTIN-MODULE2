package ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {

    public double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(double radius, double height) {
        return Math.PI * 2 * radius * height;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
