package thi_thu.models;

public class B  extends A{

    private String lop;

    public B() {
    }

    public B(int stt, String ten, String lop) {
        super(stt, ten);
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "B{" + super.toString() +
                "lop='" + lop + '\'' +
                '}';
    }

    public String toCSV(){
        return super.toCSV()+lop;
    }
}
