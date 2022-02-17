package ss2_loop_in_java.bai_tap;
import java.util.Scanner;

public class Bai1HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the right triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the rectangle");
                for (int i = 0; i < 3; i++){
                    System.out.println("*****");
                }
                break;
            case 2:
                System.out.println("Draw the right triangle");
                for (int i = 0; i < 5; i++){
                    for (int j = 0; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("draw an inverted right triangle");
                for(int i = 5; i>=1;i--){
                    for (int j = 1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
