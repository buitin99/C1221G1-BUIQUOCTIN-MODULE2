package ss2_loop_in_java.bai_tap.so_nguyen_to_2;

public class SoNguyenTo {
    public static void main(String[] args) {
        int numbers = 100;
        int n = 0;
        while (n < numbers) {
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
            if (flag) {
                System.out.print(n + " ");
            }
            n++;
        }

    }
}
