package oop_bai_tap.bai_tap_lam_them.service;

import oop_bai_tap.bai_tap_lam_them.models.Oto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoService {
    Scanner scanner = new Scanner(System.in);
    List<Oto> oto1 = new ArrayList<>();
    public void add(){
        System.out.println("Thêm xe ô tô");
        System.out.println("Nhập biển số!");
        String bienSoXeOto = scanner.next();
        System.out.println("Nhập hãng xe!");
        String tenHangOto = scanner.next();
        System.out.println("Nhập năm sản xuất!");
        int namSanXuatOto = scanner.nextInt();
        System.out.println("Nhập chủ sở hữu!");
        String chuSoHuuOto = scanner.next();
        System.out.println("Nhập số chỗ!");
        int soChoOto = scanner.nextInt();
        System.out.println("Nhập kiểu xe!");
        String kieuXeOto = scanner.next();
        oto1.add(new Oto(bienSoXeOto, tenHangOto, namSanXuatOto, chuSoHuuOto, soChoOto, kieuXeOto));
    }

    public void display(){
        System.out.println("Hiện thị xe ô tô!");
        for (Oto o : oto1) {
            System.out.println(o);
        }
    }

    public void delete(){
        System.out.println("Xóa xe ô tô!");
        for (Oto o : oto1) {
            System.out.println(o);
        }
        System.out.println("Nhập biển số muốn xóa!");
        String xoaBienSo = scanner.next();
        for (int i = 0; i < oto1.size(); i++) {
            if (oto1.get(i).getBienSoXe().equals(xoaBienSo)) {
                oto1.remove(oto1.get(i));
            }
        }
    }
}
