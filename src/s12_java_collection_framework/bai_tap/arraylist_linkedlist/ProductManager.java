package s12_java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager  {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product>  products = new ArrayList<>();

        public void add(){
            System.out.println("Nhập id!");
            int id = scanner.nextInt();
            System.out.println("Nhập tên sản phẩm!");
            String tenSP = scanner.next();
            System.out.println("Nhập giá tiền!");
            double tien = scanner.nextDouble();
            System.out.println("Nhập số lượng!");
            int soLuong = scanner.nextInt();
            Product product = new Product(id, tenSP, tien, soLuong);
            products.add(product);
        }

        public void edit() {

        }

        public void delete() {
            display();
            System.out.println("Nhập id cần xóa!");
            int idDelete = scanner.nextInt();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId() == idDelete) {
                    products.remove(products.get(i));
                }
            }
        }

        public void display() {
            for (int i = 0; i < products.size(); i++) {
                System.out.println((1 + i) + "." + products.get(i));
            }
        }

        public void search() {
            System.out.println("Nhập tên sản phẩm cần tìm kiếm!");
            String timTenSP = scanner.next();
            boolean flag = false;
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getTenSanPham().equals(timTenSP)) {
                    flag = true;
                    if (flag){
                        System.out.println("Sản phẩm bạn tìm kiếm hiện có!");
                    }else
                    {
                        System.out.println("Sản phẩm bạn tìm kiếm hiện không!");
                    }
                }
            }
        }
}
