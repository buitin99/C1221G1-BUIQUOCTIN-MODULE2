package thi_that.service.impl;

import netscape.security.UserTarget;
import thi_that.models.GiaoVien;
import thi_that.models.SinhVien;
import thi_that.service.IGiaoVien;
import thi_that.utils.ReadAndWriteCSV;

import java.util.List;
import java.util.Scanner;

public class GiaoVienImpl implements IGiaoVien {

    private static Scanner scanner = new Scanner(System.in);
    private static List<GiaoVien> giaoViens  = ReadAndWriteCSV.readgiaoVienListFromCSV();

    @Override
    public void xemGiaoVien() {
        for (GiaoVien g: giaoViens) {
            System.out.println(g);
        }
    }


}
