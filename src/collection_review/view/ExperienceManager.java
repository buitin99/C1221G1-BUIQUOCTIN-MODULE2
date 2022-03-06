package collection_review.view;
import collection_review.model.Experience;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ExperienceManager {
    Scanner scanner = new Scanner(System.in);
    private List<Experience> experienceList = new ArrayList<>();


    public ExperienceManager() {
    }

    public ExperienceManager(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public List<Experience> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }

    public void addEx() {
        System.out.println("Experience candidate!");
        System.out.println("Enter Candidate id!");
        int exId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First name!");
        String exfName = scanner.nextLine();
        System.out.println("Enter Last name");
        String exlName = scanner.nextLine();
        System.out.println("Enter Birth date!");
        int exbDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address!");
        String exAdd = scanner.nextLine();
        System.out.println("Enter phone number!");
        String exPhone = scanner.nextLine();
        System.out.println("Enter email!");
        String exEmail = scanner.nextLine();
        System.out.println("Enter year of experience!");
        int exyoEx = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Professional Skill!");
        String expSkill = scanner.nextLine();
        System.out.println("Add succesction!");
        experienceList.add(new Experience(exId, exfName, exlName, exbDate, exAdd, exPhone, exEmail, exyoEx, expSkill));
    }

    public void searchingEx() {
        List<Experience> searchEx = new ArrayList<>();
        System.out.println("Enter name to search!");
        String searchName = scanner.nextLine();
        for (Experience ex : experienceList) {
            if (ex.getFirstName().contains(searchName) || ex.getLastName().contains(searchName)) {
                searchEx.add(ex);
            }
        }
        displayEx(searchEx);
    }

    public void displayEx(List<Experience> experienceList) {
        if (experienceList.size() == 0) {
            System.out.println("not found candidate!");
            return;
        }
        System.out.println("candidate find it:");
        for (Experience ex : experienceList) {
            System.out.println(ex);
        }
    }
}

