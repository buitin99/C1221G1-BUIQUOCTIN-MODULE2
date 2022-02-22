package ss1_introduction_to_java.thuc_hanh.phuong_trinh_bac_nhat;
import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equatation Resolver");
        System.out.println("Given a equation as ' a*x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer = (c - b)/a;
            System.out.printf("Equation pass with x = %f\n", answer);
        }else
        if(b == c){
            System.out.print("The solution is all x!");
        }else
        {
            System.out.print("No solution!");
        }
    }
}
