package s11_stack_queue.bai_tap.dao_nguoc_phan_tu_mang;
import java.util.Scanner;
import java.util.Stack;

public class TestDaoNguoc {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i < arr.length; i++){
            stack.push(arr[i]);
        }

        for (int i = 0 ; i < arr.length; i++){
            arr[i] = stack.pop();
        }

        for (int a :arr) {
            System.out.print(a + ",");
        }
    }

}
