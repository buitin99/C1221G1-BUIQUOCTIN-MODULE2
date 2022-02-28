package oop_bai_tap.bai_tap_lam_them.models;

public class XeMay extends Xe {
    private double congSuat;

    public XeMay(String bienSoXe, String tenHang, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienSoXe, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }
}
