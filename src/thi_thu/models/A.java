package thi_thu.models;

public abstract class A {
    private int stt;
    private String ten;

    public A() {
    }

    public A(int stt, String ten) {
        this.stt = stt;
        this.ten = ten;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "stt=" + stt +
                ", ten='" + ten + '\'' +
                '}';
    }

    public String toCSV(){
        return stt+","+ten+",";
    }
}
