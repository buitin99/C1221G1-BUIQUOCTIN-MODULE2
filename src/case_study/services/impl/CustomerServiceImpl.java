package case_study.services.impl;
import case_study.models.Customer;
import case_study.services.IEmployeeService;
import case_study.utils.ReadAndWriteCSV;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerListRW = ReadAndWriteCSV.readCustomerListFromCSV();

    @Override
    public void add(){
        String typeOfCustomer;
        System.out.println("Enter name customer!");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth customer!");
        String doB = scanner.nextLine();
        System.out.println("Enter gender customer!");
        String gender = scanner.nextLine();
        System.out.println("Enter identify card customer!");
        String identifyCard = scanner.nextLine();
        System.out.println("Enter phone number customer!");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email customer!");
        String email = scanner.nextLine();
        System.out.println("Enter customer id!");
        String customerId = scanner.nextLine();
        System.out.println("Choosen type of Customer! ");
        System.out.println("1: Diamond");
        System.out.println("2: Platinium");
        System.out.println("3: Gold");
        System.out.println("4: Silver");
        System.out.println("5: Menber");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
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
        System.out.println("Enter address customer!");
        String address = scanner.nextLine();
        customerListRW.add(new Customer(name,doB,gender,identifyCard,phoneNumber,email,customerId,typeOfCustomer,address));
        System.out.println("Add customer succes!");
        ReadAndWriteCSV.writeCustomer(customerListRW,true);

    }
    @Override
    public void display(){
        for (Customer c: customerListRW) {
            System.out.println(c);
        }
    }

    @Override
    public void edit(){
        display();
        System.out.println("Enter identify card of customer to change!");
        String cIC = scanner.nextLine();
        for (int i = 0; i < customerListRW.size(); i++) {
            if (customerListRW.get(i).getIdentifyCard().equals(cIC)) {
                editMain(i);
                break;
            } else {
                System.out.println("Not found customer!");
            }
        }

    }
    @Override
    public void editMain(int i){
        boolean flag = true;
        String typeOfCustomer;
        do {
            System.out.println("MENU EDIT CUSTOMER!");
            System.out.println("0: EDIT NAME!");
            System.out.println("1: EDIT DATE OF BIRTH!");
            System.out.println("2: EDIT GENDER!");
            System.out.println("3: EDIT IDENTIFY CARD!");
            System.out.println("4: EDIT PHONE NUMBER!");
            System.out.println("5: EDIT EMAIL!");
            System.out.println("6: EDIT CUSTOMER ID!");
            System.out.println("7: EDIT TYPE OF CUSTOMER!!");
            System.out.println("8: EDIT ADRESS!");
            System.out.println("9: TO RETURN MAIN MENU!");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 0:
                    System.out.println("Enter name to change!");
                    String cName = scanner.nextLine();
                    customerListRW.get(i).setName(cName);
                    break;
                case 1:
                    System.out.println("Enter date of birth to change");
                    String cDoB = scanner.nextLine();
                    customerListRW.get(i).setDateOfBirth(cDoB);
                    break;
                case 2:
                    System.out.println("Enter gender to change");
                    String cG = scanner.nextLine();
                    customerListRW.get(i).setGender(cG);
                    break;

                case 3:
                    System.out.println("Enter identify card to change");
                    String cIC = scanner.nextLine();
                    customerListRW.get(i).setIdentifyCard(cIC);
                    break;
                case 4:
                    System.out.println("Enter phone number to change");
                    String cPN = scanner.nextLine();
                    customerListRW.get(i).setPhoneNumber(cPN);
                    break;
                case 5:
                    System.out.println("Enter email to change");
                    String cE = scanner.nextLine();
                    customerListRW.get(i).setEmail(cE);
                    break;
                case 6:
                    System.out.println("Enter customer id to change");
                    String cID = scanner.nextLine();
                    customerListRW.get(i).setCustomerId(cID);
                    break;
                case 7:
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
                    customerListRW.get(i).setTypeOfCustomer(typeOfCustomer);
                    break;
                case 8:
                    System.out.println("Enter address to change");
                    String cA = scanner.nextLine();
                    customerListRW.get(i).setAddress(cA);
                    break;
                default:
                    flag = false;
            }
        }
        while (flag);
        ReadAndWriteCSV.writeCustomer(customerListRW,false);
    }
}

