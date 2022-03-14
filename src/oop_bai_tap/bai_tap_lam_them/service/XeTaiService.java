package oop_bai_tap.bai_tap_lam_them.service;
import oop_bai_tap.bai_tap_lam_them.models.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class XeTaiService {
    Scanner scanner = new Scanner(System.in);
    List<XeTai> xeTai1 = new ArrayList<>();
    public void add(){
        System.out.println("Thêm xe tải");
        System.out.println("Nhập biển số!");
        String bienSoXeTai = scanner.next();
        System.out.println("Nhập hãng xe!");
        String tenHangTai = scanner.next();
        System.out.println("Nhập năm sản xuất!");
        int namSanXuatTai = scanner.nextInt();
        System.out.println("Nhập chủ sở hữu!");
        String chuSoHuuTai = scanner.next();
        System.out.println("Nhập trọng tải!");
        double trongTai = scanner.nextDouble();
        xeTai1.add(new XeTai(bienSoXeTai, tenHangTai, namSanXuatTai, chuSoHuuTai, trongTai));
    }

    public void display(){
        System.out.println("Hiện thị xe tải!");
        for (XeTai tai : xeTai1) {
            System.out.println(tai);
        }
    }

    public void delete(){
        System.out.println("Xóa xe tải!");
        for (XeTai tai : xeTai1) {
            System.out.println(tai);
        }
        System.out.println("Nhập biển số muốn xóa!");
        String xoaBienSo = scanner.next();
        for (int i = 0; i < xeTai1.size(); i++) {
            if (xeTai1.get(i).getBienSoXe().equals(xoaBienSo)) {
                xeTai1.remove(xeTai1.get(i));
            }
        }
    }
}
