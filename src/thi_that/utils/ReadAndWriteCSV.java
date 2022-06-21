package thi_that.utils;
import thi_that.models.GiaoVien;
import thi_that.models.SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {

    private static final String SINH_VIEN="src\\thi_that\\data\\students.csv";
    private static final String GIAO_VIEN="src\\thi_that\\data\\teachers.csv";
    private static final String BATCHS="src\\thi_that\\data\\batchs.csv";


    // phương tổng quát để ghi 1 list kiểu string vào trong file csv.Phương thức dùng chung
    private static void writeListStringToCSV(String filePath, List<String> stringList, boolean append){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string: stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // phương thức đọc ra một danh sách  dạng string từ csv. Phương thức dùng chung
    private static List<String > readListStringFromCSV(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void writeSinhVien(List<SinhVien> sinhVienList, boolean append){
        List<String> sinhVienListWrite = new ArrayList<>();
        for (SinhVien s: sinhVienList) {
            sinhVienListWrite.add(s.toCSV());
        }
        writeListStringToCSV(SINH_VIEN,sinhVienListWrite,append);
    }

    public static List<SinhVien> readsinhVienListFromCSV(){
        List<SinhVien> sinhVienList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(SINH_VIEN);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            SinhVien sinhVien = new SinhVien(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5]);
            sinhVienList.add(sinhVien);
        }
        return sinhVienList;
    }


    public static void writeGiaoVien(List<GiaoVien> giaoVienList, boolean append){
        List<String> giaoVienListWrite = new ArrayList<>();
        for (GiaoVien g : giaoVienList) {
            giaoVienListWrite.add(g.toCSV());
        }
        writeListStringToCSV(GIAO_VIEN,giaoVienListWrite,append);
    }

    public static List<GiaoVien> readgiaoVienListFromCSV(){
        List<GiaoVien> giaoViensList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(GIAO_VIEN);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            GiaoVien giaoVien = new GiaoVien(arr[0],arr[1],arr[2],arr[3],arr[4]);
            giaoViensList.add(giaoVien);
        }
        return giaoViensList;
    }
}
