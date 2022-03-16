package case_study.controllers;

import case_study.service.IService;
import case_study.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class Controller {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean flag = true;
        do {
            System.out.println("Display Main Menu:\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n");
            System.out.print("Select number!");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    System.out.println("Display Emloyee Management!\n" +
                            "1. Display list employees\n" +
                            "2. Add new employee\n" +
                            "3. Edit employee\n" +
                            "4. Return main menu\n");
                    System.out.println("Select number!");
                    int chooseMenu1 = Integer.parseInt(scanner.nextLine());
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
                    int chooseMenu2 = Integer.parseInt(scanner.nextLine());
                    switch (chooseMenu2) {
                        case 1:
                            System.out.println("Display list customers");
//                            customerService.display();
                            break;
                        case 2:
                            System.out.println("Add new customers");
//                            customerService.add();
                            break;
                        case 3:
                            System.out.println("Edit customers");
//                            customerService.edit();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Facility Management!\n" +
                            "1. Display list facility\n" +
                            "2. Add new facility\n" +
                            "3. Display list facility maintenance\n" +
                            "4. Return main menu");
                    int chooseMenu3 = Integer.parseInt(scanner.nextLine());
                    switch (chooseMenu3) {
                        case 1:
                            break;
                        case 2:
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
                    int chooseMenu4 = Integer.parseInt(scanner.nextLine());
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
                    int chooseMenu5 = Integer.parseInt(scanner.nextLine());
                    switch (chooseMenu5) {
                        case 1:
                            break;
                        case 2:
                            break;
                    }
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
