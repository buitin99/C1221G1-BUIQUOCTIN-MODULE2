package ss6_inheritance.bai_tap.point;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào x Point2D : ");
        Point2D point2D1 = new Point2D();
        point2D1.setX(scanner.nextFloat());
        System.out.println("Nhập vào y Point2D : ");
        point2D1.setY(scanner.nextFloat());
        System.out.println("Point2D " + point2D1.toString());
        System.out.println("Nhập vào x Point3D :  ");
        Point3D point3D1 = new Point3D();
        point3D1.setX(scanner.nextFloat());
        System.out.println("Nhập vào y Point3D : ");
        point3D1.setY(scanner.nextFloat());
        System.out.println("Nhập vào z Point3D : ");
        point3D1.setZ(scanner.nextFloat());
        System.out.println("Point3D " + point3D1.toString());
    }

}
