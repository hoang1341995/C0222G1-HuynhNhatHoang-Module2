package case_study_module2.services.impl;

import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.services.FacilityService;
import case_study_module2.utils.ReadAndWrite;
import case_study_module2.utils.regex.RegexInput;

import java.util.LinkedHashMap;

import static case_study_module2.controllers.FuramaController.scanner;
import static case_study_module2.utils.ReadAndWrite.*;

public class FacilityServiceImpl implements FacilityService {
    LinkedHashMap<Facility, Integer> villaList = ReadAndWrite.readFileFacility(VILLA_FILE);
    LinkedHashMap<Facility, Integer> houseList = ReadAndWrite.readFileFacility(HOUSE_FILE);
    LinkedHashMap<Facility, Integer> roomList = ReadAndWrite.readFileFacility(ROOM_FILE);

    @Override
    public void displayFacility() {
        LinkedHashMap<String, Integer> facility = ReadAndWrite.readFileUsesOfFacility(FACILITY_FILE);
        for (String key : facility.keySet()) {
            System.out.println(key + " number of uses: " + facility.get(key));
        }
    }

    @Override
    public void displayMaintain() {

    }


    @Override
    public void addNewVilla() {
        Villa villa = new Villa();
        System.out.print("Enter id (SVVL): ");
        villa.setId(RegexInput.returnIdFacility("villa"));
        System.out.print("Enter name service: ");
        villa.setNameService(RegexInput.returnString());
        System.out.print("Enter use area: ");
        villa.setUseArea(RegexInput.returnOnlyNumber());
        System.out.print("Enter price: ");
        villa.setPrice(RegexInput.returnPositiveNumber());
        System.out.print("Enter max people: ");
        villa.setMaxPeople(RegexInput.returnMaxPeople());
        System.out.print("Enter rental type: ");
        villa.setRentalType(RegexInput.returnString());
        System.out.print("Enter room standard: ");
        villa.setRoomStandard(RegexInput.returnString());
        System.out.print("Enter pool area: ");
        villa.setPoolArea(RegexInput.returnPoolArea());
        System.out.print("Enter floor: ");
        villa.setFloor(RegexInput.returnPositiveNumber());
        ReadAndWrite.writeFileFacility(villa.toFile(),VILLA_FILE);
        ReadAndWrite.writeFileUsesOfFacility(villa,FACILITY_FILE);
        System.out.println("Add new villa successful");
    }

    @Override
    public void addNewHouse() {
        House house = new House();
        System.out.print("Enter id (SVHO): ");
        house.setId(RegexInput.returnIdFacility("house"));
        System.out.print("Enter name service: ");
        house.setNameService(RegexInput.returnString());
        System.out.print("Enter use area: ");
        house.setUseArea(RegexInput.returnOnlyNumber());
        System.out.print("Enter price: ");
        house.setPrice(RegexInput.returnPositiveNumber());
        System.out.print("Enter max people: ");
        house.setMaxPeople(RegexInput.returnMaxPeople());
        System.out.print("Enter rental type: ");
        house.setRentalType(RegexInput.returnString());

        System.out.print("Enter room standard: ");
        house.setRoomStandard(RegexInput.returnString());
        System.out.print("Enter floor: ");
        house.setFloor(RegexInput.returnPositiveNumber());
        ReadAndWrite.writeFileFacility(house.toFile(),HOUSE_FILE);
        ReadAndWrite.writeFileUsesOfFacility(house,FACILITY_FILE);
        System.out.println("Add new house successful");
    }

    @Override
    public void addNewRoom() {
        Room room = new Room();
        System.out.print("Enter id (SVRO): ");
        room.setId(RegexInput.returnIdFacility("room"));
        System.out.print("Enter name service: ");
        room.setNameService(RegexInput.returnString());
        System.out.print("Enter use area: ");
        room.setUseArea(RegexInput.returnOnlyNumber());
        System.out.print("Enter price: ");
        room.setPrice(RegexInput.returnPositiveNumber());
        System.out.print("Enter max people: ");
        room.setMaxPeople(RegexInput.returnMaxPeople());
        System.out.print("Enter rental type: ");
        room.setRentalType(RegexInput.returnString());

        System.out.print("Enter free service: ");
        room.setFreeService(scanner.nextLine());
        ReadAndWrite.writeFileFacility(room.toFile(),ROOM_FILE);
        ReadAndWrite.writeFileUsesOfFacility(room,FACILITY_FILE);
        System.out.println("Add new room successful");

    }
}
