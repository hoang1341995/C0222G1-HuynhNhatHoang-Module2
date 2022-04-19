package case_study_module2.services.Impl;

import case_study_module2.models.Facility;
import case_study_module2.models.House;
import case_study_module2.models.Room;
import case_study_module2.models.Villa;
import case_study_module2.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;

import static case_study_module2.controllers.FuramaController.scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> elements : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + elements.getKey() + " Rent=" + elements.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name service: ");
        String nameService = scanner.nextLine();

        System.out.print("Enter use area: ");
        double useArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter rental type: ");
        String rentalType = scanner.nextLine();

        System.out.print("Enter room standard: ");
        String roomStandard = scanner.nextLine();

        System.out.print("Enter pool area: ");
        double poolArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter floor: ");
        int floor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(id, nameService, useArea, price, maxPeople,
                rentalType, roomStandard, poolArea, floor);
        facilityIntegerMap.put(villa, 0); //
        System.out.println("Add new villa successful");
    }

    @Override
    public void addNewHouse() {
        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name service: ");
        String nameService = scanner.nextLine();

        System.out.print("Enter use area: ");
        double useArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter rental type: ");
        String rentalType = scanner.nextLine();

        System.out.print("Enter room standard: ");
        String roomStandard = scanner.nextLine();

        System.out.print("Enter floor: ");
        int floor = Integer.parseInt(scanner.nextLine());

        House house = new House(id, nameService, useArea, price,
                maxPeople, rentalType, roomStandard, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Add new house successful");
    }

    @Override
    public void addNewRoom() {

        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name service: ");
        String nameService = scanner.nextLine();

        System.out.print("Enter use area: ");
        double useArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter rental type: ");
        String rentalType = scanner.nextLine();

        System.out.print("Enter free service: ");
        String freeService = scanner.nextLine();

        Room room = new Room(id, nameService, useArea, price,
                maxPeople, rentalType, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Add new room successful");

    }
}
