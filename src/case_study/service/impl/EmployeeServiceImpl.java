package case_study.service.impl;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl {

    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        String degree;
        System.out.println("Enter name of employee!");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth of employee!");
        String dOB = scanner.nextLine();
        System.out.println("Enter gender of employee!");
        String gender = scanner.nextLine();
        System.out.println("Enter identify Card of employee!");
        String identifyCard = scanner.nextLine();
        System.out.println("Enter phone number of employee!");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email of employee!");
        String email = scanner.nextLine();
        System.out.println("Enter employee id of employee!");
        String employeeID = scanner.nextLine();
        System.out.println("choose degree of employee!");
        System.out.println("1. Intermediate");
        System.out.println("2. Colleges");
        System.out.println("3. University");
        System.out.println("4. After University");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                degree = "Intermediate";
                break;
            case 2:
                degree = "Colleges";
                break;
            case 3:
                degree = "University";
            case 4:
                degree = "After University";
                break;
            default:
                degree = "Intermediate";
        }
        System.out.println("Enter position of employee!");
        String position = scanner.nextLine();
        System.out.println("Enter salary of employee!");
        String salary = scanner.nextLine();
        employeeList.add(new Employee(name, dOB, gender, identifyCard, phoneNumber, email, employeeID, degree, position, salary));
        System.out.println("Add new employee success!");
    }

    public void display() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    public void edit() {
        display();
        System.out.println("Enter identify card of employee to change!");
        String eIC = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getIdentifyCard().equals(eIC)) {
                edit2(i);
                break;
            } else {
                System.out.println("Not found employee!");
            }
        }


    }

    public void edit2(int i) {
        boolean flag = true;
        String chooseYNF;
        do {
            System.out.println("MENU EDIT EMPLOYEE!");
            System.out.println("0: EDIT NAME!");
            System.out.println("1: EDIT DATE OF BIRTH!");
            System.out.println("2: EDIT GENDER!");
            System.out.println("3: EDIT IDENTIFY CARD!");
            System.out.println("5: EDIT PHONE NUMBER!");
            System.out.println("6: EDIT EMAIL!");
            System.out.println("7: EDIT DEGREE!");
            System.out.println("8: EDIT ROLE!");
            System.out.println("9: EDIT SALARY!");
            System.out.println("10: TO RETURN MAIN MENU!");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 0:
                    System.out.println("Enter name to change!");
                    String cName = scanner.nextLine();
                    employeeList.get(i).setName(cName);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 1:
                    System.out.println("Enter gender to change");
                    String cDoB = scanner.nextLine();
                    employeeList.get(i).setDateOfBirth(cDoB);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 2:
                    System.out.println("Enter birdth to change");
                    String cG = scanner.nextLine();
                    employeeList.get(i).setGender(cG);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 3:
                    System.out.println("Enter identify card to change");
                    String cIC = scanner.nextLine();
                    employeeList.get(i).setIdentifyCard(cIC);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 4:
                    System.out.println("Enter phone number to change");
                    String cPN = scanner.nextLine();
                    employeeList.get(i).setIdentifyCard(cPN);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 5:
                    System.out.println("Enter email to change");
                    String cE = scanner.nextLine();
                    employeeList.get(i).setEmail(cE);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 6:
                    System.out.println("Enter employee id to change");
                    String eID = scanner.nextLine();
                    employeeList.get(i).setDegree(eID);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 7:
                    System.out.println("Enter degree to change");
                    String cR;
                    System.out.println("choose degree of employee!");
                    System.out.println("1. Intermediate");
                    System.out.println("2. Colleges");
                    System.out.println("3. University");
                    System.out.println("4. After University");
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            cR = "Intermediate";
                            break;
                        case 2:
                            cR = "Colleges";
                            break;
                        case 3:
                            cR = "University";
                        case 4:
                            cR = "After University";
                            break;
                        default:
                            cR = "Intermediate";
                    }
                    employeeList.get(i).setDegree(cR);
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 8:
                    System.out.println("Enter postion to change");
                    String eP = scanner.nextLine();
                    employeeList.get(i).setPosition(eP);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                case 9:
                    System.out.println("Enter salary to change");
                    String eS = scanner.nextLine();
                    employeeList.get(i).setSalary(eS);
                    System.out.println("Do you want continue (Y/N)?");
                    System.out.println("1. Yes to continue eidt information employee (Press Y!)");
                    System.out.println("2. No to exit programming (Press N!)");
                    chooseYNF = scanner.nextLine();
                    if (chooseYNF.equals("n") || chooseYNF.equals("N")) {
                        flag = false;
                    }
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
    }
}
