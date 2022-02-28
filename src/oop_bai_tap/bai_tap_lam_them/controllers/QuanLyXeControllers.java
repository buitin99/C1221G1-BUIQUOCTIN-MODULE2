package oop_bai_tap.bai_tap_lam_them.controllers;
import java.util.Scanner;
public class QuanLyXeControllers {
    public void showMainMenu(){
        Scanner scanner =new Scanner(System.in);
        boolean flag =true;
        do {
            System.out.println("Main Menu: " +
                    "1. Thêm mới phương tiện!\n" +
                    "2. Hiện thị phương tiện!\n" +
                    "3. Xóa phương tiện!\n" +
                    "4. Thoát\n");
            System.out.println("Chọn chức năng");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu){
                case 1:
                    //chức năng thêm ới
                    break;
                case 2:
                    //chức năng hiện thi
                    System.out.println("display danh sách sinh viên");

                    break;
                case 3:
                    //chức năng thêm sửa
                    System.out.println("edit");
                    break;
                case 4:
                    //xóa
                    System.out.println("delete");
                    break;
                case 5:
                    //chức năng tìm kiếm
                    System.out.println("search");
                    break;
                default:
                    flag = false;

            }
        }while (flag);
    }
}
