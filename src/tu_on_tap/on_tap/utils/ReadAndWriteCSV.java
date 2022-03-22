package tu_on_tap.on_tap.utils;

import case_study.models.Customer;
import tu_on_tap.on_tap.models.BenhNhan;
import tu_on_tap.on_tap.models.BenhNhanThuong;
import tu_on_tap.on_tap.models.BenhNhanVip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {

    public static final String BENH_NHAN_FILE ="src\\tu_on_tap\\on_tap\\data\\medical_records.csv";
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


    public static void writeBenhNhanThuong(List<BenhNhanThuong> benhNhanThuongList, boolean append){
        List<String> benhNhanThuongs = new ArrayList<>();
        for (BenhNhanThuong b: benhNhanThuongList){
            benhNhanThuongs.add(b.benhNhanThuonggetInFo());
        }
        writeListStringToCSV(BENH_NHAN_FILE,benhNhanThuongs,append);
    }

        public static List<BenhNhanThuong> readBenhNhanThuongListFromCSV(){
        List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(BENH_NHAN_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            BenhNhanThuong benhNhanThuong = new BenhNhanThuong(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
            benhNhanThuongList.add(benhNhanThuong);
        }
        return benhNhanThuongList;
    }

    public static void writeBenhNhanVip(List<BenhNhanVip> benhNhanVipList, boolean append){
        List<String> benhNhanVips = new ArrayList<>();
        for (BenhNhanVip v: benhNhanVipList){
            benhNhanVips.add(v.benhNhanVipGetInFo());
        }
        writeListStringToCSV(BENH_NHAN_FILE,benhNhanVips,append);
    }

    public static List<BenhNhanVip> readBenhNhanVipListFromCSV(){
        List<BenhNhanVip> benhNhanVipList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(BENH_NHAN_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            BenhNhanVip benhNhanVip = new BenhNhanVip(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
            benhNhanVipList.add(benhNhanVip);
        }
        return benhNhanVipList;
    }


}
