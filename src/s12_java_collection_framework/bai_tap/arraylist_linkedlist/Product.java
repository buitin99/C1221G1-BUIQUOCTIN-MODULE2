package s12_java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.*;

public class Product implements Comparable<Product> {
    List<Product> productList = new ArrayList<>();
    private int id;
    private String tenSanPham;
    private double giaTien;
    private int soLuong;

    public Product() {
    }

    public Product(int id, String tenSanPham, double giaTien, int soLuong) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productArrayList = new ArrayList<>();

    public static void add() {
        System.out.println("Nhập id!");
        int id = scanner.nextInt();
        System.out.println("Nhập tên sản phẩm!");
        String tenSP = scanner.next();
        System.out.println("Nhập giá tiền!");
        double tien = scanner.nextDouble();
        System.out.println("Nhập số lượng!");
        int soLuong = scanner.nextInt();
        Product product = new Product(id, tenSP, tien, soLuong);
        productArrayList.add(product);
    }

    public void edit() {

    }

    public static void delete() {
        display();
        System.out.println("Nhập id cần xóa!");
        int idDelete = scanner.nextInt();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == idDelete) {
                productArrayList.remove(productArrayList.get(i));
            }
        }
    }

    public static void display() {
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println((1 + i) + "." + productArrayList.get(i));
        }
    }

    public static void search() {
        System.out.println("Nhập tên sản phẩm cần tìm kiếm!");
        String timTenSP = scanner.next();
        boolean flag = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getTenSanPham().equals(timTenSP)) {
                flag = true;
                System.out.println(flag);
            }
        }
    }

    public static void arrangeUp() {
        Collections.sort(productArrayList);
        for (Product element : productArrayList) {
            System.out.println("id" + element.getId() + "tên sản phẩm: " + element.getTenSanPham() + "giá tiền: " + element.getGiaTien() + "số lượng :" + element.getSoLuong());
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaTien=" + giaTien +
                ", soLuong=" + soLuong +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.getGiaTien() == o.giaTien) {
            return 0;
        } else if (this.getGiaTien() > o.giaTien) {
            return 1;
        } else {
            return -1;
        }
    }
}
