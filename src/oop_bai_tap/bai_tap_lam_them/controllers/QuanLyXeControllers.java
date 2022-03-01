package oop_bai_tap.bai_tap_lam_them.controllers;

import oop_bai_tap.bai_tap_lam_them.models.Oto;
import oop_bai_tap.bai_tap_lam_them.models.Xe;
import oop_bai_tap.bai_tap_lam_them.models.XeMay;
import oop_bai_tap.bai_tap_lam_them.models.XeTai;

import java.util.Scanner;

public abstract class QuanLyXeControllers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Main Menu: " +
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
                            XeTai xeTai = new XeTai();
                            System.out.println("Nhập biển số!");
                            xeTai.setBienSoXe(scanner.next());
                            System.out.println("Nhập hãng xe!");
                            xeTai.setTenHang(scanner.next());
                            System.out.println("Nhập năm sản xuất!");
                            xeTai.setNamSanXuat(scanner.nextInt());
                            System.out.println("Nhập chủ sở hữu!");
                            xeTai.setChuSoHuu(scanner.next());
                            System.out.println("Nhập trọng tải!");
                            xeTai.setTrongTai(scanner.nextDouble());
                            break;
                        case 2:
                            //thêm xe ô tô
                            System.out.println("Thêm xe ô tô");
                            Oto oto = new Oto();
                            System.out.println("Nhập biển số!");
                            oto.setBienSoXe(scanner.next());
                            System.out.println("Nhập hãng xe!");
                            oto.setTenHang(scanner.next());
                            System.out.println("Nhập năm sản xuất!");
                            oto.setNamSanXuat(scanner.nextInt());
                            System.out.println("Nhập chủ sở hữu!");
                            oto.setChuSoHuu(scanner.next());
                            System.out.println("Nhập số chỗ!");
                            oto.setSoCho(scanner.nextInt());
                            System.out.println("Nhập kiểu xe!");
                            oto.setKieuXe(scanner.next());
                            break;
                        case 3:
                            //thêm xe máy
                            System.out.println("Thêm xe máy");
                            XeMay xeMay = new XeMay();
                            System.out.println("Nhập biển số!");
                            xeMay.setBienSoXe(scanner.next());
                            System.out.println("Nhập hãng xe!");
                            xeMay.setTenHang(scanner.next());
                            System.out.println("Nhập năm sản xuất!");
                            xeMay.setNamSanXuat(scanner.nextInt());
                            System.out.println("Nhập chủ sở hữu!");
                            xeMay.setChuSoHuu(scanner.next());
                            System.out.println("Nhập công suất!");
                            xeMay.setCongSuat(scanner.nextInt());
                            break;
                        default:
                            flag = false;
                    }
                    break;
                case 2:
                    //chức năng hiện thi
                    System.out.println("1. hiện thị xe !");
                    System.out.println("2. hiện thị xe tải !");
                    System.out.println("3. hiện thị xe ô tô !");
                    System.out.println("4. hiện thị xe máy !");
                    int chooseMenu2 = scanner.nextInt();
                    switch (chooseMenu2) {
                        case 1:
                            System.out.println("Hiện thị xe tải!");
                            break;
                        case 2:
                            System.out.println("Hiện thị xe ô tô");
                            break;
                        case 3:
                            System.out.println("Hiện thị xe máy");
                            break;
                    }
                    break;
                case 3:
                    //chức năng thêm xóa phương tiện
                    System.out.println("delete");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

}
