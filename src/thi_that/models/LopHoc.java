package thi_that.models;

public class LopHoc {
    private String maLopHoc;
    private String tenLopHoc;
    private String maGiaoVien;

    public LopHoc() {
    }

    public LopHoc(String maLopHoc, String tenLopHoc, String maGiaoVien) {
        this.maLopHoc = maLopHoc;
        this.tenLopHoc = tenLopHoc;
        this.maGiaoVien = maGiaoVien;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    @Override
    public String toString() {
        return "maLopHoc='" + maLopHoc + '\'' +
                ", tenLopHoc='" + tenLopHoc + '\'' +
                ", maGiaoVien='" + maGiaoVien + '\'' +
                '}';
    }

    public String toCSV(){
        return maLopHoc+","+tenLopHoc+","+maGiaoVien+",";
    }
}
