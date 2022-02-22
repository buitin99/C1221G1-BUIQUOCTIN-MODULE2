package ss3_array.bai_tap.gop_mang;
import java.util.Arrays;
import java.util.Scanner;


public class GopMang {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        int i = 0;
        int i1 = 0;
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        size = scanner.nextInt();
        array1 = new int[size];
        array2 = new int[size];
        array3 = new int[size+size];
        while (i < size) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array1[i] = scanner.nextInt();
            i++;
        }
        while (i1 < size) {
            System.out.print("Enter element" + (i1 + 1) + " : ");
            array2[i1] = scanner.nextInt();
            i1++;
        }
        for (int g = 0; g < array1.length;g++){
            array3[g] = array1[g];
        }
        for (int g1 = 0; g1 < array2.length;g1++){
            array3[array1.length+g1] = array2[g1];
        }
        System.out.println(Arrays.toString(array3));
    }
}
