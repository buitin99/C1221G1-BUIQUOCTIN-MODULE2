package case_study.services.impl;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.IFacilityService;
import case_study.utils.ReadAndWriteCSV;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
    final String FILE_VILLA = "src\\case_study\\data\\villa.csv";
    final String FILE_HOUSE = "src\\case_study\\data\\house.csv";
    final String FILE_ROOM = "src\\case_study\\data\\room.csv";
    String lineV;
    String lineH;
    String lineR;

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
        String vSC = scanner.nextLine();
        System.out.println("Enter service name!");
        String vSN = scanner.nextLine();
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
        lineV = vSC+","+vSN+","+vAU+","+vRF+","+vMax+","+vTOR+","+vRS+","+vPA+","+vNOF;
        readAndWriteCSV.writeFile(FILE_VILLA,lineV);
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
        lineH = hSC+","+hSN+","+hAU+","+hRF+","+hMax+","+hTOR+","+hRS+","+hNOF;
        readAndWriteCSV.writeFile(FILE_HOUSE,lineH);
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
        lineR = rSC+","+rSN+","+rAU+","+rRF+","+rMax+","+rTOR+","+rFS;
        readAndWriteCSV.writeFile(FILE_ROOM,lineR);
    }
}
