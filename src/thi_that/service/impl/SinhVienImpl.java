package thi_that.service.impl;
import thi_that.models.SinhVien;
import thi_that.service.ISinhVien;
import thi_that.utils.NotFoundStudentException;
import thi_that.utils.ReadAndWriteCSV;
import thi_that.utils.Regex;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienImpl implements ISinhVien {

    private static Scanner scanner = new Scanner(System.in);
    private static List<SinhVien> sinhVienList = ReadAndWriteCSV.readsinhVienListFromCSV();
    private static final String REGEX="^(\\p{L}|\\d|-)+( (\\p{L}|\\d|-)+)*$";
    private static final String REGEX_DATE="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";


    @Override
    public void timKiem() {
        xem();
        boolean kiemTra = true;
        List<SinhVien> tkiem = new ArrayList<>();
        System.out.println("Nhập tên sinh viên cần tiềm kiếm!");
        String tim = scanner.nextLine();
        for (SinhVien s: sinhVienList){
            if(s.getTen().contains(tim)){
                tkiem.add(s);
            }
        }

        for (int i = 0; i < tkiem.size() ; i++) {
            if (tkiem != null){
                System.out.println(tkiem.get(i));
                kiemTra = false;
            }
        }

        if (kiemTra){
            System.out.println("Không tìm thấy sinh viên!");
        }

    }

    @Override
    public void them() {
        String ten = nhapTen();
        String ngaySinh = nhapNgaySinh();
        System.out.println("Nhập giới tính!");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập số điện thoại!");
        String soDienThoai = scanner.nextLine();
        System.out.println("Nhập mã lớp học!");
        String maLopHoc = scanner.nextLine();
        sinhVienList.add(new SinhVien(id(),ten,ngaySinh,gioiTinh,soDienThoai,maLopHoc));
        ReadAndWriteCSV.writeSinhVien(sinhVienList,false);
    }

    @Override
    public void xoa() throws NotFoundStudentException {
        int dem = 0;
        xem();
        String luaChon;
        System.out.println("Nhập mã sinh viên cần xóa");
        int ma = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <sinhVienList.size() ; i++) {
            if (sinhVienList.get(i).getMaSinhVien()==ma){
                System.out.println("1. Nhấn y để xóa!");
                System.out.println("1. Nhấn N để trở lại!");
                luaChon = scanner.nextLine();
                if ("y".equals(luaChon) || "Y".equals(luaChon)){
                    sinhVienList.remove(i);
                    dem++;
                }else if ("N".equals(luaChon) || "N".equals(luaChon))
                {
                    break;
                }
            }
        }
        ReadAndWriteCSV.writeSinhVien(sinhVienList,false);

        if (dem == 0){
            throw new NotFoundStudentException("Không tìm thấy sinh viên!");
        }
    }

    @Override
    public void xem() {
        for (SinhVien s: sinhVienList) {
            System.out.println(s);
        }
    }

    public int id(){
        int i = 1;
        int index = sinhVienList.size()-1;
        if (!sinhVienList.isEmpty()){
            i = sinhVienList.get(index).getMaSinhVien()+1;
        }
        return i;
    }

    private String nhapNgaySinh() {
        System.out.println("Nhập ngày sinh!");
        return Regex.regexStr(scanner.nextLine(), REGEX_DATE, "SAI ĐỊNH DẠNG NGÀY");
    }
    private String nhapTen() {
        System.out.println("Nhập tên sinh viên!");
        return Regex.regexStr(scanner.nextLine(), REGEX, "SAI ĐỊNH DẠNG TÊN");
    }
}
