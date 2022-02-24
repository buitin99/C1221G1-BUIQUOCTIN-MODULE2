package ss7_abstract_class_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        testChuongTrinh();
    }

    public static void testChuongTrinh() {
        Scanner scanner = new Scanner(System.in);
        Circle circle0 = new Circle(2);
        Rectangle rectangle0 = new Rectangle(2, 3);
        Square square0 = new Square(2);
        System.out.println("Diện tích hình tròn ban đầu là : " + circle0.getArea());
        circle0.resizeable(0.2);
        System.out.println(circle0.toString());
        System.out.println("Diện tích hình vuông ban đầu là : " + rectangle0.getArea());
        rectangle0.resizeable(0.2);
        System.out.println(rectangle0.toString());
        System.out.println("Diện tích hình vuông ban đầu là : " + square0.getArea());
        square0.resizeable(0.2);
        System.out.println(square0.toString());
        //tao mang circle
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        //tao mang rectangle
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(2, 4);
        //tao mang square
        Square square1 = new Square(5);
        Square square2 = new Square(7);
        Shape[] shapes = new Shape[6];
        shapes[0] = circle1;
        shapes[1] = circle1;
        shapes[2] = rectangle1;
        shapes[3] = rectangle2;
        shapes[4] = square1;
        shapes[5] = square2;
        circle1.resizeable(Math.random() * 100 + 1);
        circle2.resizeable(Math.random() * 100 + 1);
        rectangle1.resizeable(Math.random() * 100 + 1);
        rectangle2.resizeable(Math.random() * 100 + 1);
        square1.resizeable(Math.random() * 100 + 1);
        square2.resizeable(Math.random() * 100 + 1);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
