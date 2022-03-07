package collection_review.view;

import collection_review.model.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherManager {
    Scanner scanner = new Scanner(System.in);
    private List<Fresher> fresherList = new ArrayList<>();
    Fresher fresher = new Fresher();

    public FresherManager() {
    }

    public FresherManager(List<Fresher> fresherList) {
        this.fresherList = fresherList;
    }

    public List<Fresher> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Fresher> fresherList) {
        this.fresherList = fresherList;
    }

    public void addFr() {
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        System.out.println("Fresher candidate!");
        System.out.println("Enter Candidate id!");
        int frId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First name!");
        String frfName = scanner.nextLine();
        System.out.println("Enter Last name");
        String frlName = scanner.nextLine();
        String frbD;
        do {
            System.out.println("Enter Birth date (Please enter YYYY!)");
            frbD = scanner.nextLine();
            if (frbD.length() == 4) {
                flag = false;
            }
        } while (flag);
        String frbDate = frbD;
        System.out.println("Enter Address!");
        String frAdd = scanner.nextLine();
        String frP;
        do {
            System.out.println("Enter phone number (Please enter more than 10 characters!)");
            frP = scanner.nextLine();
            if (frP.length() >= 10) {
                flag1 = false;
            }
        } while (flag1);
        String frPhone = frP;
        String frE;
        do {
            System.out.println("Enter email (Please enter name_email@gmail.com!)");
            frE = scanner.nextLine();
            if (frE.contains("@gmail.com")){
                flag3 = false;
            }
        }
        while (flag3);
        String frEmail = frE;
        System.out.println("Enter graduated time!");
        int frTime = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("CHOOSE RANK OF GRADUATION!:\n" +
                    "1. Excellence!\n" +
                    "2. Good!\n" +
                    "3. Fair!\n" +
                    "4. Poor!\n");
            int choose = Integer.parseInt(scanner.nextLine());
            String frRank;
            switch (choose) {
                case 1:
                    fresherGraduationOfList(1);
                    frRank = fresher.getRankOfGraduation();
                    System.out.println("Add succesction!");
                    fresherList.add(new Fresher(frId, frfName, frlName, frbDate, frAdd, frPhone, frEmail, frTime, frRank));
                    break;
                case 2:
                    fresherGraduationOfList(2);
                    frRank = fresher.getRankOfGraduation();
                    System.out.println("Add succesction!");
                    fresherList.add(new Fresher(frId, frfName, frlName, frbDate, frAdd, frPhone, frEmail, frTime, frRank));
                    break;
                case 3:
                    fresherGraduationOfList(3);
                    frRank = fresher.getRankOfGraduation();
                    System.out.println("Add succesction!");
                    fresherList.add(new Fresher(frId, frfName, frlName, frbDate, frAdd, frPhone, frEmail, frTime, frRank));
                    break;
                case 4:
                    fresherGraduationOfList(4);
                    frRank = fresher.getRankOfGraduation();
                    System.out.println("Add succesction!");
                    fresherList.add(new Fresher(frId, frfName, frlName, frbDate, frAdd, frPhone, frEmail, frTime, frRank));
                    break;
                default:
                    flag2 = false;
            }
            break;
        } while (flag2);

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

    public void fresherGraduationOfList(int chooseGraduation) {
        List<String> fresherGraduationOfList = new ArrayList<>();
        fresherGraduationOfList.add("1. Excellence");
        fresherGraduationOfList.add("2. Good");
        fresherGraduationOfList.add("3. Fair");
        fresherGraduationOfList.add("4. Poor");
        if (chooseGraduation == 1) {
            fresher.setRankOfGraduation("Excellence");
        } else if (chooseGraduation == 2) {
            fresher.setRankOfGraduation("Good");
        } else if (chooseGraduation == 3) {
            fresher.setRankOfGraduation("Fair");
        } else {
            fresher.setRankOfGraduation("Poor");
        }
    }

    public void displayExf() {
        for (Fresher f: fresherList) {
            System.out.println(f);
        }
    }
}
