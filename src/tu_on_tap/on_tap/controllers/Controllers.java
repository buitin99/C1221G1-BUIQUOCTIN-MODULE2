package tu_on_tap.on_tap.controllers;

import com.sun.org.apache.xpath.internal.operations.Number;
import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import tu_on_tap.on_tap.services.impl.BenhNhanThuongServiceImpl;
import tu_on_tap.on_tap.services.impl.BenhNhanVipServiceImpl;

import java.util.Scanner;

public class Controllers {
    private static Scanner scanner = new Scanner(System.in);


    public static void mainMenu() {
        boolean flag = true;
        int chooseMenu = 0;
        do {
            System.out.println("- CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN -");
            System.out.println("CHỌN CHỨC NĂNG THEO SỐ (ĐỂ TIẾP TỤC!)");
            System.out.println("1. THÊM MỚI!");
            System.out.println("2. XÓA!");
            System.out.println("3. XEM DANH SÁCH CÁC BỆNH ÁN!");
            System.out.println("4. THOÁT!");
            System.out.println("CHỌN CHỨC NĂNG!");
            try {
                chooseMenu = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
            }
            switch (chooseMenu) {
                case 1:
                    c1();
                    break;
                case 2:
                    c2();
                    break;
                case 3:
                    c3();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    mainMenu();
            }
        } while (flag);
    }

    public static void c1() {
        BenhNhanThuongServiceImpl benhNhanThuongService = new BenhNhanThuongServiceImpl();
        BenhNhanVipServiceImpl benhNhanVipService = new BenhNhanVipServiceImpl();
        int choice = 0;
        boolean flag = true;
        do {
            try {
                System.out.println("1. Thêm bệnh nhân thường!");
                System.out.println("2. Thêm bệnh nhân vip!");
                System.out.println("3. Trở lại chương trình chính!");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("sai");
            }
            if (choice == 1 || choice == 2 || choice == 3) {
                flag = false;
            }
        } while (flag);
        switch (choice) {
            case 1:
                System.out.println("Thêm mới bệnh nhân thường!");
                benhNhanThuongService.add();
                break;
            case 2:
                System.out.println("Thêm mới bệnh nhân vip!");
                benhNhanVipService.add();
                break;
            case 3:
                break;
        }
    }

    public static void c2() {
        BenhNhanThuongServiceImpl benhNhanThuongService = new BenhNhanThuongServiceImpl();
        BenhNhanVipServiceImpl benhNhanVipService = new BenhNhanVipServiceImpl();
        int choice = 0;
        boolean flag = true;
        do {
            try {
                System.out.println("1. Xóa bệnh nhân thường!");
                System.out.println("2. Xóa bệnh nhân vip!");
                System.out.println("3. Trở lại chương trình chính!");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("sai");
            }
            if (choice == 1 || choice == 2 || choice == 3) {
                flag = false;
            }
        } while (flag);
        switch (choice) {
            case 1:
                System.out.println("Xóa bệnh nhân thường!");
                benhNhanThuongService.delete();
                break;
            case 2:
                System.out.println("Xóa bệnh nhân vip!");
                benhNhanVipService.delete();
                break;
            case 3:
                break;
        }
    }

    public static void c3() {
        BenhNhanThuongServiceImpl benhNhanThuongService = new BenhNhanThuongServiceImpl();
        BenhNhanVipServiceImpl benhNhanVipService = new BenhNhanVipServiceImpl();
        int choice = 0;
        boolean flag = true;
        do {
            try {
                System.out.println("1. Hiện thị bệnh nhân thường!");
                System.out.println("2. Hiện thị bệnh nhân vip!");
                System.out.println("3. Trở lại chương trình chính!");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("sai");
            }
            if (choice == 1 || choice == 2 ||choice == 3) {
                flag = false;
            }
        } while (flag);
        switch (choice) {
            case 1:
                System.out.println("Hiện thị bệnh nhân thường!");
                benhNhanThuongService.display();
                break;
            case 2:
                System.out.println("Hiện thị bệnh nhân vip!");
                benhNhanVipService.display();
                break;
            case 3:
                break;
        }
    }
}

