package collection_review.model;

public class Experience extends Candidates {
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int candidateId, String firstName, String lastName, String birthDate, String address, String phoneNumber, String email, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phoneNumber, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
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
                ", expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
