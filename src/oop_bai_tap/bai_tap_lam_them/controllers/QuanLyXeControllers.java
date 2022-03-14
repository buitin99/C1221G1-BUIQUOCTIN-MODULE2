package oop_bai_tap.bai_tap_lam_them.controllers;

import oop_bai_tap.bai_tap_lam_them.service.OtoService;
import oop_bai_tap.bai_tap_lam_them.service.XeMayService;
import oop_bai_tap.bai_tap_lam_them.service.XeTaiService;

import java.util.*;

public abstract class QuanLyXeControllers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        XeTaiService xeTaiService = new XeTaiService();
        OtoService otoService = new OtoService();
        XeMayService xeMayService = new XeMayService();
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
                            xeTaiService.add();
                            break;
                        case 2:
                            //thêm xe ô tô
                            otoService.add();
                            break;
                        case 3:
                            //thêm xe máy
                            xeMayService.add();
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
                            System.out.println("Hiện thị xe tải");
                            xeTaiService.display();
                            break;
                        case 2:
                            System.out.println("Hiện thị xe ô tô");
                            otoService.display();
                            break;
                        case 3:
                            System.out.println("Hiện thị xe máy");
                            xeMayService.add();
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
                            xeTaiService.delete();
                            break;
                        case 2:
                            System.out.println("Xóa xe ô tô!");
                            otoService.delete();
                            break;
                        case 3:
                            System.out.println("Xóa xe máy!");
                            xeMayService.delete();
                            break;
                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}

