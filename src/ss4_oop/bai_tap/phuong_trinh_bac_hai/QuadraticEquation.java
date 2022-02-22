package ss4_oop.bai_tap.phuong_trinh_bac_hai;
import java.util.Queue;
import java.util.Scanner;
public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(b,2) - 4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.sqrt(Math.pow(b,2) -4*a*c))/2*a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt(Math.pow(b,2) -4*a*c))/2*a;
    }
}
