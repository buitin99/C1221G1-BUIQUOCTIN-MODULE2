package s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.view;

import s17_io_binary_file_serialization.bai_tap.quan_ly_san_pham.controller.ProductController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("MAIN MENU!:\n" +
                    "1. Add Product!\n" +
                    "2. Display Product!\n" +
                    "3. Search Product!\n" +
                    "4. Exit!\n");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    productController.add();
                    break;
                case 2:
                    productController.display();
                    break;
                case 3:
                    productController.search();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
