package s12_java_collection_framework.bai_tap.arraylist_linkedlist;
import java.util.*;
public class Product implements Comparable<Product>, Comparator<Product>{
    private int id;
    private String tenSanPham;
    private int giaTien;
    private int soLuong;
    public Product() {
    }

    public Product(int id, String tenSanPham, int giaTien, int soLuong) {
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

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
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
        if (this.giaTien == o.giaTien){
            return 0;
        }else if (this.giaTien > o.giaTien){
            return -1;
        }else
        {
            return 1;
        }
    }

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getGiaTien()-o2.getGiaTien();
    }
}
