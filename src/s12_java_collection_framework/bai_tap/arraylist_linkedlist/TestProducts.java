package s12_java_collection_framework.bai_tap.arraylist_linkedlist;
import java.util.Scanner;
public class TestProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager product = new ProductManager();
        boolean flag = true;
        do {
            System.out.println("Main Menu:\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Xóa sản phẩm\n" +
                    "3. Hiện thị sản phẩm\n" +
                    "4. Tìm kiếm sản phẩm\n" +
                    "5. Sắp xếp sản phẩm\n" +
                    "6. Thoát\n");
            System.out.println("Chọn chức năng");
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu) {
                case 1:
                    System.out.println("Thêm sản phẩm!");
                    product.add();
                    break;
                case 2:
                    System.out.println("Xóa sản phẩm theo id!");
                    product.delete();
                    break;
                case 3:
                    System.out.println("Hiển thị sản phẩm!");
                    product.display();
                    break;
                case 4:
                    System.out.println("Tìm kiếm sản phẩm");
                    product.search();
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
