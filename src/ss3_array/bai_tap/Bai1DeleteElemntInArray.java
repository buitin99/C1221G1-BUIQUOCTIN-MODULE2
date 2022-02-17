package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1DeleteElemntInArray {
    public static void main(String[] args) {
        int size;
        int i = 0;
        int[] array;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();
        array = new int[size];
        while (i < size) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Enter a number:");
        number = scanner.nextInt();

        for (int i1 = 0; i1 < array.length; i1++) {
            if (number == array[i1]) {
                if (i1 == array.length - 1) {
                    array[array.length - 1] = 0;
                } else {
                    for (int i2 = i1; i2 < array.length - 1; i2++) {
                        array[i2] = array[i2 + 1];
                        array[i2 + 1] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
