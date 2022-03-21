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
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    static List<House> readAndWriteHouseToCSV = ReadAndWriteCSV.readHouseListFromCSV();
    static List<Room> readAndWriteRoomToCSV = ReadAndWriteCSV.readRoomListFromCSV();
    static List<Villa> readAndWriteVillaToCSV = ReadAndWriteCSV.readVillaListFromCSV();

    public static final String REG_VL = "^SVVL-\\d{4}$";
    public static final String REG_RO = "^SVRO-\\d{4}$";
    public static final String REG_HO = "^SVHO-\\d{4}$";
    public static final String SERVICE_NAME = "^[A-Z][a-z]{2,}$";


    @Override
    public void add() {
        System.out.println("MENU ADD NEW SERVICE!");
        System.out.println("1. ADD NEW VILLA!");
        System.out.println("2. ADD NEW HOUSE!");
        System.out.println("3. ADD NEW ROOM!");
        System.out.println("4. RETURN TO MAIN MENU!");
        int choose = 0;
        try {
            choose = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
            add();
        }
        switch (choose) {
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
        for (Villa v : readAndWriteVillaToCSV) {
            facilityIntegerMap.put(v, 0);
        }

        for (House h : readAndWriteHouseToCSV) {
            facilityIntegerMap.put(h, 0);
        }

        for (Room r : readAndWriteRoomToCSV) {
            facilityIntegerMap.put(r, 0);
        }

        for (Map.Entry<Facility, Integer> e : facilityIntegerMap.entrySet()) {
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
        String vSN = inputServiceName();
        String vAU;
        boolean flag = true;
        do {
            System.out.println("Enter area used!");
            vAU = scanner.nextLine();
            double checkV = 0;
            try {
                checkV = Double.parseDouble(vAU);
            }catch (NumberFormatException e){
                System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
            }
            if (checkV > 30) {
                flag = false;
            }
        } while (flag);
        System.out.println("Enter rental Fee!");
        String vRF = scanner.nextLine();
        String vMax;
        boolean flag2 = true;
        do {
            System.out.println("Enter max number of people!");
            vMax = scanner.nextLine();
            int checkM = 0;
            try {
                checkM = Integer.parseInt(vMax);
            }catch (NumberFormatException e){
                System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
            }
            if (checkM > 0 && checkM < 20) {
                flag2 = false;
            }
        } while (flag2);
        System.out.println("Enter type of rental!");
        String vTOR = scanner.nextLine();
        System.out.println("Enter room standard!");
        String vRS = scanner.nextLine();
        String vPA;
        boolean flag1 = true;
        do {
            System.out.println("Enter pool area!");
            vPA = scanner.nextLine();
            double checkPA = 0.0d;
            try {
                checkPA = Double.parseDouble(vPA);
            }catch (NumberFormatException e){
                System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
            }
            if (checkPA > 30) {
                flag1 = false;
            }
        } while (flag1);
        String vNOF;
        boolean flag3 = true;
        do {
            System.out.println("Enter number of floors!");
            vNOF = scanner.nextLine();
            double checkF = 0.0d;
            try {
                checkF = Double.parseDouble(vNOF);
            }catch (NumberFormatException e){
                System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
            }
            if (checkF > 0) {
                flag3 = false;
            }
        } while (flag3);
        Villa villa = new Villa(vSC, vSN, vAU, vRF, vMax, vTOR, vRS, vPA, vNOF);
        facilityIntegerMap.put(villa, 0);
        readAndWriteVillaToCSV.add(villa);
        ReadAndWriteCSV.writeVilla(readAndWriteVillaToCSV, true);
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter service code!");
        String hSC = inputHouse();
        System.out.println("Enter service name!");
        String hSN = inputServiceName();
        String hAU;
        boolean flag = true;
        do {
            System.out.println("Enter area used!");
            hAU = scanner.nextLine();
            double checkV = 0;
            try {
                checkV = Double.parseDouble(hAU);
            }catch (NumberFormatException e){
                System.out.println("WRONG NUMBER. PLEASE ENTER RIGHT NUMBMER!");
            }
            if (checkV > 30) {
                flag = false;
            }
        } while (flag);
        System.out.println("Enter rental Fee!");
        String hRF = scanner.nextLine();
        String hMax;
        boolean flag2 = true;
        do {
            System.out.println("Enter max number of people!");
            hMax = scanner.nextLine();
            double checkM = Double.parseDouble(hMax);
            if (checkM > 0 && checkM < 20) {
                flag2 = false;
            }
        } while (flag2);
        System.out.println("Enter type of rental!");
        String hTOR = scanner.nextLine();
        System.out.println("Enter room standard!");
        String hRS = scanner.nextLine();
        String hNOF;
        boolean flag3 = true;
        do {
            System.out.println("Enter number of floors!");
            hNOF = scanner.nextLine();
            double checkF = Double.parseDouble(hNOF);
            if (checkF > 0) {
                flag3 = false;
            }
        } while (flag3);
        House house = new House(hSC, hSN, hAU, hRF, hMax, hTOR, hRS, hNOF);
        facilityIntegerMap.put(house, 0);
        readAndWriteHouseToCSV.add(house);
        ReadAndWriteCSV.writeHouse(readAndWriteHouseToCSV, true);
    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter service code!");
        String rSC = inputRoom();
        System.out.println("Enter service name!");
        String rSN = inputServiceName();
        String rAU;
        boolean flag = true;
        do {
            System.out.println("Enter area used!");
            rAU = scanner.nextLine();
            double checkAU = Double.parseDouble(rAU);
            if (checkAU > 30) {
                flag = false;
            }
        } while (flag);
        System.out.println("Enter rental Fee!");
        String rRF = scanner.nextLine();
        String rMax;
        boolean flag2 = true;
        do {
            System.out.println("Enter max number of people!");
            rMax = scanner.nextLine();
            double checkM = Double.parseDouble(rMax);
            if (checkM > 0 && checkM < 20) {
                flag2 = false;
            }
        } while (flag2);
        System.out.println("Enter type of rental!");
        String rTOR = scanner.nextLine();
        System.out.println("Enter free service");
        String rFS = scanner.nextLine();
        Room room = new Room(rSC, rSN, rAU, rRF, rMax, rTOR, rFS);
        facilityIntegerMap.put(room, 0);
        readAndWriteRoomToCSV.add(room);
        ReadAndWriteCSV.writeRoom(readAndWriteRoomToCSV, true);
    }

    private String inputVilla() {
        System.out.println("ENTER VILLA SERVICE");
        return RegexData.regexStr(scanner.nextLine(), REG_VL, "WRONG SERVICE VILLA : SVVL-NNNN. EX SVVL-1234!");
    }

    private String inputRoom() {
        System.out.println("ENTER ROOM SERVICE ");
        return RegexData.regexStr(scanner.nextLine(), REG_RO, "WRONG SERVICE ROOM : SVRO-NNNN. EX SVRO-1234!");
    }

    private String inputHouse() {
        System.out.println("ENTER HOUSE SERVICE ");
        return RegexData.regexStr(scanner.nextLine(), REG_HO, "WRONG SERVICE ROOM : SVHO-NNNN. EX SVHO-1234!");
    }

    private String inputServiceName() {
        System.out.println("ENTER SERVICE NAME");
        return RegexData.regexStr(scanner.nextLine(), SERVICE_NAME, "WRONG NAME SERVICE : EX Villa!");
    }
}
