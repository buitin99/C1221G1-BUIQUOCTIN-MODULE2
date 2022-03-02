package oop_bai_tap.bai_tap_lam_them.models;

public class XeMay extends Xe {
    private double congSuat;

    public XeMay(String bienSoXe, String tenHang, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienSoXe, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public XeMay() {
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "{ biển số xe : " + getBienSoXe() + " , " + " tên hãng : " + getTenHang() + " , " + " năm sản xuất : " + getNamSanXuat() + " , " + " chủ sở hữu : " + getChuSoHuu() + " , " + "công suất : " + getCongSuat() + "}" ;
    }
}
