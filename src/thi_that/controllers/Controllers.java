package thi_that.controllers;


import thi_that.models.SinhVien;
import thi_that.service.impl.GiaoVienImpl;
import thi_that.service.impl.SinhVienImpl;
import thi_that.utils.NotFoundStudentException;

import java.util.Scanner;

public class Controllers {
    private static Scanner scanner = new Scanner(System.in);
    public static void mainMenu() {
        SinhVienImpl sinhVien = new SinhVienImpl();
        GiaoVienImpl giaoVien = new GiaoVienImpl();
        boolean flag = true;
        String chooseMenu;
        do {
            System.out.println("- CHƯƠNG TRÌNH QUẢN LÝ LỚP HỌC -");
            System.out.println("CHỌN CHỨC NĂNG THEO SỐ (ĐỂ TIẾP TỤC!)");
            System.out.println("1. THÊM MỚI SINH VIÊN!");
            System.out.println("2. XÓA SINH VIÊN!");
            System.out.println("3. XEM DANH SÁCH SINH VIÊN!");
            System.out.println("4. XEM DANH SÁCH GIÁO VIÊN!");
            System.out.println("5. TÌM KIẾM SINH VIÊN!");
            System.out.println("6. THOÁT!");
            System.out.println("CHỌN CHỨC NĂNG!");
            chooseMenu = scanner.nextLine();
            switch (chooseMenu) {
                case "1":
                    sinhVien.them();
                    break;
                case "2":
                    try {
                        sinhVien.xoa();
                    } catch (NotFoundStudentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    sinhVien.xem();
                    break;
                case "4":
                    giaoVien.xemGiaoVien();
                    break;
                case "5":
                    sinhVien.timKiem();
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    mainMenu();
            }
        } while (flag);
    }
}
