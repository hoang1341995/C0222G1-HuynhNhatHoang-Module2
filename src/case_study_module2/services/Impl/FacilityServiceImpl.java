package case_study_module2.services.Impl;


import case_study_module2.models.facility.Facility;
import case_study_module2.services.FacilityService;
import case_study_module2.utils.ReadAndWrite;

import java.util.LinkedHashMap;

import static case_study_module2.controllers.FuramaController.scanner;


public class FacilityServiceImpl implements FacilityService {

    LinkedHashMap<Facility, Integer> villaList = ReadAndWrite.readFileFacility(ReadAndWrite.VILLA_FILE);
    LinkedHashMap<Facility, Integer> houseList = ReadAndWrite.readFileFacility(ReadAndWrite.HOUSE_FILE);
    LinkedHashMap<Facility, Integer> roomList = ReadAndWrite.readFileFacility(ReadAndWrite.ROOM_FILE);

    @Override
    public void displayFacility() {
        System.out.println("<<Villa List>>");
        for (Facility key : villaList.keySet()){
            System.out.println(key + "" + villaList.get(key));
        }
        System.out.println("<<House List>>");
        for (Facility key : houseList.keySet()){
            System.out.println(key + "" + houseList.get(key));
        }
        System.out.println("<<Room List>>");
        for (Facility key : roomList.keySet()){
            System.out.println(key + "" + roomList.get(key));
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addFacility() {
        System.out.println("<<Menu Service>>");
        System.out.println("1. Villa\n" +
                "2. House\n" +
                "3. Room");
        int choose = 0;
        while (true){
            try {
                System.out.print("Choose service: ");
                choose = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        switch (choose){
            case 1:

                break;
        }
    }
}
