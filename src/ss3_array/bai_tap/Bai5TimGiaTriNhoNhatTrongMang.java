package ss3_array.bai_tap;
import java.util.Scanner;
public class Bai5TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] array;

        System.out.println("Enter size");
        size = scanner.nextInt();

        array = new int[size];

        for (int i = 0; i < array.length; i++){
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];

        for(int g = 0; g < array.length;g++){
            if(min > array[g]){
                min = array[g];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);




    }
}
