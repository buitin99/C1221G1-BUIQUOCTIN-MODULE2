package case_study.models;

public class Employee extends Person {
    private double salary;
    private int experience;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Employee() {
    }

    public Employee(String name, int age, double salary, int experience) {
        super(name, age);
        this.salary = salary;
        this.experience = experience;
    }
}
