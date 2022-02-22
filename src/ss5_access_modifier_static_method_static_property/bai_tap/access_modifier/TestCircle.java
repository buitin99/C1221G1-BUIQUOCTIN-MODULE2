package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;
import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Bán kính hình tròn là: " + circle1.getRadius());
        System.out.println("Diện tích hình tròn là: " + circle1.getArea());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn:");
        double radius = scanner.nextDouble();

        Circle circle2 = new Circle(radius);
        System.out.println("Bán kính hình tròn là: " + circle2.getRadius());
        System.out.println("Diện tích hình tròn là: " + circle2.getArea());
    }
}
