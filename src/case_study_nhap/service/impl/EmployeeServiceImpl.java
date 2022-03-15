package case_study_nhap.service.impl;

import case_study_nhap.models.Employee;
import case_study_nhap.service.IEmployeeService;
import case_study_nhap.service.IService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService, IService {

    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Enter name of employee! ");
        String name = scanner.nextLine();
        System.out.println("Enter age of employee! ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter dateOfBirth of employee! ");
        int dateOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender of employee! ");
        String gender = scanner.nextLine();
        System.out.println("Enter id of employee! ");
        String employeeCode = scanner.nextLine();
        System.out.println("Enter identify card of employee! ");
        String identifyCard = scanner.nextLine();
        System.out.println("Enter phone number of employee! ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email of employee! ");
        String email = scanner.nextLine();
        System.out.println("Enter degree of employee! ");
        String degree = scanner.nextLine();
        System.out.println("Enter role of employee! ");
        String role = scanner.nextLine();
        System.out.println("Enter salary of employee! ");
        Double salary = scanner.nextDouble();
        employeeArrayList.add(new Employee(name, age, dateOfBirth, gender, employeeCode, identifyCard, phoneNumber, email, degree, role, salary));
    }

    public void display() {
        for (Employee e : employeeArrayList) {
            System.out.println(e);
        }
    }

    public void edit() {
        boolean flag = true;
        boolean check = false;
        int find = 0;
        do {
            System.out.println("Enter identify Card of employee to find");
            String codeFind;
            codeFind = scanner.nextLine();
            for (int i = 0; i < employeeArrayList.size(); i++) {
                if (employeeArrayList.get(i).getIdentifyCard().equals(codeFind)) {
                    find = i;
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("MENU EDIT EMPLOYEE!");
                System.out.println("0: EDIT NAME!");
                System.out.println("1: EDIT AGE!");
                System.out.println("2: EDIT DATE OF BIRTH!");
                System.out.println("3: EDIT GENDER!");
                System.out.println("4: EDIT EMPLOYEE OF CODE!");
                System.out.println("5: EDIT IDENTIFY CARD!");
                System.out.println("6: EDIT PHONE NUMBER!");
                System.out.println("7: EDIT EMAIL!");
                System.out.println("8: EDIT DEGREE!");
                System.out.println("9: EDIT ROLE!");
                System.out.println("10: EXIT!");

                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 0:
                        System.out.println("Enter name to change!");
                        String cName = scanner.nextLine();
                        employeeArrayList.get(find).setName(cName);
                        break;
                    case 1:
                        System.out.println("Enter age to change");
                        int cAge = Integer.parseInt(scanner.nextLine());
                        employeeArrayList.get(find).setAge(cAge);
                        break;
                    case 2:
                        System.out.println("Enter birdth to change");
                        int cBD = Integer.parseInt(scanner.nextLine());
                        employeeArrayList.get(find).setAge(cBD);
                        break;
                    case 3:
                        System.out.println("Enter gender to change");
                        String cGender = scanner.nextLine();
                        employeeArrayList.get(find).setGender(cGender);
                        break;
                    case 4:
                        System.out.println("Enter employee Code to change");
                        String cEC = scanner.nextLine();
                        employeeArrayList.get(find).setEmployeeCode(cEC);
                        break;
                    case 5:
                        System.out.println("Enter identify card to change");
                        String cIC = scanner.nextLine();
                        employeeArrayList.get(find).setIdentifyCard(cIC);
                        break;
                    case 6:
                        System.out.println("Enter phone number to change");
                        String cPN = scanner.nextLine();
                        employeeArrayList.get(find).setPhoneNumber(cPN);
                        break;
                    case 7:
                        System.out.println("Enter email to change");
                        String cE = scanner.nextLine();
                        employeeArrayList.get(find).setEmail(cE);
                        break;
                    case 8:
                        System.out.println("Enter degree to change");
                        String cD = scanner.nextLine();
                        employeeArrayList.get(find).setDegree(cD);
                        break;
                    case 9:
                        System.out.println("Enter role to change");
                        String cR = scanner.nextLine();
                        employeeArrayList.get(find).setRole(cR);
                        break;
                    default:
                        flag = false;
                }
            } else {
                System.out.println("Not found employee!");
                flag = false;
            }
        } while (flag);
    }


}
