package ss7_abstract_class_interface.bai_tap.interface_colorable;

import ss7_abstract_class_interface.bai_tap.interface_resizeable.IResizeable;

public class Circle extends Shape implements IColorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides " + getColor());
    }

    @Override
    public String toString() {
        return "Diện tích hình tròn là : "  + getArea();
    }

}