package tu_on_tap.on_tap.models;

public class BenhNhanThuong extends BenhNhan{
    private double phiRaVien;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoRaVien, double phiRaVien) {
        super(soThuTuBenhAn, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoRaVien);
        this.phiRaVien = phiRaVien;
    }

    public BenhNhanThuong(double phiRaVien) {
        this.phiRaVien = phiRaVien;
    }



    public double getPhiRaVien() {
        return phiRaVien;
    }

    public void setPhiRaVien(double phiRaVien) {
        this.phiRaVien = phiRaVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" + super.toString() +
                "phiRaVien='" + phiRaVien + '\'' +
                '}';
    }

    public String getInFoToCSV(){
        return super.getInFoToCSV()+phiRaVien;
    }
}
