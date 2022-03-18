package case_study.models;

public class Employee extends Person{

    private String employeeID;
    private String degree;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String gender, String identifyCard, String phoneNumber, String email, String employeeID, String degree, String position, String salary) {
        super(name, dateOfBirth, gender, identifyCard, phoneNumber, email);
        this.employeeID = employeeID;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name ='" + getName() + '\'' +
                "date of birth='" + getDateOfBirth() + '\'' +
                "gender='" + getGender() + '\'' +
                "identifyCard='" + getIdentifyCard() + '\'' +
                "phone number='" + getPhoneNumber() + '\'' +
                "email='" + getEmail() + '\'' +
                "employeeID='" + employeeID + '\'' +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getInFor(){
        return this.getName()+","+this.getDateOfBirth()+","+this.getGender()+","+this.getIdentifyCard()+","+this.getPhoneNumber()+","+this.getEmail()+","+this.getEmail()+","+this.employeeID+","+this.degree+","+this.position+","+this.salary;
    }
}
