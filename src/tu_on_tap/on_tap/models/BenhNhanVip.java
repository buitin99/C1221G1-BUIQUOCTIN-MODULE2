package tu_on_tap.on_tap.models;

public class BenhNhanVip extends BenhNhan {
    private String loaiVip;

    public BenhNhanVip() {
    }

    public BenhNhanVip(int soThuTuBenhAn, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoRaVien, String loaiVip) {
        super(soThuTuBenhAn, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoRaVien);
        this.loaiVip = loaiVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    @Override
    public String toString() {
        return "BenhNhanVip{" +super.toString()+
                "loaiVip='" + loaiVip + '\'' +
                '}';
    }
    public String getInFoToCSV(){
        return super.getInFoToCSV()+loaiVip;
    }
}
