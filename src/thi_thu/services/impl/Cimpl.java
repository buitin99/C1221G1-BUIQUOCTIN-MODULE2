package thi_thu.services.impl;

import thi_thu.models.C;
import thi_thu.services.IC;
import thi_thu.utils.ReadAndWriteCSV;

import java.util.List;
import java.util.Scanner;

public class Cimpl implements IC {

    private static Scanner scanner = new Scanner(System.in);
    private static List<C> ccList = ReadAndWriteCSV.readCListFromCSV();
    private static final String REGEX="^(\\p{L}|\\d|-)+( (\\p{L}|\\d|-)+)*$";
    private static final String REGEX_DATE="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String REGEX_DOUBLE= "^(\\d*\\.*\\d+)+$";
    private static final String REGEX_INT="^\\d+$";

    @Override
    public void them() {
        System.out.println("a");
        String ac = scanner.nextLine();
        System.out.println("b");
        double bc = Double.parseDouble(scanner.nextLine());
        ccList.add(new C(id(),ac,bc));
        ReadAndWriteCSV.writeC(ccList,false);
    }

    @Override
    public void xoa() {

    }

    @Override
    public void hienThi() {
        for (C c: ccList) {
            System.out.println(c);
        }
    }

    @Override
    public void timKiem() {

    }

    public int id(){
        int i = 1;
        int index = ccList.size()-1;
        if (!ccList.isEmpty()){
            i = ccList.get(index).getStt()+1;
        }
        return i;
    }
}
