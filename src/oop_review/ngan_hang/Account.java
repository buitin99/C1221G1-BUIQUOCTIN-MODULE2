package oop_review.ngan_hang;

public class Account extends NganHang {
    private static final double LAISUAT = 0.035;
    private double soTienNap;
    private double soTienRut;
    private double phiRutTien = 0.2;
    private double soTienTrongTaiKhoan = 50;

    public Account() {
    }

    public Account(long soTaiKhoan, String tenTaiKhoan){
        super(soTaiKhoan, tenTaiKhoan);
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public static double getLAISUAT() {
        return LAISUAT;
    }

    public double getSoTienNap() {
        return soTienNap;
    }

    public void setSoTienNap(double soTienNap) {
        this.soTienNap = soTienNap;
    }

    public double getSoTienRut() {
        return soTienRut;
    }

    public void setSoTienRut(double soTienRut) {
        this.soTienRut = soTienRut;
    }

    public double getPhiRutTien() {
        return phiRutTien;
    }

    public void setPhiRutTien(double phiRutTien) {
        this.phiRutTien = phiRutTien;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public double guiTien(){
        return soTienTrongTaiKhoan += soTienNap;
    }

    public double rutTien(){
        return soTienTrongTaiKhoan -= (soTienRut + phiRutTien);
    }

    public double daoHan(){
        return soTienTrongTaiKhoan = soTienTrongTaiKhoan + soTienNap*LAISUAT;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Số tiền nạp : =" + soTienNap +
                ", Số tiền rút =" + soTienRut +
                ", Phí rút tiền =" + phiRutTien +
                ", Số tiền trong tài khoản =" + soTienTrongTaiKhoan +
                '}';
    }
}

