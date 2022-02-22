package ss2_loop_in_java.bai_tap.so_nguyen_to;

import java.util.Scanner;

public class SoNguyenTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên tố cần in ra:");
        int numbers = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 0;
        while (count < numbers) {
            boolean flag = true;
            if (n < 2) {
                flag = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                count++;
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
