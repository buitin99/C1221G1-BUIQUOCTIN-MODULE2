package ss6_inheritance.bai_tap.circle_cylinder;

import java.util.Scanner;

public class TestCircle_Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        double radius = scanner.nextDouble();
        Circle circle1 = new Circle();
        System.out.println("Diện tích hình tròn là : " + circle1.area(radius));
        System.out.println("Nhập chiều cao: ");
        double height = scanner.nextDouble();
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Thể tích hình tròn là : " + cylinder1.volume(radius, height));
    }
}
