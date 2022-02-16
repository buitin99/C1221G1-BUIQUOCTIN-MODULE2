package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Bai2DocSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number");
        int number = Integer.parseInt(scanner.nextLine());
        String num = Integer.toString(number);
        char[] arr = num.toCharArray();
        if (arr.length == 1) {
            donVi(arr[0]);
        } else if (arr.length == 2) {
            if (arr[0] == '1' && arr[1] == '0') {
                System.out.print("ten");
            } else if (arr[0] == '1' && arr[1] == '1') {
                System.out.print("eleven");
            } else if (arr[0] == '1' && arr[1] == '2') {
                System.out.print("twelve");
            } else if (arr[0] == '1' && arr[1] == '3') {
                System.out.print("thirteen");
            } else if (arr[0] == '1' && arr[1] == '5') {
                System.out.print("fifteen");
            } else {
                chuc(arr[0]);
                donVi(arr[1]);
            }
        } else if (arr.length == 3) {
            tram(arr[0]);
            chuc(arr[1]);
            donVi(arr[2]);
        }

    }

    public static void donVi(int a) {
        switch (a) {
            case '1':
                System.out.print("One");
                break;
            case '2':
                System.out.print("Two");
                break;
            case '3':
                System.out.print("Three");
                break;
            case '4':
                System.out.print("Four");
                break;
            case '5':
                System.out.print("Five");
                break;
            case '6':
                System.out.print("Six");
                break;
            case '7':
                System.out.print("Seven");
                break;
            case '8':
                System.out.print("Eight");
                break;
            case '9':
                System.out.print("Nine");
                break;
        }
    }

    public static void chuc(int b) {
        switch (b) {
            case '1':
                System.out.print("Ten");
                break;
            case '2':
                System.out.print("twenty");
                break;
            case '3':
                System.out.print("Thirty");
                break;
            case '4':
                System.out.print("Forty");
                break;
            case '5':
                System.out.print("Fifty");
                break;
            case '6':
                System.out.print("Sixty");
                break;
            case '7':
                System.out.print("Seventy");
                break;
            case '8':
                System.out.print("Eighty");
                break;
            case '9':
                System.out.print("Ninety");
                break;
        }
    }

    public static void tram(int c) {
        switch (c) {
            case '1':
                System.out.print("One Hundred");
                break;
            case '2':
                System.out.print("Two Hundred");
                break;
            case '3':
                System.out.print("Three Hundred");
                break;
            case '4':
                System.out.print("Four Hundred");
                break;
            case '5':
                System.out.print("Five Hundred");
                break;
            case '6':
                System.out.print("Six Hundred");
                break;
            case '7':
                System.out.print("Seven Hundred");
                break;
            case '8':
                System.out.print("Eight Hundred");
                break;
            case '9':
                System.out.print("Nine Hundred");
                break;
        }
    }
}

