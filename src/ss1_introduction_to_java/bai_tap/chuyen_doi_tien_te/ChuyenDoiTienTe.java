package ss1_introduction_to_java.bai_tap.chuyen_doi_tien_te;
import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd;
        double usd;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dolar: ");
        vnd = scanner.nextDouble();
        usd = vnd*24000;

        System.out.print("Change: " + usd);

    }
}
