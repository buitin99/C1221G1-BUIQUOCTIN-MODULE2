package s12_java_collection_framework.bai_tap.arraylist_linkedlist;

import oop_review.ngan_hang.Account;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Main Menu:\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Xóa sản phẩm\n" +
                    "3. Hiện thị sản phẩm\n" +
                    "4. Tìm kiếm sản phẩm\n" +
                    "5. Sắp xếp sản phẩm\n" +
                    "5. Thoát\n");
            System.out.println("Chọn chức năng");
            int chooseMenu = scanner.nextInt();
            Product product = new Product();
            switch (chooseMenu) {
                case 1:
                    System.out.println("Thêm sản phẩm!");
                    Product.add();
                    break;
                case 2:
                    System.out.println("Xóa sản phẩm theo id!");
                    Product.delete();
                    break;
                case 3:
                    System.out.println("Hiển thị sản phẩm!");
                    Product.display();
                    break;
                case 4:
                    System.out.println("Tìm kiếm sản phẩm");
                    Product.search();
                    break;
                case 5:
                    System.out.println("Sắp xếp sản phẩm!");

                default:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
