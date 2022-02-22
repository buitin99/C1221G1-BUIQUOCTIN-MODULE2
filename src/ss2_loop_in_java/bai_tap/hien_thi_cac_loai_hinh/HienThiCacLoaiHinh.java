package ss2_loop_in_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        int choice1 = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle ");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the rectangle");
                for (int i = 0; i < 3; i++) {
                    System.out.println("*****");
                }
                break;
            case 2:
                System.out.println("Print the square triangle ");
                System.out.println("Menu");
                System.out.println("1. Print the square triangle : botton-left ");
                System.out.println("2. Print the square triangle : top-left ");
                System.out.println("3. Print the square triangle : botton-right ");
                System.out.println("4. Print the square triangle : top-right ");
                System.out.println("Enter your choice: ");
                choice1 = scanner.nextInt();
                switch (choice1) {
                    case 1:
                        System.out.println("Print the square triangle : botton-left ");
                        for (int i = 0; i < 6; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("2. Print the square triangle : top-left ");
                        for (int i = 1; i < 6; i++) {
                            for (int j = 6; j > i; j--) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("3. Print the square triangle : botton-right ");
                        for (int i = 1; i < 6; i++) {
                            System.out.println();
                            for (int k = 5; k > i; k--) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < i; k++) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Print the square triangle : top-right");
                        for (int i = 1; i < 6; i++) {
                            System.out.println();
                            for (int k = 1; k < i; k++) {
                                System.out.print(" ");
                            }
                            for (int k = 6; k > i; k--) {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                        break;
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for (int i = 1; i <= 6; i++) {
                    System.out.println();
                    for (int j = 6; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        if (k == 1 || k == 2 * i - 1 || i == 6) {

                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("No choice!");
        }
    }
}
