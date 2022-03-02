package oop_bai_tap.bai_tap_lam_them.models;

public class Oto extends Xe {

    private int soCho;
    private String kieuXe;

    public Oto(String bienSoXe, String tenHang, int namSanXuat, String chuSoHuu, int soCho, String kieuXe) {
        super(bienSoXe, tenHang, namSanXuat, chuSoHuu);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public Oto() {
    }

    public Oto(Oto oto) {
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "{ biển số xe : " + getBienSoXe() + " , " + " tên hãng : " + getTenHang() + " , " + " năm sản xuất : " + getNamSanXuat() + " , " + " chủ sở hữu : " + getChuSoHuu() + " , " + " số chỗ : " + getSoCho() + " , " + "kiểu xe : " + getKieuXe() + "}" ;
    }
}
