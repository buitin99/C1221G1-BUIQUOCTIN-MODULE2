package ss3_array.bai_tap.add_element;

import java.util.Scanner;
import java.util.Arrays;

public class AddElementInArray {
    public static void main(String[] args) {
        int size;
        int i = 0;
        int number;
        int index;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        size = scanner.nextInt();
        array = new int[size + 1];
        while (i < size) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Enter index!");
        index = scanner.nextInt();
        if (index <= -1 || index >= array.length) {
            System.out.println("Invalid index!");
        } else {
            System.out.println("Enter number!");
            number = scanner.nextInt();
            for (int i1 = 0; i1 < array.length; i1++) {
                if(array.length == index){
                    array[array.length] = number;
                }
                else if (i1 == index) {
                    for (int i2 = array.length - 1; i2 > i1; i2--) {
                        array[i2] = array[i2 - 1];
                    }
                    array[index] = number;
                }
            }
            System.out.println(Arrays.toString(array));
        }

    }
}
