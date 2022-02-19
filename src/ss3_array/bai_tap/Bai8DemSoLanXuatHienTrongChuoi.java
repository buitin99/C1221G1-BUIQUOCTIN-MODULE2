package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai8DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra:");
        String str = scanner.nextLine();
        System.out.println("Nhập 1 ký tự cần kiểm tra:");
        String kiemTra = scanner.nextLine();

        int count = 0;
        int size = str.length();
        for (int i = 0; i < size; i++){
            if(str.charAt(i) == kiemTra.charAt(0)){
                count+=1;
            }
        }
        System.out.println("Số Ký tự xuất hiện trong chỗi là: " + count);
    }

}

