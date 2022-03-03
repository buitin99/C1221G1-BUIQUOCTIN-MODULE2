package oop_bai_tap.bai_tap_lam_them.controllers;

import oop_bai_tap.bai_tap_lam_them.models.Oto;
import oop_bai_tap.bai_tap_lam_them.models.XeMay;
import oop_bai_tap.bai_tap_lam_them.models.XeTai;

import java.util.*;

public abstract class QuanLyXeControllers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Oto> otoArrayList = new ArrayList<Oto>(10);
        ArrayList<XeTai> xeTaiArrayList = new ArrayList<XeTai>(10);
        ArrayList<XeMay> xeMayArrayList = new ArrayList<XeMay>(10);
        boolean flag = true;
        do {
            System.out.println("Main Menu:\n" +
                    "1. Thêm mới phương tiện!\n" +
                    "2. Hiện thị phương tiện!\n" +
                    "3. Xóa phương tiện!\n" +
                    "4. Thoát\n");
            System.out.println("Chọn chức năng");
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu) {
                case 1:
                    //chức năng thêm mới
                    System.out.println("Menu thêm !");
                    System.out.println("1. Thêm xe tải !");
                    System.out.println("2. Thêm xe ô tô !");
                    System.out.println("3. Thêm xe máy !");
                    int chooseMenu1 = scanner.nextInt();
                    switch (chooseMenu1) {
                        case 1:
                            //thêm xe tải
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
                            xeTaiArrayList.add(new XeTai(bienSoXeTai, tenHangTai, namSanXuatTai, chuSoHuuTai, trongTai));
                            break;
                        case 2:
                            //thêm xe ô tô
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
                            otoArrayList.add(new Oto(bienSoXeOto, tenHangOto, namSanXuatOto, chuSoHuuOto, soChoOto, kieuXeOto));
                            break;
                        case 3:
                            //thêm xe máy
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
                            xeMayArrayList.add(new XeMay(bienSoXeMay, hangXeMay, namSanXuatMay, chuSoHuuMay, congXuatMay));
                            break;
                        default:
                            flag = false;
                    }
                    break;
                case 2:
                    //chức năng hiện thi
                    System.out.println("hiện thị xe !");
                    System.out.println("1. hiện thị xe tải !");
                    System.out.println("2. hiện thị xe ô tô !");
                    System.out.println("3. hiện thị xe máy !");
                    int chooseMenu2 = scanner.nextInt();
                    switch (chooseMenu2) {
                        case 1:
                            System.out.println("Hiện thị xe tải!");
                            for (XeTai tai : xeTaiArrayList) {
                                System.out.println(tai);
                            }
                            break;
                        case 2:
                            System.out.println("Hiện thị xe ô tô");
                            for (Oto oto : otoArrayList) {
                                System.out.println(oto);
                            }
                            break;
                        case 3:
                            System.out.println("Hiện thị xe máy");
                            for (XeMay may : xeMayArrayList) {
                                System.out.println(may);
                            }
                            break;
                    }
                    break;
                case 3:
                    //chức năng thêm xóa phương tiện
                    System.out.println("xóa xe !");
                    System.out.println("1. xóa xe tải !");
                    System.out.println("2. xóa xe ô tô !");
                    System.out.println("3. xóa xe máy !");
                    int chooseMenu3 = scanner.nextInt();
                    switch (chooseMenu3) {
                        case 1:
                            System.out.println("Xóa xe tải!");
                            for (XeTai tai : xeTaiArrayList) {
                                System.out.println(tai);
                            }
                            System.out.println("Nhập biển số muốn xóa!");
                            String xoaBienSo = scanner.next();
                            for (int i = 0; i < xeTaiArrayList.size(); i++) {
                                if (xeTaiArrayList.get(i).getBienSoXe().equals(xoaBienSo)) {
                                    xeTaiArrayList.remove(xeTaiArrayList.get(i));
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Xóa xe ô tô!");
                            for (Oto oto : otoArrayList) {
                                System.out.println(oto);
                            }
                            System.out.println("Nhập biển số muốn xóa!");
                            String xoaBienSoOto = scanner.next();
                            for (int i = 0; i < otoArrayList.size(); i++) {
                                if (otoArrayList.get(i).getBienSoXe().equals(xoaBienSoOto)) {
                                    otoArrayList.remove(otoArrayList.get(i));
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Xóa xe máy!");
                            for (XeMay may : xeMayArrayList) {
                                System.out.println(may);
                            }
                            System.out.println("Nhập biển số muốn xóa!");
                            String xoaBienSoMay = scanner.next();
                            for (int i = 0; i < xeMayArrayList.size(); i++) {
                                if (xeMayArrayList.get(i).getBienSoXe().equals(xoaBienSoMay)) {
                                    xeMayArrayList.remove(xeMayArrayList.get(i));
                                }
                            }
                            break;
                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}

