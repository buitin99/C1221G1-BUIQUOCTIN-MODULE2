package ss1_introduction_to_java.bai_tap.nhap_ten;
import java.util.Scanner;

public class NhapTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

    }
}
