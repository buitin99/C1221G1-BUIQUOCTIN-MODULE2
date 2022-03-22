package tu_on_tap.on_tap.models;

public class BenhNhanThuong extends BenhNhan{
    private String phiRaVien;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoRaVien, String phiRaVien) {
        super(soThuTuBenhAn, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoRaVien);
        this.phiRaVien = phiRaVien;
    }


    public BenhNhanThuong(String phiRaVien) {
        this.phiRaVien = phiRaVien;
    }


    public String getPhiRaVien() {
        return phiRaVien;
    }

    public void setPhiRaVien(String phiRaVien) {
        this.phiRaVien = phiRaVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" + super.toString() +
                "phiRaVien='" + phiRaVien + '\'' +
                '}';
    }

    public String benhNhanThuonggetInFo(){
        return super.getInFoToCSV()+phiRaVien;
    }
}
