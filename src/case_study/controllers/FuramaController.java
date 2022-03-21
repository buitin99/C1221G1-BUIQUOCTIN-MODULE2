package case_study.controllers;
import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;
import case_study.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean flag = true;
        int chooseMenu = 0;
        do {
            System.out.println("Display Main Menu:\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n");
            System.out.print("Select number!");
            try {
                chooseMenu = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
            }
            switch (chooseMenu) {
                case 1:
                    System.out.println("Display Emloyee Management!\n" +
                            "1. Display list employees\n" +
                            "2. Add new employee\n" +
                            "3. Edit employee\n" +
                            "4. Return main menu\n");
                    System.out.println("Select number!");
                    int chooseMenu1 = 0;
                    try {
                       chooseMenu1 = Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
                    }
                    switch (chooseMenu1) {
                        case 1:
                            System.out.println("Display list employees");
                            employeeService.display();
                            break;
                        case 2:
                            System.out.println("Add new employees!");
                            employeeService.add();
                            break;
                        case 3:
                            System.out.println("Edit employees!");
                            employeeService.edit();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Customer Management!\n" +
                            "1. Display list customers\n" +
                            "2. Add new customers\n" +
                            "3. Edit customers\n" +
                            "4. Return main menu\n");
                    System.out.println("Select number!");
                    int chooseMenu2 = 0;
                    try {
                        chooseMenu2 = Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
                    }
                    switch (chooseMenu2) {
                        case 1:
                            System.out.println("Display list customers");
                            customerService.display();
                            break;
                        case 2:
                            System.out.println("Add new customers");
                            customerService.add();
                            break;
                        case 3:
                            System.out.println("Edit customers");
                            customerService.edit();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Facility Management!\n" +
                            "1. Display list facility\n" +
                            "2. Add new facility\n" +
                            "3. Display list facility maintain\n" +
                            "4. Return main menu");
                    int chooseMenu3 = 0;
                    try {
                        chooseMenu3 = Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
                    }
                    switch (chooseMenu3) {
                        case 1:
                            facilityService.display();
                            break;
                        case 2:
                            facilityService.add();
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Booking Managerment!\n" +
                            "1. Add new booking\n" +
                            "2. Display list booking\n" +
                            "3. Create new constracts\n" +
                            "4. Display list constracts\n" +
                            "5. Edit constracts\n" +
                            "6. Return main menu");
                    int chooseMenu4 = 0;
                    try {
                        chooseMenu4 = Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
                    }
                    switch (chooseMenu4) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Promotion Management!\n" +
                            "1. Display list customers use service\n" +
                            "2. Display list customers get voucher\n" +
                            "3. Return main menu");
                    int chooseMenu5 = 0;
                    try {
                        chooseMenu5 = Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
                    }
                    switch (chooseMenu5) {
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                    break;
                default:
                    displayMainMenu();
                    flag = false;
            }
        } while (flag);
    }
}
