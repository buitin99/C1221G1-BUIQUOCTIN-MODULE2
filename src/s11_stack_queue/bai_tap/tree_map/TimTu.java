package s11_stack_queue.bai_tap.tree_map;

import java.util.*;

public class TimTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra!");
        String nhap = scanner.nextLine();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        nhap = nhap.toLowerCase();
        char character;
        for (int i = 0; i < nhap.length();i++){
            character = nhap.charAt(i);
            if(treeMap.containsKey(character)){
                treeMap.replace(character, treeMap.get(character) + 1);
            }else
            {
                treeMap.put(character, 1);
            }
        }
        Iterator<Character> itr = treeMap.keySet().iterator();
        while (itr.hasNext()){
            char key = itr.next();
            System.out.println(key + " : " + treeMap.get(key));
        }
    }
}
