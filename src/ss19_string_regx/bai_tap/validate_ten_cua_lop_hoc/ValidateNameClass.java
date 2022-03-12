package ss19_string_regx.bai_tap.validate_ten_cua_lop_hoc;

import java.util.Scanner;

public class ValidateNameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name class!");
        String nameClass = scanner.nextLine();
        boolean check = nameClass.matches("^[ACP]\\d{4}[GHIKLM]$");
        if (check){
            System.out.println("Name class is true!");
        }else
        {
            System.out.println("Name class is false!");
        }
    }
}
