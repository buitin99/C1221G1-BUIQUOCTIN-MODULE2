package oop_bai_tap.bai_tap_lam_them_1.models;

import oop_bai_tap.bai_tap_lam_them.models.XeTai;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehical {

        private String licensePlates;
        private String manufacturer;
        private int yearOfManufacturer;
        private String owner;

        public Vehical() {
        }

        public Vehical(String licensePlates, String manufacturer, int yearOfManufacturer, String owner) {
            this.licensePlates = licensePlates;
            this.manufacturer = manufacturer;
            this.yearOfManufacturer = yearOfManufacturer;
            this.owner = owner;
        }

        public String getBienSoXe() {
            return licensePlates;
        }

        public void setBienSoXe(String bienSoXe) {
            this.licensePlates = licensePlates;
        }

        public String getTenHang() {
            return manufacturer;
        }

        public void setTenHang(String tenHang) {
            this.manufacturer = tenHang;
        }

        public int getNamSanXuat() {
            return yearOfManufacturer;
        }

        public void setNamSanXuat(int namSanXuat) {
            this.yearOfManufacturer = yearOfManufacturer;
        }

        public String getChuSoHuu() {
            return owner;
        }

        public void setChuSoHuu(String chuSoHuu) {
            this.owner = owner;
        }
}
