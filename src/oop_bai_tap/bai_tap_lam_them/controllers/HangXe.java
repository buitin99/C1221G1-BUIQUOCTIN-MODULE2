package oop_bai_tap.bai_tap_lam_them.controllers;

import java.util.Scanner;

public class HangXe {
    String[] chonHangXe0 = new String[]{"HSX-001", "Yamaha", "Nhật Bản"};
    String[] chonHangXe1 = new String[]{"HSX-002", "Honda", "Nhật Bản"};
    String[] chonHangXe2 = new String[]{"HSX-003", "Dongfeng", "Trung Quốc"};
    String[] chonHangXe3 = new String[]{"HSX-004", "Huyndai", "Hàn Quốc"};
    String[] chonHangXe4 = new String[]{"HSX-005", "Toyota", "Nhật Bản"};
    String[] chonHangXe5 = new String[]{"HSX-001", "Hino", "Nhật Bản"};


    public void chonHang() {
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                System.out.println("chọn hãng xe 001");
                break;
            case 2:
                System.out.println("chọn hãng xe 002");
                break;
            case 3:
                System.out.println("chọn hãng xe 003");
                break;
            case 4:
                System.out.println("chọn hãng xe 004");
                break;
            case 5:
                System.out.println("chọn hãng xe 005");
                break;
            case 6:
                System.out.println("chọn hãng xe 006");
                break;

        }
    }
}
