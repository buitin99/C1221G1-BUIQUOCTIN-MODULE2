package oop_bai_tap.bai_tap_lam_them.models;

public class Xe {
    private String bienSoXe;
    private String tenHang;
    private int namSanXuat;
    private String chuSoHuu;

    public Xe() {
    }

    public Xe(String bienSoXe, String tenHang, int namSanXuat, String chuSoHuu) {
        this.bienSoXe = bienSoXe;
        this.tenHang = tenHang;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }
}
