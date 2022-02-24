package ss7_abstract_class_interface.bai_tap.interface_colorable;

import ss7_abstract_class_interface.bai_tap.interface_resizeable.IResizeable;
import ss7_abstract_class_interface.bai_tap.interface_resizeable.Shape;

public class Square extends Shape implements IColorable{
    private double edge = 1.0;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides " + getColor());
    }
}