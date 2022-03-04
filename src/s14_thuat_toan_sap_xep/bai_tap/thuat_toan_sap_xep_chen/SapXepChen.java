package s14_thuat_toan_sap_xep.bai_tap.thuat_toan_sap_xep_chen;
import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        insertionSort();
    }
    public static void insertionSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array!");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Enter element" + (i+1) + "of array");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int pos, x;

        for (int i = 0; i < array.length;i++){
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println();
    }
}

