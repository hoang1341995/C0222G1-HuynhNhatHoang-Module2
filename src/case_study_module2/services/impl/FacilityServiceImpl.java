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
        villa.setNameService(scanner.nextLine());
        System.out.print("Enter use area: ");
        while (true){
            try {
                villa.setUseArea(Double.parseDouble(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter price: ");
        while (true){
            try {
                villa.setPrice(Double.parseDouble(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter max people: ");
        while (true){
            try {
                villa.setMaxPeople(Integer.parseInt(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter rental type: ");
        villa.setRentalType(scanner.nextLine());
        System.out.print("Enter room standard: ");
        villa.setRoomStandard(scanner.nextLine());
        System.out.print("Enter pool area: ");
        while (true){
            try {
                villa.setPoolArea(Double.parseDouble(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter floor: ");
        while (true){
            try {
                villa.setFloor(Integer.parseInt(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
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
        house.setNameService(scanner.nextLine());
        System.out.print("Enter use area: ");
        while (true){
            try {
                house.setUseArea(Double.parseDouble(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter price: ");
        while (true){
            try {
                house.setPrice(Double.parseDouble(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter max people: ");
        while (true){
            try {
                house.setMaxPeople(Integer.parseInt(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter rental type: ");
        house.setRentalType(scanner.nextLine());

        System.out.print("Enter room standard: ");
        house.setRoomStandard(scanner.nextLine());
        System.out.print("Enter floor: ");
        while (true){
            try {
                house.setFloor(Integer.parseInt(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
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
        room.setNameService(scanner.nextLine());
        System.out.print("Enter use area: ");
        while (true){
            try {
                room.setUseArea(Double.parseDouble(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter price: ");
        while (true){
            try {
                room.setPrice(Double.parseDouble(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter max people: ");
        while (true){
            try {
                room.setMaxPeople(Integer.parseInt(scanner.nextLine()));
                break;
            }catch (NumberFormatException e){
                System.err.println("Wrong format, please re-enter");
            }
        }
        System.out.print("Enter rental type: ");
        room.setRentalType(scanner.nextLine());

        System.out.print("Enter free service: ");
        room.setFreeService(scanner.nextLine());
        ReadAndWrite.writeFileFacility(room.toFile(),ROOM_FILE);
        ReadAndWrite.writeFileUsesOfFacility(room,FACILITY_FILE);
        System.out.println("Add new room successful");

    }
}
