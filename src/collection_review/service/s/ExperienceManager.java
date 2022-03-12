package collection_review.service.s;
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
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        System.out.println("Experience candidate!");
        System.out.println("Enter Candidate id!");
        int exId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First name!");
        String exfName = scanner.nextLine();
        System.out.println("Enter Last name");
        String exlName = scanner.nextLine();
        String exbD;
        do {
            System.out.println("Enter Birth date (Please enter YYYY!)");
            exbD = scanner.nextLine();
            if (exbD.length() == 4) {
                int check = Integer.parseInt(exbD);
                if (check > 1900){
                    flag = false;
                }
            }
        } while (flag);
        System.out.println("Enter Address!");
        String exAdd = scanner.nextLine();
        String exP;
        do {
            System.out.println("Enter phone number (Please enter more than 10 characters!)");
            exP = scanner.nextLine();
            if (exP.length() >= 10) {
                flag1 = false;
            }
        } while (flag1);
        String exE;
        do {
            System.out.println("Enter email (Please enter <account_name>@<domain>!)");
            exE = scanner.nextLine();
            if (exE.contains("@")){
                flag3 = false;
            }
        }
        while (flag3);
        int exEX;
        do {
            System.out.println("Enter year of experience!");
            exEX = Integer.parseInt(scanner.nextLine());
            if (exEX > 0 && exEX < 100){
                flag2 = false;
            }
        }while (flag2);
        int exyoEx = exEX;
        System.out.println("Enter Professional Skill!");
        String expSkill = scanner.nextLine();
        System.out.println("Add succesction!");
        experienceList.add(new Experience(exId, exfName, exlName, exbD, exAdd, exP, exE, exyoEx, expSkill));
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

    public void displayExp() {
        System.out.println("Display Experience!");
        for (Experience e : experienceList) {
            System.out.println(e);
        }
        System.out.println();
    }
    
}

