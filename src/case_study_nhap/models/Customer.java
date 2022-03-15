package case_study_nhap.models;

public class Customer extends Person {
    private String idCustomer;
    private String nameCustomer;
    private String dateOB;
    private String gender;
    private String identifyCardCustomer;
    private String phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String idCustomer, String nameCustomer, String dateOB, String gender, String identifyCardCustomer, String phoneNumber, String email, String typeOfCustomer, String address) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateOB = dateOB;
        this.gender = gender;
        this.identifyCardCustomer = identifyCardCustomer;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String name, int age, int dateOfBirth, String gender, String idCustomer, String nameCustomer, String dateOB, String gender1, String identifyCardCustomer, String phoneNumber, String email, String typeOfCustomer, String address) {
        super(name, age, dateOfBirth, gender);
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateOB = dateOB;
        this.gender = gender1;
        this.identifyCardCustomer = identifyCardCustomer;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateOB() {
        return dateOB;
    }

    public void setDateOB(String dateOB) {
        this.dateOB = dateOB;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentifyCardCustomer() {
        return identifyCardCustomer;
    }

    public void setIdentifyCardCustomer(String identifyCardCustomer) {
        this.identifyCardCustomer = identifyCardCustomer;
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

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", dateOB='" + dateOB + '\'' +
                ", gender='" + gender + '\'' +
                ", identifyCardCustomer='" + identifyCardCustomer + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
