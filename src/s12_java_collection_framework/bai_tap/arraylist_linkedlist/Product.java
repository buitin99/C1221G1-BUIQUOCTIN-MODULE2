package s12_java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.*;
import java.util.Scanner;
public class Product{
    private int id;
    private String tenSanPham;
    private double giaTien;
    private int soLuong;

    Scanner scanner = new Scanner(System.in);
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



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaTien=" + giaTien +
                ", soLuong=" + soLuong +
                ", scanner=" + scanner +
                '}';
    }

}
