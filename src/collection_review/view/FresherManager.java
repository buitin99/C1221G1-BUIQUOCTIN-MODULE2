package collection_review.view;
import collection_review.model.Experience;
import collection_review.model.Fresher;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherManager {
    Scanner scanner = new Scanner(System.in);
    private List<Fresher> fresherList = new ArrayList<>();

    public FresherManager() {
    }

    public FresherManager(List<Fresher> fresherList){
        this.fresherList = fresherList;
    }

    public List<Fresher> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Fresher> fresherList) {
        this.fresherList = fresherList;
    }

    public void addFr(){
        System.out.println("Fresher candidate!");
        System.out.println("Enter Candidate id!");
        int frId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First name!");
        String frfName = scanner.nextLine();
        System.out.println("Enter Last name");
        String frlName = scanner.nextLine();
        System.out.println("Enter Birth date!");
        int frbDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Address!");
        String frAdd = scanner.nextLine();
        System.out.println("Enter phone number!");
        String frPhone = scanner.nextLine();
        System.out.println("Enter email!");
        String frEmail = scanner.nextLine();
        System.out.println("Enter graduated time!");
        int frTime = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Rank of Graduation !");
        String frRank = scanner.nextLine();
        System.out.println("Add succesction!");
        fresherList.add(new Fresher(frId,frfName,frlName,frbDate,frAdd,frPhone,frEmail,frTime,frRank));
    }

    public void searchingFr() {
        List<Fresher> searchFr = new ArrayList<>();
        System.out.println("Enter name to search!");
        String searchName = scanner.nextLine();
        for (Fresher fr : fresherList) {
            if (fr.getFirstName().contains(searchName) || fr.getLastName().contains(searchName)) {
                searchFr.add(fr);
            }
        }
        displayEx(searchFr);
    }

    public void displayEx(List<Fresher> fresherList) {
        if (fresherList.size() == 0) {
            System.out.println("not found candidate!");
            return;
        }
        System.out.println("candidate find it:");
        for (Fresher fr : fresherList) {
            System.out.println(fr);
        }
    }
}
