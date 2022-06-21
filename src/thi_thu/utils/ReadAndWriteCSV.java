package thi_thu.utils;

import thi_thu.models.B;
import thi_thu.models.C;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {

    private static final String B_FILE="src\\thi_thu\\data\\bfile.csv";
    private static final String C_FILE="src\\thi_thu\\data\\cfile.csv";

    // phương tổng quát để ghi 1 list kiểu string vào trong file csv.Phương thức dùng chung
    private static void writeListStringToCSV(String filePath,List<String> stringList, boolean append){
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

    public static void writeB(List<B> bList, boolean append){
        List<String> bListWrite = new ArrayList<>();
        for (B b: bList) {
            bListWrite.add(b.toCSV());
        }
        writeListStringToCSV(B_FILE,bListWrite,append);
    }

    public static List<B> readBListFromCSV(){
        List<B> bList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(B_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            B b = new B(Integer.parseInt(arr[0]),arr[1],arr[2]);
            bList.add(b);
        }
        return bList;
    }

    public static void writeC(List<C> cList, boolean append){
        List<String> cListWrite = new ArrayList<>();
        for (C c: cList) {
            cListWrite.add(c.toCSV());
        }
        writeListStringToCSV(C_FILE,cListWrite,append);
    }

    public static List<C> readCListFromCSV(){
        List<C> cList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(C_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            C c = new C(Integer.parseInt(arr[0]),arr[1],Double.parseDouble(arr[2]));
            cList.add(c);
        }
        return cList;
    }
}
