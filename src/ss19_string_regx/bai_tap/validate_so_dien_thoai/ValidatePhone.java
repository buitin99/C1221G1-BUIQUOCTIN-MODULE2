package ss19_string_regx.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Phone number!");
//        String phoneNumber = scanner.nextLine();
        String phoneNumber2 = scanner.nextLine();
//        boolean check = phoneNumber.matches("^\\([0-9]{2}\\)-\\(0\\d{9}\\)$");

        //CHECK SERVICE CODE VILLA
        //"^[SVVL]{4}-\\d{4}$"
        //CHECK SERVICE CODE HOUSE
        //"^[SVHO]{4}-\\d{4}$"
        //CHECK SERVICE CODE ROOM
        //"^[SVRO]{4}-\\d{4}$"
        //CHECK AREA POOL
        //^[3-9][0-9]{1,}$
        //
        //^[1-9]{1,}$
        boolean check2 = phoneNumber2.matches("^[S][V][V|H|R][L|O]-\\d{4}$");
        if (check2){
            System.out.println("Phone number is true!");
        }else
        {
            System.out.println("Phone number is false!");
        }
    }
}
