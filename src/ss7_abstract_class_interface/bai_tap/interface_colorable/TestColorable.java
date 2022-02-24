package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class TestColorable {
    public static void main(String[] args) {
        testChuongTrinh();
    }

    public static void testChuongTrinh() {
        Circle circle0 = new Circle(2);
        Rectangle rectangle0 = new Rectangle(3, 4);
        Square square0 = new Square(5);
        circle0.howToColor();
        rectangle0.howToColor();
        square0.howToColor();
        //tao mang
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(6, 5);
        Square square1 = new Square(5);
        Square square2 = new Square(4);
        Shape[] shapes = new Shape[6];
        shapes[0] = circle1;
        shapes[1] = circle2;
        shapes[2] = rectangle1;
        shapes[3] = rectangle2;
        shapes[4] = square1;
        shapes[5] = square2;

        for (Shape shape : shapes) {
            System.out.println(shape + " và màu sắc : " + shape.getColor());
        }


    }

}
