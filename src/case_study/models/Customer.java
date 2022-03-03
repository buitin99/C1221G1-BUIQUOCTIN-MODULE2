package case_study.models;

public class Customer extends Person {

    private double money;
    private int evaluate;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(int evaluate) {
        this.evaluate = evaluate;
    }

    public Customer() {
    }

    public Customer(String name, int age, double money, int evaluate) {
        super(name, age);
        this.money = money;
        this.evaluate = evaluate;
    }

}
