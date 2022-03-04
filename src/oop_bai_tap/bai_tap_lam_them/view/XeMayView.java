package oop_bai_tap.bai_tap_lam_them.view;
import oop_bai_tap.bai_tap_lam_them.models.XeMay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class XeMayView {
    Scanner scanner = new Scanner(System.in);
    XeMay xeMay1 = new XeMay();
    List<XeMay> xe1 = new ArrayList<>();
    public void add(){
        System.out.println("Thêm xe máy");
        System.out.println("Nhập biển số!");
        String bienSoXeMay = scanner.next();
        System.out.println("Nhập hãng xe!");
        String hangXeMay = scanner.next();
        System.out.println("Nhập năm sản xuất!");
        int namSanXuatMay = scanner.nextInt();
        System.out.println("Nhập chủ sở hữu!");
        String chuSoHuuMay = scanner.next();
        System.out.println("Nhập công suất!");
        double congXuatMay = scanner.nextDouble();
        xe1.add(new XeMay(bienSoXeMay, hangXeMay, namSanXuatMay, chuSoHuuMay, congXuatMay));
    }

    public void display(){
        System.out.println("Hiện thị xe máy!");
        for (XeMay x : xe1) {
            System.out.println(x);
        }
    }

    public void delete(){
        System.out.println("Xóa xe máy!");
        for (XeMay x : xe1) {
            System.out.println(x);
        }
        System.out.println("Nhập biển số muốn xóa!");
        String xoaBienSo = scanner.next();
        for (int i = 0; i < xe1.size(); i++) {
            if (xe1.get(i).getBienSoXe().equals(xoaBienSo)) {
                xe1.remove(xe1.get(i));
            }
        }
    }
}
