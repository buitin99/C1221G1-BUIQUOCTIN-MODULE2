package thi_thu.models;

public class C extends A {

    private double gia;

    public C() {
    }

    public C(int stt, String ten, double gia) {
        super(stt, ten);
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "C{" + super.toString() +
                "gia=" + gia +
                '}';
    }

    public String toCSV(){
        return super.toCSV()+gia;
    }
}
