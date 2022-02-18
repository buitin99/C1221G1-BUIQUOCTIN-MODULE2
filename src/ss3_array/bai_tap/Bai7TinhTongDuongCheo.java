package ss3_array.bai_tap;

import java.util.Scanner;

public class Bai7TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soDong;
        int soCot;
        int sum = 0;

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng:");
        soCot = scanner.nextInt();
        int[][] mangHaiChieu = new int[soDong][soCot];

        for(int i = 0; i < soDong; i++){
            for (int j = 0; j < soCot; j++){
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                mangHaiChieu[i][j] = scanner.nextInt();
            }
        }

        for(int g = 0; g < mangHaiChieu.length; g++){
            sum+= mangHaiChieu[g][g];
        }
        System.out.println(sum);
    }

}
