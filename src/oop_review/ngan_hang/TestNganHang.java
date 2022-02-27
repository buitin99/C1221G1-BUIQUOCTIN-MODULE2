package oop_review.ngan_hang;

import java.util.Scanner;

public class TestNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kiemTra = 0;
        boolean flag = true;
        do {
            System.out.println("Main Menu:\n" +
                    "0. Thêm tài khoản\n" +
                    "1. Nạp tiền\n" +
                    "2. Rút tiền\n" +
                    "3. Đáo hạn\n" +
                    "4. Thoát\n");
            System.out.println("Chọn chức năng");
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu) {
                case 0:
                    NganHang nganHang = new NganHang();
                    System.out.println("Nhập thông tin tài khoản");
                    System.out.println("Nhập số tài khoản : ");
                    nganHang.setSoTaiKhoan(scanner.nextLong());
                    System.out.println("Nhập tên tài khoản : ");
                    nganHang.setTenTaiKhoan(scanner.next());
                    System.out.println("Nhập số tiền : ");
                    nganHang.setSoTien(scanner.nextDouble());
                    System.out.println(nganHang.toString());
                    break;
                case 1:
                    Account account1 = new Account();
                    System.out.println("Nhập thông tin tài khoản");
                    System.out.println("Nhập số tài khoản : ");
                    account1.setSoTaiKhoan(scanner.nextLong());
                    System.out.println("Nhập tên tài khoản : ");
                    account1.setTenTaiKhoan(scanner.next());
                    System.out.println("Nhập số tiền muồn gửi ");
                    account1.setSoTienNap(scanner.nextDouble());
                    account1.guiTien();
                    System.out.println(account1.toString());
                    break;
                case 2:
                    Account account2 = new Account();
                    System.out.println("Nhập thông tin tài khoản");
                    System.out.println("Nhập số tài khoản : ");
                    account2.setSoTaiKhoan(scanner.nextLong());
                    System.out.println("Nhập tên tài khoản : ");
                    account2.setTenTaiKhoan(scanner.next());
                    System.out.println("Nhập số tiền muồn rút ");
                    account2.setSoTienRut(scanner.nextDouble());
                    account2.rutTien();
                    System.out.println(account2.toString());
                    break;
                case 3:
                    Account account3 = new Account();
                    System.out.println("Nhập thông tin tài khoản");
                    System.out.println("Nhập số tài khoản : ");
                    account3.setSoTaiKhoan(scanner.nextLong());
                    System.out.println("Nhập tên tài khoản : ");
                    account3.setTenTaiKhoan(scanner.next());
                    System.out.println("Nhập số tiền muồn gửi ");
                    account3.setSoTienNap(scanner.nextDouble());
                    account3.guiTien();
                    account3.daoHan();
                    System.out.println(account3.toString());
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
