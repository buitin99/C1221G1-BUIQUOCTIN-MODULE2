package case_study.models;

public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String identifyCard;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, String identifyCard, String phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identifyCard = identifyCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
