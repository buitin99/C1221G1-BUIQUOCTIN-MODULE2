package ss3_array.thuc_hanh.reverse_array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //khai bao bien va kiem tra kich thuoc mang
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        //nhap gia tri cho cac phan tu mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}