package ss4_oop.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the A");
        double a = scanner.nextDouble();
        System.out.println("Enter the B");
        double b = scanner.nextDouble();
        System.out.println("Enter the C");
        double c = scanner.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a, b,c);
        System.out.println(ptb2.getDiscriminant());
        if(ptb2.getDiscriminant()>0){
            System.out.println("PT có 2 nghiệm"+ptb2.getRoot1()+ " và "+ptb2.getRoot2());
        }else if(ptb2.getDiscriminant() == 0){
            System.out.println("PT có 1 nghiệm duy nhất" + ptb2.getRoot1());
        }else{
            System.out.println("PT Vô nghiệm");
        }
    }
}
