package case_study.services.impl;
import case_study.models.*;
import case_study.services.IFacilityService;
import case_study.utils.ReadAndWriteCSV;
import case_study.utils.RegexData;

import java.lang.ref.PhantomReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    static List<House> readAndWriteHouseToCSV = ReadAndWriteCSV.readHouseListFromCSV();
    static List<Room> readAndWriteRoomToCSV = ReadAndWriteCSV.readRoomListFromCSV();
    static List<Villa> readAndWriteVillaToCSV = ReadAndWriteCSV.readVillaListFromCSV();

    public static final String REG_VL = "^SVVL-\\d{4}$";
    public static final String REG_RO = "^SVRO-\\d{4}$";
    public static final String REG_HO = "^SVHO-\\d{4}$";


    @Override
    public void add() {
        System.out.println("MENU ADD NEW SERVICE!");
        System.out.println("1. ADD NEW VILLA!");
        System.out.println("2. ADD NEW HOUSE!");
        System.out.println("3. ADD NEW ROOM!");
        System.out.println("4. RETURN TO MAIN MENU!");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
        }
    }

    @Override
    public void display() {
        for (Villa v: readAndWriteVillaToCSV) {
            facilityIntegerMap.put(v,0);
        }

        for (House h: readAndWriteHouseToCSV) {
            facilityIntegerMap.put(h,0);
        }

        for (Room r: readAndWriteRoomToCSV) {
            facilityIntegerMap.put(r,0);
        }

        for (Map.Entry<Facility,Integer> e : facilityIntegerMap.entrySet()) {
            System.out.println("Service:" + e.getKey() + "Used:" + e.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }


    @Override
    public void addNewVilla() {
        System.out.println("Enter service code!");
        String vSC = inputVilla();
        System.out.println("Enter service name!");
        String vSN = inputVilla();
        System.out.println("Enter area used!");
        String vAU = scanner.nextLine();
        System.out.println("Enter rental Fee!");
        String vRF = scanner.nextLine();
        System.out.println("Enter max number of people!");
        String vMax = scanner.nextLine();
        System.out.println("Enter type of rental!");
        String vTOR = scanner.nextLine();
        System.out.println("Enter room standard!");
        String vRS = scanner.nextLine();
        System.out.println("Enter pool area!");
        String vPA = scanner.nextLine();
        System.out.println("Enter number of floors!");
        String vNOF = scanner.nextLine();
        Villa villa = new Villa(vSC,vSN,vAU,vRF,vMax,vTOR,vRS,vPA,vNOF);
        facilityIntegerMap.put(villa,0);
        readAndWriteVillaToCSV.add(villa);
        ReadAndWriteCSV.writeVilla(readAndWriteVillaToCSV,true);

    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter service code!");
        String hSC = scanner.nextLine();
        System.out.println("Enter service name!");
        String hSN = scanner.nextLine();
        System.out.println("Enter area used!");
        String hAU = scanner.nextLine();
        System.out.println("Enter rental Fee!");
        String hRF = scanner.nextLine();
        System.out.println("Enter max number of people!");
        String hMax = scanner.nextLine();
        System.out.println("Enter type of rental!");
        String hTOR = scanner.nextLine();
        System.out.println("Enter room standard!");
        String hRS = scanner.nextLine();
        System.out.println("Enter number of floors!");
        String hNOF = scanner.nextLine();
        House house = new House(hSC,hSN,hAU,hRF,hMax,hTOR,hRS,hNOF);
        facilityIntegerMap.put(house,0);
        readAndWriteHouseToCSV.add(house);
        ReadAndWriteCSV.writeHouse(readAndWriteHouseToCSV,true);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter service code!");
        String rSC = scanner.nextLine();
        System.out.println("Enter service name!");
        String rSN = scanner.nextLine();
        System.out.println("Enter area used!");
        String rAU = scanner.nextLine();
        System.out.println("Enter rental Fee!");
        String rRF = scanner.nextLine();
        System.out.println("Enter max number of people!");
        String rMax = scanner.nextLine();
        System.out.println("Enter type of rental!");
        String rTOR = scanner.nextLine();
        System.out.println("Enter free service");
        String rFS = scanner.nextLine();
        Room room = new Room(rSC,rSN,rAU,rRF,rMax,rTOR,rFS);
        facilityIntegerMap.put(room,0);
        readAndWriteRoomToCSV.add(room);
        ReadAndWriteCSV.writeRoom(readAndWriteRoomToCSV,true);
    }

    private String inputVilla(){
        System.out.println("ENTER VILLA SERVICE");
        return RegexData.regexStr(scanner.nextLine(),REG_VL,"WRONG SERVICE VILLA : SVVL-NNNN. EX SVVL-1234!");
    }

    private String inputRoom(){
        System.out.println("ENTER ROOM SERVICE ");
        return RegexData.regexStr(scanner.nextLine(),REG_VL,"WRONG SERVICE ROOM : SVRO-NNNN. EX SVRO-1234!");
    }

    private String inputHouse(){
        System.out.println("ENTER HOUSE SERVICE ");
        return RegexData.regexStr(scanner.nextLine(),REG_VL,"WRONG SERVICE ROOM : SVHO-NNNN. EX SVHO-1234!");
    }

    private String inputServiceName(){
        System.out.println("ENTER SERVICE NAME");
        return RegexData.regexStr(scanner.nextLine(),REG_VL,"WRONG NAME SERVICE : EX Villa!");
    }

//    private String serviceName(){
//        System.out.println("ENTER SERVICE NAME");
//        return RegexData.regexStr(scanner.nextLine(),)
//    }
}
