
package oop_review.nhap_xuat_xe;

public class Vehicle {
   private int dungTich;
   private int tienXe;

    public Vehicle() {
    }

    public Vehicle(int dungTich, int tienXe) {
        this.dungTich = dungTich;
        this.tienXe = tienXe;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTienXe() {
        return tienXe;
    }

    public void setTienXe(int tienXe) {
        this.tienXe = tienXe;
    }

    public double phiTruocBaDuoi100cc(){
        return 0.01;
    }

    public double phiTruocBaDuoi200cc(){
        return 0.03;
    }

    public double phiTruocBaTren200cc(){
        return 0.05;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "dungTich=" + dungTich +
                ", tienXe=" + tienXe +
                '}';
    }
}
