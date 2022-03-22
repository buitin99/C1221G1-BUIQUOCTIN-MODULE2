package tu_on_tap.on_tap.utils;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static String regexStr(String temp, String regex, String error){
        boolean check = true;
        do{
            if (temp.matches(regex)){
                check = false;
            }else
            {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        }while (check);
        return temp;
    }
}
