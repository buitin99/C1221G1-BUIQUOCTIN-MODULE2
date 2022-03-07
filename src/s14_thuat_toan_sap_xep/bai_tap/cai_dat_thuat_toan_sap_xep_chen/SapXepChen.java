package s14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        insertionSort(new int[]{8, 5, 3, 2, 1});
    }
    public static void insertionSort(int[] list){
        int pos, x;
        for (int i = 0; i < list.length;i++){
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
        }
        System.out.println(Arrays.toString(list));
    }
}
