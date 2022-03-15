package case_study_nhap.models;

public class Employee extends Person{

    private String employeeCode;
    private String identifyCard;
    private String phoneNumber;
    private String email;
    private String degree;
    private String role;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, int dateOfBirth, String gender, String employeeCode, String identifyCard, String phoneNumber, String email, String degree, String role, double salary) {
        super(name, age, dateOfBirth, gender);
        this.employeeCode = employeeCode;
        this.identifyCard = identifyCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.degree = degree;
        this.role = role;
        this.salary = salary;
    }



    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                "date of birth ='" +getDateOfBirth()  + '\'' +
                "gender='" + getGender() + '\'' +
                "employeeCode='" + employeeCode + '\'' +
                ", identifyCard='" + identifyCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", degree='" + degree + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
