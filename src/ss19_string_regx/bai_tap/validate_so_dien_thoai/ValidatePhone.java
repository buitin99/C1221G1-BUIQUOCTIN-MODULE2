package ss19_string_regx.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Phone number!");
        String phoneNumber = scanner.nextLine();
        boolean check = phoneNumber.matches("^\\([0-9]{2}\\)-\\(0\\d{9}\\)$");
        if (check){
            System.out.println("Phone number is true!");
        }else
        {
            System.out.println("Phone number is false!");
        }
    }
}
