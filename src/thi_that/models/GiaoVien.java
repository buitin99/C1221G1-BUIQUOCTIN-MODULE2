package thi_that.models;

public class GiaoVien extends ConNguoi {
    private String maGiaoVien;

    public GiaoVien() {
    }

    public GiaoVien(String maGiaoVien, String ten, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(ten, ngaySinh, gioiTinh, soDienThoai);
        this.maGiaoVien = maGiaoVien;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                "maGiaoVien='" + maGiaoVien + '\'' + super.toString()+
                '}';
    }

    public String toCSV(){
        return maGiaoVien+","+super.toCSV();
    }
}
