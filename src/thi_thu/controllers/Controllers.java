package thi_thu.controllers;

import thi_thu.services.impl.Bimpl;
import thi_thu.services.impl.Cimpl;

import java.util.Scanner;

public class Controllers {
    private static Scanner scanner = new Scanner(System.in);
    public static void mainMenu() {

        Bimpl b = new Bimpl();
        Cimpl c = new Cimpl();
        boolean flag = true;
        String chooseMenu;
        do {
            System.out.println("- CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN -");
            System.out.println("CHỌN CHỨC NĂNG THEO SỐ (ĐỂ TIẾP TỤC!)");
            System.out.println("1. THÊM MỚI!");
            System.out.println("2. XÓA!");
            System.out.println("3. XEM DANH SÁCH CÁC BỆNH ÁN!");
            System.out.println("4. THOÁT!");
            System.out.println("CHỌN CHỨC NĂNG!");
            chooseMenu = scanner.nextLine();
            switch (chooseMenu) {
                case "1":
                    b.them();
                    break;
                case "2":
                    b.hienThi();
                    break;
                case "3":
                    c.them();
                    break;

                case "4":
                    c.hienThi();
                    break;
                case "5":
                    b.timKiem();
                    break;
                case "6":
                        b.xoa();
                    break;
                case "7":
                    flag = false;
                    break;
                default:
                    mainMenu();
            }
        } while (flag);
    }

    public static void case1() {
//        BenhNhanThuongServiceImpl benhNhanThuongService = new BenhNhanThuongServiceImpl();
//        BenhNhanVipServiceImpl benhNhanVipService = new BenhNhanVipServiceImpl();
        String choice;
        boolean flag = true;
        do {
            System.out.println("1. Thêm bệnh nhân thường!");
            System.out.println("2. Thêm bệnh nhân vip!");
            System.out.println("3. Trở lại chương trình chính!");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
            }
        } while (flag);
    }
}
