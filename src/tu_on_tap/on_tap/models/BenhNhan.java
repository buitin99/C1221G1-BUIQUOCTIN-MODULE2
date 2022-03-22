package tu_on_tap.on_tap.models;

public abstract class BenhNhan {
    private int soThuTuBenhAn;
    private String maBenhAn;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDoRaVien;


    public BenhNhan() {
    }

    public BenhNhan(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoRaVien) {
        this.soThuTuBenhAn = soThuTuBenhAn;
        this.maBenhAn = maBenhAn;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoRaVien = lyDoRaVien;
    }

    public int getSoThuTuBenhAn() {
        return soThuTuBenhAn;
    }

    public void setSoThuTuBenhAn(int soThuTuBenhAn) {
        this.soThuTuBenhAn = soThuTuBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoRaVien() {
        return lyDoRaVien;
    }

    public void setLyDoRaVien(String lyDoRaVien) {
        this.lyDoRaVien = lyDoRaVien;
    }

    @Override
    public String toString() {
        return "soThuTuBenhAn=" + soThuTuBenhAn +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoRaVien='" + lyDoRaVien + '\'' +
                '}';
    }

    public String getInFoToCSV(){
        return soThuTuBenhAn+","+maBenhAn+","+tenBenhNhan+","+ngayNhapVien+","+ngayNhapVien+","+lyDoRaVien+",";
    }
}
