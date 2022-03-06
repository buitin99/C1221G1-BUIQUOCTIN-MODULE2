package collection_review.model;

public class Intern extends Candidates {

    private String majors;
    private int Semester;
    private String universityName;

    public Intern() {
    }

    public Intern(int candidateId, String firstName, String lastName, int birthDate, String address, String phoneNumber, String email, String majors, int semester, String universityName) {
        super(candidateId, firstName, lastName, birthDate, address, phoneNumber, email);
        this.majors = majors;
        Semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "candidateId=" + getCandidateId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthDate=" + getBirthDate()+
                ", address=" + getAddress() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                "majors='" + majors + '\'' +
                ", Semester=" + Semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
