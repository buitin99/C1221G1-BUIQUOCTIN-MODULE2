package collection_review.view;
import collection_review.model.Experience;
import collection_review.model.Intern;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternManager {
    Scanner scanner = new Scanner(System.in);
    private List<Intern> internList = new ArrayList<>();

    public InternManager(List<Intern> internList){
        this.internList = internList;
    }

    public InternManager() {
    }

    public List<Intern> getInternList() {
        return internList;
    }

    public void setInternList(List<Intern> internList) {
        this.internList = internList;
    }

    public void addIn(){
        System.out.println("Intern candidate!");
        System.out.println("Enter Candidate id!");
        int inId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First name!");
        String infName = scanner.nextLine();
        System.out.println("Enter Last name");
        String inlName = scanner.nextLine();
        System.out.println("Enter Birth date!");
        int inbDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address!");
        String inAdd = scanner.nextLine();
        System.out.println("Enter phone number!");
        String inPhone = scanner.nextLine();
        System.out.println("Enter email!");
        String inEmail = scanner.nextLine();
        System.out.println("Enter Majors!");
        String inMajors = scanner.nextLine();
        System.out.println("Enter Semester!");
        int inSemester = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter University name!");
        String inUName = scanner.nextLine();
        System.out.println("Add succesction!");
        internList.add(new Intern(inId,infName,inlName,inbDate,inAdd,inPhone,inEmail,inMajors,inSemester,inUName));
    }

    public void searchingIn() {
        List<Intern> searchIn = new ArrayList<>();
        System.out.println("Enter name to search!");
        String searchName = scanner.nextLine();
        for (Intern in : internList) {
            if (in.getFirstName().contains(searchName) || in.getLastName().contains(searchName)) {
                searchIn.add(in);
            }
        }
        displayEx(searchIn);
    }

    public void displayEx(List<Intern> internList) {
        if (internList.size() == 0) {
            System.out.println("not found candidate!");
            return;
        }
        System.out.println("candidate find it:");
        for (Intern in : internList) {
            System.out.println(in);
        }
    }
}
