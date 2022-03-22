package tu_on_tap.on_tap.services.impl;

import tu_on_tap.on_tap.models.BenhNhanThuong;
import tu_on_tap.on_tap.models.BenhNhanVip;
import tu_on_tap.on_tap.services.IBenhNhanVip;
import tu_on_tap.on_tap.utils.ReadAndWriteCSV;
import tu_on_tap.on_tap.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhNhanVipServiceImpl implements IBenhNhanVip {
    private static Scanner scanner = new Scanner(System.in);
    List<BenhNhanVip> benhNhanVipList = ReadAndWriteCSV.readBenhNhanVipListFromCSV();

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
        System.out.println("Nhập loại vip!");
        String loai = scanner.nextLine();
        benhNhanVipList.add(new BenhNhanVip(id(),maBenhAn, maBenhNhan, tenBenhVien, ngayNhapVien, ngayRaVien, loai));
        ReadAndWriteCSV.writeBenhNhanVip(benhNhanVipList, false);
    }

    @Override
    public void delete() {
        display();
        for (int i = 0; i < benhNhanVipList.size() ; i++) {
            if (benhNhanVipList.get(i) instanceof BenhNhanVip){
                String check;
                System.out.println("Y. chọn Y để xóa bệnh án!");
                System.out.println("N. chọn n để thoát!");
                check = scanner.nextLine();
                if ("y".equals(check) || "Y".equals(check)){
                    benhNhanVipList.remove(i);
                }else
                {
                    break;
                }
            }
        }
    }

    @Override
    public void display() {
        for (int i = 0; i < benhNhanVipList.size() ; i++) {
            if (benhNhanVipList.get(i) instanceof BenhNhanVip){
                System.out.println(benhNhanVipList.get(i).toString());
            }
        }
    }

    @Override
    public int id(){
        int i = 1;
        int index = benhNhanVipList.size()-1;
        if (!benhNhanVipList.isEmpty()){
            i = benhNhanVipList.get(index).getSoThuTuBenhAn()+1;
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
