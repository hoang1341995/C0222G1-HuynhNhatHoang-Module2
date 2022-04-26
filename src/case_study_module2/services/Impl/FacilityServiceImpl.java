package case_study_module2.services.Impl;

import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;
import case_study_module2.services.FacilityService;
import case_study_module2.utils.ReadAndWrite;

import java.util.LinkedHashMap;

import static case_study_module2.controllers.FuramaController.scanner;
import static case_study_module2.utils.ReadAndWrite.*;

public class FacilityServiceImpl implements FacilityService {

    @Override
    public void displayFacility() {

        System.out.println("<<Display Facility>>");
        System.out.println("1. Villa list\n" +
                "2. House list\n" +
                "3. Room list");
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
                displayOption(1);
                break;
            case 2:
                displayOption(2);
                break;
            case 3:
                displayOption(3);
                break;
        }
    }

    public void displayOption(int number){
        LinkedHashMap<Facility, Integer> facility;
        if (number == 1){
            facility = ReadAndWrite.readFileFacility(VILLA_FILE);
        } else if (number == 2) {
            facility = ReadAndWrite.readFileFacility(HOUSE_FILE);
        }else{
            facility = ReadAndWrite.readFileFacility(ROOM_FILE);
        }
        for (Facility key : facility.keySet()){
            System.out.println(key + " " + facility.get(key));
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
    public void addNewVilla() {
        Villa villa = new Villa();
        System.out.print("Enter id: ");
        villa.setId(scanner.nextLine());
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
        System.out.println("Add new villa successful");
    }

    @Override
    public void addNewHouse() {
        House house = new House();
        System.out.print("Enter id: ");
        house.setId(scanner.nextLine());
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
    }

    @Override
    public void addNewRoom() {
        Room room = new Room();
        System.out.print("Enter id: ");
        room.setId(scanner.nextLine());
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

    }
}
