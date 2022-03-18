package case_study.utils;

import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {
    private static final String CUSTOMER_FILE="src\\case_study\\data\\customer.csv";
    private static final String EMPLOYEE_FILE="src\\case_study\\data\\emplloyee.csv";
    private static final String HOUSE_FILE="src\\case_study\\data\\house.csv";
    private static final String VILLA_FILE="src\\case_study\\data\\villa.csv";
    private static final String ROOM_FILE="src\\case_study\\data\\room.csv";
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

    public static void writeCustomer(List<Customer> customerList, boolean append){
        List<String> customerListWrite = new ArrayList<>();
        for (Customer c: customerList) {
            customerListWrite.add(c.getInFor());
        }
        writeListStringToCSV(CUSTOMER_FILE,customerListWrite,append);
    }

    public static List<Customer> readCustomerListFromCSV(){
        List<Customer> customerList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(CUSTOMER_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    public static void writeEmployee(List<Employee> employeeList, boolean append){
        List<String> employeeListWrite = new ArrayList<>();
        for (Employee e: employeeList) {
            employeeListWrite.add(e.getInFor());
        }
        writeListStringToCSV(EMPLOYEE_FILE,employeeListWrite,append);
    }

    public static List<Employee> readEmployeeListFromCSV(){
        List<Employee> employeeList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(EMPLOYEE_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            Employee employee = new Employee(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],arr[9]);
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static void writeHouse(List<House> houseList, boolean append){
        List<String> houseListWrite = new ArrayList<>();
        for (House h: houseList) {
            houseListWrite.add(h.getInFor());
        }
        writeListStringToCSV(HOUSE_FILE,houseListWrite,append);
    }

    public static List<House> readHouseListFromCSV(){
        List<House> houseList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(HOUSE_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            House house = new House(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]);
            houseList.add(house);
        }
        return houseList;
    }

    public static void writeRoom(List<Room> roomList, boolean append){
        List<String> roomListWrite = new ArrayList<>();
        for (Room r: roomList) {
            roomListWrite.add(r.getInFor());
        }
        writeListStringToCSV(ROOM_FILE,roomListWrite,append);
    }

    public static List<Room> readRoomListFromCSV(){
        List<Room> roomList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(ROOM_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            Room room = new Room(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
            roomList.add(room);
        }
        return roomList;
    }

    public static void writeVilla(List<Villa> villasList, boolean append){
        List<String> villaListWrite = new ArrayList<>();
        for (Villa v: villasList) {
            villaListWrite.add(v.getInFor());
        }
        writeListStringToCSV(VILLA_FILE,villaListWrite,append);
    }

    public static List<Villa> readVillaListFromCSV(){
        List<Villa> villaList = new ArrayList<>();
        // sử dụng phương thức dùng chung trả về một list dạng String
        List<String> stringList = readListStringFromCSV(VILLA_FILE);
        String[] arr =null;
        // Chuyển đổi list String về list Customer
        for (String string: stringList) {
            arr= string.split(",");
            Villa villa = new Villa (arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
            villaList.add(villa);
        }
        return villaList;
    }
}
