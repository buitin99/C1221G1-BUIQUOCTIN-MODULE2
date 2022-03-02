package oop_bai_tap.bai_tap_lam_them.models;

public class XeTai extends Xe {
    private double trongTai;

    public XeTai(String bienSoXe, String tenHang, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienSoXe, tenHang, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public XeTai() {

    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "{ biển số xe : " + getBienSoXe() + " , " + " tên hãng : " + getTenHang() + " , " + " năm sản xuất : " + getNamSanXuat() + " , " + " chủ sở hữu : " + getChuSoHuu() + " , " + " trọng tải : " + getTrongTai() + "}" ;
    }
}

