package thi_that.models;
import thi_that.utils.ReadAndWriteCSV;

import java.util.List;
import java.util.Scanner;

public class SinhVien extends ConNguoi {
    private int maSinhVien;
    private String maLopHoc;

    public SinhVien() {
    }

    public SinhVien( int maSinhVien, String ten, String ngaySinh, String gioiTinh, String soDienThoai, String maLopHoc) {
        super(ten, ngaySinh, gioiTinh, soDienThoai);
        this.maSinhVien = maSinhVien;
        this.maLopHoc = maLopHoc;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                super.toString() +
                ", maLopHoc='" + maLopHoc + '\'' +
                '}';
    }

    public String toCSV(){
        return maSinhVien+","+super.toCSV()+maLopHoc;
    }

}
