package case_study_module2.utils;

import case_study_module2.models.facility.Facility;
import case_study_module2.models.facility.House;
import case_study_module2.models.facility.Room;
import case_study_module2.models.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadAndWrite {
    public static final String EMPLOYEE_FILE = "src/case_study_module2/data/employee.csv";
    public static final String CUSTOMER_FILE = "src/case_study_module2/data/customer.csv";
    public static final String VILLA_FILE = "src/case_study_module2/data/villa.csv";
    public static final String ROOM_FILE = "src/case_study_module2/data/room.csv";
    public static final String HOUSE_FILE = "src/case_study_module2/data/house.csv";

    public static List<String[]> readFile(String path) {
        List<String[]> list = new ArrayList<>();
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] elements;
            while ((line = bufferedReader.readLine()) != null) {
                elements = line.split(",");
                list.add(elements);
            }
            bufferedReader.close();
            return list;
        } catch (Exception e) {
            System.err.println("[Read file] File not found");
        }
        return list;
    }

    public static void writeFile(String path, String toFile) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(toFile);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("[Write file] File not found");
        }
    }

    public static LinkedHashMap<Facility, Integer> readFileFacility(String path) {
        LinkedHashMap<Facility, Integer> list = new LinkedHashMap<>();
        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String[] facility;
            while ((line = bufferedReader.readLine()) != null) {
                facility = line.split(",");
                if (path.equals(VILLA_FILE)) {
                    Villa newVilla = new Villa(facility[0],
                            facility[1],
                            Double.parseDouble(facility[2]),
                            Double.parseDouble(facility[3]),
                            Integer.parseInt(facility[4]),
                            facility[5], facility[6],
                            Double.parseDouble(facility[7]),
                            Integer.parseInt(facility[8]));
                    list.put(newVilla, 0);
                } else if (path.equals(HOUSE_FILE)) {
                    House newHouse = new House(facility[0],
                            facility[1],
                            Double.parseDouble(facility[2]),
                            Double.parseDouble(facility[3]),
                            Integer.parseInt(facility[4]),
                            facility[5],
                            facility[6],
                            Integer.parseInt(facility[7]));
                    list.put(newHouse, 0);
                } else {
                    Room newRoom = new Room(facility[0],
                            facility[1],
                            Double.parseDouble(facility[2]),
                            Double.parseDouble(facility[3]),
                            Integer.parseInt(facility[4]),
                            facility[5],
                            facility[6]);
                    list.put(newRoom,0);
                }
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("File not found");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
        return list;
    }

    public static void writeFileFacility(String toFile, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(toFile);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("[Write file facility] File not found");
        }
    }

}












