package ss3_array.bai_tap.find_max;
import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soDong;
        int soCot;

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

        int max = mangHaiChieu[0][0];

        for(int i = 0; i < soDong; i++){
            for (int j = 0; j < soCot; j++){
                if(mangHaiChieu[i][j]>max){
                    max = mangHaiChieu[i][j];
                }
            }
        }
        System.out.print("Số lớn nhất trong mảng 2 chiều là" + max);

    }
}
