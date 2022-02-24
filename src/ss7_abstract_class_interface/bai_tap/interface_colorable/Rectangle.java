package ss7_abstract_class_interface.bai_tap.interface_colorable;

import ss7_abstract_class_interface.bai_tap.interface_resizeable.IResizeable;
import ss7_abstract_class_interface.bai_tap.interface_resizeable.Shape;

public class Rectangle extends Shape implements IColorable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides " + getColor());
    }
}