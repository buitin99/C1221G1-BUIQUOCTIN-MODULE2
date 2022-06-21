package tu_on_tap.on_tap.services.impl;

import case_study.models.Customer;
import case_study.utils.RegexData;
import sun.security.krb5.SCDynamicStoreConfig;
import tu_on_tap.on_tap.models.BenhNhan;
import tu_on_tap.on_tap.models.BenhNhanThuong;
import tu_on_tap.on_tap.services.IBenhNhanThuong;
import tu_on_tap.on_tap.utils.NotFoundMedicalRecordException;
import tu_on_tap.on_tap.utils.ReadAndWriteCSV;
import tu_on_tap.on_tap.utils.Regex;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BenhNhanThuongServiceImpl implements IBenhNhanThuong {

    private static Scanner scanner = new Scanner(System.in);
    private static List<BenhNhan> benhNhanThuongList = ReadAndWriteCSV.readBenhNhanThuongListFromCSV();
    private static final String REGEX="^(\\p{L}|\\d|-)+( (\\p{L}|\\d|-)+)*$";
    private static final String REGEX_DATE="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String REGEX_DOUBLE= "^(\\d*\\.*\\d+)+$";
    private static final String REGEX_INT="^\\d+$";

    /*
     private static List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();
    * static{
    BenhNhanThuong = ReadAndWriteCSV.readBenhNhanThuongListFromCSV();
    * }*/
    @Override
    public void add() {
        String maBenhAn = inputBA();
        String maBenhNhan = inputBN();
//        System.out.println("Nhập ngày nhập viện!");
        String ngayNhapVien = checkDate("Ngày nhập viện");
//        System.out.println("Nhập ngày ra viện!");
        String ngayRaVien;
        boolean checkD = true;
        do{
            ngayRaVien = checkDate("ngày ra viện!");
            long soSanh = Date.parse(ngayNhapVien) - Date.parse(ngayRaVien);
            if(soSanh > 0){
                checkD = true;
            }else
            {
                checkD = false;
            }
        }while (checkD);
        System.out.println("Nhập lý do nhập viện!");
        String lyDo = scanner.nextLine();
        System.out.println("Nhập viện phí!");
        double vienPhi = Double.parseDouble(scanner.nextLine());
        List<BenhNhan> listWriteFile = new ArrayList<>();

        benhNhanThuongList.add(new BenhNhanThuong(id(),maBenhAn,maBenhNhan,ngayNhapVien,ngayRaVien,lyDo,vienPhi));
        listWriteFile.add(new BenhNhanThuong(id(),maBenhAn,maBenhNhan,ngayNhapVien,ngayRaVien,lyDo,vienPhi));
        ReadAndWriteCSV.writeBenhNhanThuong(listWriteFile, true);
        System.out.println("Thêm thành công!");
    }

    @Override
    public void delete() throws NotFoundMedicalRecordException {
        int count = 0;
        display();
        System.out.println("Nhập mã bệnh án!");
        String maBA = scanner.nextLine();
        for (int i = 0; i < benhNhanThuongList.size(); i++) {
            if (benhNhanThuongList.get(i) instanceof BenhNhanThuong) {
                if (benhNhanThuongList.get(i).getMaBenhAn().equals(maBA)) {
                    String check;
                    System.out.println("Y. chọn Y để xóa bệnh án!");
                    System.out.println("N. chọn n để thoát!");
                    check = scanner.nextLine();
                    if ("y".equals(check) || "Y".equals(check)){
                        benhNhanThuongList.remove(i);
                        display();
                        count++;
                    }else
                    {
                      break;
                    }
                }
            }
        }

        if (count == 0){
            throw new NotFoundMedicalRecordException("Không tìm thấy bệnh nhân!");
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < benhNhanThuongList.size(); i++) {
            System.out.println(benhNhanThuongList.get(i).toString());

//            if (benhNhanThuongList.get(i) instanceof BenhNhanThuong) {
//                System.out.println(benhNhanThuongList.get(i).toString());
//            }
        }
    }
    @Override
    public int id(){
        int i = 1;
        int index = benhNhanThuongList.size()-1;
        if (!benhNhanThuongList.isEmpty()){
            i = benhNhanThuongList.get(index).getSoThuTuBenhAn()+1;
        }
        return i;
    }
    public static final String REG_BA = "^BA-\\d{4}$";
    private String inputBA() {
        System.out.println("Nhập mã bệnh án!");
        return Regex.regexStr(scanner.nextLine(), REG_BA, "SAI ĐỊNH DẠNG : BA-NNNN. EX BA-1234!");
    }

    public static final String REG_BN = "^BN-\\d{4}$";
    private String inputBN() {
        System.out.println("Nhập mã bệnh nhân!");
        return Regex.regexStr(scanner.nextLine(), REG_BN, "SAI ĐỊNH DẠNG : BN-NNNN. EX BN-1234!");
    }

    private String checkDate(String string){
        String result;
        System.out.println("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX_DATE,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return  result;
    }
    /*
    *  private String checkInput(String string){
        String result;
        System.out.print("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return result;
    }
    private String checkDate(String string){
        String result;
        System.out.println("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX_DATE,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return  result;
    }
    private Double checkDouble(String string){
        String result;
        System.out.println("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX_DOUBLE,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return  Double.parseDouble(result);
    }
    private Integer  checkInt(String string){
        String result;
        System.out.println("Nhập "+string);
        do {
            result = scanner.nextLine();
            if (Pattern.matches(REGEX_INT,result)){
                break;
            }else {
                System.out.print(string+" invalid, please try again: ");
            }
        }while (true);
        return  Integer.parseInt(result);
    }*/
}
