package tu_on_tap.on_tap.services.impl;

import case_study.models.Customer;
import case_study.utils.RegexData;
import sun.security.krb5.SCDynamicStoreConfig;
import tu_on_tap.on_tap.models.BenhNhanThuong;
import tu_on_tap.on_tap.services.IBenhNhanThuong;
import tu_on_tap.on_tap.utils.ReadAndWriteCSV;
import tu_on_tap.on_tap.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhNhanThuongServiceImpl implements IBenhNhanThuong {

    private static Scanner scanner = new Scanner(System.in);
    private static List<BenhNhanThuong> benhNhanThuongList = ReadAndWriteCSV.readBenhNhanThuongListFromCSV();


    @Override
    public void add() {
        String maBenhAn = inputBA();
        String maBenhNhan = inputBN();
        System.out.println("Nhập tên bệnh viện!");
        String tenBenhVien = scanner.nextLine();
        System.out.println("Nhập ngày nhập viện!");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Nhập ngày ra viện!");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Nhập lý do nhập viện!");
        String lyDo = scanner.nextLine();
        benhNhanThuongList.add(new BenhNhanThuong(id(),maBenhAn, maBenhNhan, tenBenhVien, ngayNhapVien, ngayRaVien, lyDo));
        ReadAndWriteCSV.writeBenhNhanThuong(benhNhanThuongList, false);
        System.out.println("Thêm thành công!");
    }

    @Override
    public void delete() {
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
                    }else
                    {
                      break;
                    }
                }
            }
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < benhNhanThuongList.size(); i++) {
            if (benhNhanThuongList.get(i) instanceof BenhNhanThuong) {
                System.out.println(benhNhanThuongList.get(i).toString());
            }
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
}
