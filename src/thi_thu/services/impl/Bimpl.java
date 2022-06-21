package thi_thu.services.impl;

import thi_thu.models.B;
import thi_thu.services.IB;
import thi_thu.utils.ReadAndWriteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bimpl implements IB {

    private static Scanner scanner = new Scanner(System.in);
    private static List<B> bbList = ReadAndWriteCSV.readBListFromCSV();
    private static final String REGEX="^(\\p{L}|\\d|-)+( (\\p{L}|\\d|-)+)*$";
    private static final String REGEX_DATE="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String REGEX_DOUBLE= "^(\\d*\\.*\\d+)+$";
    private static final String REGEX_INT="^\\d+$";


    @Override
    public void them() {
        System.out.println("1");
        String ten = scanner.nextLine();
        System.out.println("2");
        String lop = scanner.nextLine();
        bbList.add(new B (id(),ten,lop));
        ReadAndWriteCSV.writeB(bbList,false);
    }

    @Override
    public void xoa() {
        hienThi();
        boolean flag = true;
        String xoal = scanner.nextLine();
        for (int i = 0; i < bbList.size(); i++) {
            String choice;
            if (bbList.get(i).getLop().equals(xoal)){
                System.out.println("nhắn y để xóa!");
                System.out.println("nhắn phím bắt kỳ để không xóa!");
                choice = scanner.nextLine();
                if ("y".equals(choice) || "Y".equals(choice)){
                    bbList.remove(i);
                }else
                {
                    break;
                }
            }else
            {
                flag = false;
            }
        }

        if(!flag){
            System.out.println("no");
        }
        ReadAndWriteCSV.writeB(bbList,false);
    }


    @Override
    public void hienThi() {
        for (B b: bbList) {
            System.out.println(b);
        }
    }

    @Override
    public void timKiem() {
        hienThi();
        boolean kiemTra = true;
        List<B> tk = new ArrayList<>();
        String tim = scanner.nextLine();
        for (B b: bbList) {
            if (b.getLop().contains(tim)){
                tk.add(b);
            }
        }

        for (int i = 0; i < tk.size() ; i++) {
            if (tk != null){
                System.out.println(tk.get(i));
                kiemTra = false;
            }
        }

        if(kiemTra){
            System.out.println("no");
        }
    }

    public int id(){
        int i = 1;
        int index = bbList.size()-1;
        if (!bbList.isEmpty()){
            i = bbList.get(index).getStt()+1;
        }
        return i;
    }
}
