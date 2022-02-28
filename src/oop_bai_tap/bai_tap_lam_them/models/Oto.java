package oop_bai_tap.bai_tap_lam_them.models;

public class Oto extends Xe {

    private int soCho;
    private String kieuXe;

    public Oto(String bienSoXe, String tenHang, int namSanXuat, String chuSoHuu, int soCho, String kieuXe) {
        super(bienSoXe, tenHang, namSanXuat, chuSoHuu);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }
}
