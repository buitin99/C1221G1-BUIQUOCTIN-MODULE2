package oop_review.nhap_xuat_xe;

import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("Main Menu:\n" +
                    "1. Tạo đối tượng xe và nhập thông tin\n" +
                    "2. Xuất bảng kê khai tiền thuế của các xe\n" +
                    "3. Thoát\n");
            System.out.println("Chọn chức năng");
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu) {
                case 1:
                    Vehicle vehicle1 = new Vehicle();
                    System.out.println("Nhập đối tượng xe và thông tin xe");
                    System.out.println("Nhập dung tích xe : ");
                    vehicle1.setDungTich(scanner.nextInt());
                    System.out.println("Nhập tiền mua xe : ");
                    vehicle1.setTienXe(scanner.nextInt());
                    System.out.println(vehicle1.toString());
                    break;
                case 2:
                    Vehicle vehicle2 = new Vehicle();
                    System.out.println("Khai tiền thuế của xe");
                    System.out.println("Nhập dung tích xe : ");
                    vehicle2.setDungTich(scanner.nextInt());
                    System.out.println("Nhập tiền mua xe : ");
                    vehicle2.setTienXe(scanner.nextInt());
                    System.out.println("Phí đóng thuế là : ");
                    if (vehicle2.getDungTich() < 100){
                        System.out.println(vehicle2.phiTruocBaDuoi100cc()*vehicle2.getTienXe());
                    } else if (vehicle2.getDungTich() < 200){
                        System.out.println(vehicle2.phiTruocBaDuoi200cc()*vehicle2.getTienXe());
                    } else
                    {
                        System.out.println(vehicle2.phiTruocBaTren200cc()*vehicle2.getTienXe());
                    }
                    break;
                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
