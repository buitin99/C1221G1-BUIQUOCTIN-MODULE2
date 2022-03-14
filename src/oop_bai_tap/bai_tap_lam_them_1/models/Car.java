package oop_bai_tap.bai_tap_lam_them_1.models;

public class Car  extends  Vehical{

    private int numberOfSeats;
    private String carType;

    public Car(String licensePlates, String manufacturer, int yearOfManufacturer, String owner, int numberOfSeats, String carType) {
        super(licensePlates, manufacturer, yearOfManufacturer, owner);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public Car() {
    }

    public Car(Car car) {
    }

    public int getSoCho() {
        return numberOfSeats;
    }

    public void setSoCho(int soCho) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getKieuXe() {
        return carType;
    }

    public void setKieuXe(String kieuXe) {
        this.carType = carType;
    }

}
