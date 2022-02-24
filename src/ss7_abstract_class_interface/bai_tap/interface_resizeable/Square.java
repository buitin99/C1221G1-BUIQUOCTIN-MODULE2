package ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class Square extends Shape implements IResizeable {
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
    public String toString() {
        return "Diện tích hình vuông sau khi tăng là : " + getArea();
    }

    @Override
    public void resizeable(double percent) {
        this.edge = this.edge * percent;
    }
}
