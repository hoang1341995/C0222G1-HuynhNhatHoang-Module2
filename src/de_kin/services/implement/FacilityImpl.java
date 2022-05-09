package de_kin.services.implement;

import de_kin.models.facility.House;
import de_kin.models.facility.Room;
import de_kin.models.facility.Villa;
import de_kin.services.FacilityService;
import de_kin.utils.ReadAndWrite;
import de_kin.utils.RegexInput;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static de_kin.controllers.DisplayMainMenu.scanner;
import static de_kin.utils.ReadAndWrite.FACILITY_PATH;


public class FacilityImpl implements FacilityService {
        LinkedHashMap<String,Integer> facilityList = getFacilityList();

    @Override
    public void display() {
        facilityList = getFacilityList();
        for (String key : facilityList.keySet()) {
            System.out.println(key + " number of uses: " + facilityList.get(key));
        }

    }

    @Override
    public void addNewVilla() {
        Villa villa = new Villa();
        System.out.println("Enter id villa (SVVL-XXXX)");
        villa.setId(RegexInput.returnIdFacility("villa"));
        System.out.println("Enter name villa");
        villa.setName(scanner.nextLine());
        System.out.println("Enter price");
        villa.setPrice(RegexInput.returnOnlyNumber());
        System.out.println("Enter pool area");
        villa.setPoolArea(RegexInput.returnOnlyNumber());
        ReadAndWrite.write(FACILITY_PATH,(villa.toFile()+",0"));
        System.out.println("Add new Villa successfull");
    }

    @Override
    public void addNewHouse() {
        House house = new House();
        System.out.println("Enter id house (SVHO-XXXX)");
        house.setId(RegexInput.returnIdFacility("house"));
        System.out.println("Enter name house");
        house.setName(scanner.nextLine());
        System.out.println("Enter price");
        house.setPrice(RegexInput.returnOnlyNumber());
        ReadAndWrite.write(FACILITY_PATH,(house.toFile()+",0"));
        System.out.println("Add new house successfull");
    }

    @Override
    public void addNewRoom() {
        Room room = new Room();
        System.out.println("Enter id room (SVRO-XXXX)");
        room.setId(RegexInput.returnIdFacility("room"));
        System.out.println("Enter name room");
        room.setName(scanner.nextLine());
        System.out.println("Enter price");
        room.setPrice(RegexInput.returnOnlyNumber());
        ReadAndWrite.write(FACILITY_PATH,(room.toFile()+",0"));
        System.out.println("Add new room successfull");
    }

    @Override
    public void edit() {

    }

    public static LinkedHashMap<String,Integer> getFacilityList(){
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        List<String[]> list = ReadAndWrite.read(FACILITY_PATH);
        Villa villa;
        House house;
        Room room;
        for (String[] lists : list){
            if (lists[0].contains("VL")){
                villa = new Villa(lists[0],
                        lists[1],
                        Double.parseDouble(lists[2]),
                        Double.parseDouble(lists[3]));
                linkedHashMap.put(villa.toFile(),Integer.parseInt(lists[4]));
            } else if (lists[0].contains("HO")) {
                house = new House(lists[0],
                        lists[1],
                        Double.parseDouble(lists[2]));
                linkedHashMap.put(house.toFile(),Integer.parseInt(lists[3]));
            }else {
                room = new Room(lists[0],
                        lists[1],
                        Double.parseDouble(lists[2]));
                linkedHashMap.put(room.toFile(),Integer.parseInt(lists[3]));
            }
        }
        return linkedHashMap;
    }





}
