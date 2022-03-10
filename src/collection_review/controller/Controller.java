package collection_review.controller;
import collection_review.view.ExperienceManager;
import collection_review.view.FresherManager;
import collection_review.view.InternManager;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExperienceManager experienceManager = new ExperienceManager();
        FresherManager fresherManager = new FresherManager();
        InternManager internManager = new InternManager();
        boolean flag = true;
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM!:\n" +
                    "1. Experience!\n" +
                    "2. Fresher!\n" +
                    "3. Internship!\n" +
                    "4. Searching!\n" +
                    "5. Exit!\n");
            System.out.println("Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program!");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    experienceManager.addEx();
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue (Press Y!)");
                    System.out.println("2. No to display all candidates (Press N!)");
                    String chooseYNE = scanner.nextLine();
                    if (chooseYNE.equals("n") || chooseYNE.equals("N") ){
                        experienceManager.displayExp();
                        flag = false;
                    }
                    break;
                case 2:
                    fresherManager.addFr();
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue (Press Y!)");
                    System.out.println("2. No to display all candidates (Press N!)");
                    String chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")){
                        fresherManager.displayExf();
                        flag = false;
                    }
                    break;
                case 3:
                    internManager.addIn();
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue (Press Y!)");
                    System.out.println("2. No to display all candidates (Press N!)");
                    String chooseYNI = scanner.nextLine();
                    if (chooseYNI.equals("n")|| chooseYNI.equals("N")){
                        internManager.displayExi();
                        flag = false;
                    }
                    break;
                case 4:
                    System.out.println("CANDIDATE SEARCHING!:\n" +
                            "0. For Experience!\n" +
                            "1. For Fresher!\n" +
                            "2. For Internship!\n" +
                            "3. Exit!\n");
                    int chooseMenu1 = Integer.parseInt(scanner.nextLine());
                    switch (chooseMenu1) {
                        case 0:
                            experienceManager.searchingEx();
                            break;
                        case 1:
                            fresherManager.searchingFr();
                            break;
                        case 2:
                            internManager.searchingIn();
                            break;
                        default:
                            flag = false;
                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}

