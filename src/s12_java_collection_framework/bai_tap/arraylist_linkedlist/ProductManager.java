package s12_java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product>  products = new ArrayList<>();

        public void add(){
            System.out.println("Nhập id!");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên sản phẩm!");
            String tenSP = String.valueOf(scanner.nextLine());
            System.out.println("Nhập giá tiền!");
            int tien = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số lượng!");
            int soLuong = Integer.parseInt(scanner.nextLine());
            Product product = new Product(id, tenSP, tien, soLuong);
            products.add(product);
        }

        public void edit() {

        }

        public void delete() {
            display();
            System.out.println("Nhập id cần xóa!");
            int idDelete = Integer.parseInt(scanner.nextLine());
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
            String timTenSP = String.valueOf(scanner.nextLine());
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
        public void sapXepGiam(){
          products.sort(Product::compareTo);
            for (Product pro: products) {
                System.out.println("{" + "ID: " + pro.getId() + " Tên sản phẩm: " + pro.getTenSanPham() + " Giá sản phẩm : "+ pro.getGiaTien() + " Số lượng : " + pro.getSoLuong() + "}");
            }
        }

        public void sapXepTang(){
            products.sort(Comparator.comparing(Product::getGiaTien));
            for (Product pro1: products) {
                System.out.println("{" + "ID: " + pro1.getId() + " Tên sản phẩm: " + pro1.getTenSanPham() + " Giá sản phẩm : "+ pro1.getGiaTien() + " Số lượng : " + pro1.getSoLuong() + "}");
            }
        }
}
