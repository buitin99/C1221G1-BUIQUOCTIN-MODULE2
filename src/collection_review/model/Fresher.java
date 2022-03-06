package collection_review.model;

public class Fresher extends Candidates {
    private int graduationDate;
    private String rankOfGraduation;

    public Fresher() {
    }

    public Fresher(int candidateId, String firstName, String lastName, int birthDate, String address, String phoneNumber, String email, int graduationDate, String rankOfGraduation) {
        super(candidateId, firstName, lastName, birthDate, address, phoneNumber, email);
        this.graduationDate = graduationDate;
        this.rankOfGraduation = rankOfGraduation;
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
