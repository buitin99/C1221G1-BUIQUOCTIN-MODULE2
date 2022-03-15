package case_study_nhap.service.impl;

import case_study_nhap.models.Customer;
import case_study_nhap.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    List<Customer> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        String typeOfCustomer;
        System.out.println("Enter ID customer! ");
        String idC = scanner.nextLine();
        System.out.println("Enter name customer! ");
        String nC = scanner.nextLine();
        System.out.println("Enter date of birth! ");
        String dOBC = scanner.nextLine();
        System.out.println("Enter gender of customer! ");
        String gender = scanner.nextLine();
        System.out.println("Enter identify card of customer! ");
        String identifyCard = scanner.nextLine();
        System.out.println("Enter phone number of customer! ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email of customer! ");
        String email = scanner.nextLine();
        System.out.println("Choosen type of Customer! ");
        System.out.println("1: Diamond");
        System.out.println("2: Platinium");
        System.out.println("3: Gold");
        System.out.println("4: Silver");
        System.out.println("5: Menber");
        int choosenTOC = Integer.parseInt(scanner.nextLine());
        switch (choosenTOC) {
            case 1:
                typeOfCustomer = "Diamond";
                break;
            case 2:
                typeOfCustomer = "Platinium";
                break;
            case 3:
                typeOfCustomer = "Gold";
                break;
            case 4:
                typeOfCustomer = "Silver";
                break;
            case 5:
                typeOfCustomer = "Menber";
                break;
            default:
                typeOfCustomer = "New Customer";
        }
        System.out.println("Enter address of customer! ");
        String address = scanner.nextLine();

        customerList.add(new Customer(idC, nC, dOBC, gender, identifyCard, phoneNumber, email, typeOfCustomer, address));
    }

    public void display() {
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    public void edit() {
        boolean check = false;
        String typeOfCustomer;
        int find = 0;
        System.out.println("Enter identify Card of customer to find");
        String codeFind;
        codeFind = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdentifyCardCustomer().equals(codeFind)) {
                find = i;
                check = true;
                break;
            }
            if (check) {
                System.out.println("MENU EDIT EMPLOYEE!");
                System.out.println("0: EDIT ID CUSTOMER!");
                System.out.println("1: EDIT NAME CUSTOMER!");
                System.out.println("2: EDIT DATE OF BIRTH!");
                System.out.println("3: EDIT GENDER!");
                System.out.println("4: EDIT IDENTIFY CARD!");
                System.out.println("5: EDIT PHONE NUMBER!");
                System.out.println("6: EDIT EMAIL!");
                System.out.println("7: EDIT TYPE OF CUSTOMER!");
                System.out.println("8: EDIT ADDRESS!");
                System.out.println("9: EXIT!");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 0:
                        System.out.println("Enter id to change!");
                        String cID = scanner.nextLine();
                        customerList.get(find).setIdCustomer(cID);
                        break;
                    case 1:
                        System.out.println("Enter name to change");
                        String cName = scanner.nextLine();
                        customerList.get(find).setNameCustomer(cName);
                        break;
                    case 2:
                        System.out.println("Enter date of birth to change");
                        String cBD = scanner.nextLine();
                        customerList.get(find).setDateOB(cBD);
                        break;
                    case 3:
                        System.out.println("Enter gender to change");
                        String cGender = scanner.nextLine();
                        customerList.get(find).setGender(cGender);
                        break;
                    case 4:
                        System.out.println("Enter identify card to change");
                        String cIC = scanner.nextLine();
                        customerList.get(find).setIdentifyCardCustomer(cIC);
                        break;
                    case 5:
                        System.out.println("Enter phone number to change");
                        String cPN = scanner.nextLine();
                        customerList.get(find).setPhoneNumber(cPN);
                        break;
                    case 6:
                        System.out.println("Enter email to change");
                        String cE = scanner.nextLine();
                        customerList.get(find).setEmail(cE);
                        break;
                    case 7:
                        System.out.println("Choosen type of Customer to change! ");
                        System.out.println("1: Diamond");
                        System.out.println("2: Platinium");
                        System.out.println("3: Gold");
                        System.out.println("4: Silver");
                        System.out.println("5: Menber");
                        int choosenTOC = Integer.parseInt(scanner.nextLine());
                        switch (choosenTOC) {
                            case 1:
                                typeOfCustomer = "Diamond";
                                break;
                            case 2:
                                typeOfCustomer = "Platinium";
                                break;
                            case 3:
                                typeOfCustomer = "Gold";
                                break;
                            case 4:
                                typeOfCustomer = "Silver";
                                break;
                            case 5:
                                typeOfCustomer = "Menber";
                                break;
                            default:
                                typeOfCustomer = "New Customer";
                        }
                        customerList.get(find).setTypeOfCustomer(typeOfCustomer);
                        break;
                    case 9:
                        System.out.println("Enter address to change");
                        String cA = scanner.nextLine();
                        customerList.get(find).setAddress(cA);
                        break;
                }
            } else {
                System.out.println("Not found employee!");
            }

        }
    }
}
