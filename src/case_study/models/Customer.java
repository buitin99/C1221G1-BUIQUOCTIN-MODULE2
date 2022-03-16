package case_study.models;

public class Customer extends Person{

    private String customerId;
    private String typeOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String gender, String identifyCard, String phoneNumber, String email, String customerId, String typeOfCustomer, String address) {
        super(name, dateOfBirth, gender, identifyCard, phoneNumber, email);
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
                "name='" + getName() + '\'' +
                "date of birth='" + getDateOfBirth() + '\'' +
                "gender='" + getGender() + '\'' +
                "identify card='" + getIdentifyCard() + '\'' +
                "phone number='" + getPhoneNumber() + '\'' +
                "email='" + getEmail() + '\'' +
                "customerId='" + customerId + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
