package s15_exception_debug.bai_tap.illegal_triangle_exception;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh x : ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào cạnh y : ");
        double y = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào cạnh z : ");
        double z = Double.parseDouble(scanner.nextLine());
        try {
            Test test = new Test();
            test.check(x,y,z);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }

    public void check (double x, double y, double z) throws IllegalTriangleException{
        if (x <= 0 || y <= 0 || z <= 0){
            throw new IllegalTriangleException("Cạnh tam giác không được âm!");
        }
        else if (x+y < z || x+z <y || z+y< x){
            throw new IllegalTriangleException("Tổng 2 cạnh không được bé hơn cạnh còn lại!");
        }else {
            System.out.println("3 cạnh là cạnh của tam giác!");
        }
    }
}
