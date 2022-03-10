package collection_review.model;
public class Fresher extends Candidates {
    private int graduationDate;
    private String rankOfGraduation;

    public Fresher() {
    }

    public Fresher(int candidateId, String firstName, String lastName, String birthDate, String address, String phoneNumber, String email, int graduationDate, String rankOfGraduation) {
        super(candidateId, firstName, lastName, birthDate, address, phoneNumber, email);
        this.graduationDate = graduationDate;
        this.rankOfGraduation = rankOfGraduation;
    }

    public Fresher(int frId, String frfName, String frlName, int frbDate, String frAdd, String frPhone, String frEmail, int frTime) {
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
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
                "graduationDate=" + graduationDate +
                ", rankOfGraduation='" + rankOfGraduation + '\'' +
                '}';
    }
}
