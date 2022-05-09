package backup_exam_module2.lib;

import java.util.Set;

public class LinkedHashMap {

    /*
    c<String, Integer> facility = ReadAndWrite.readFileUsesOfFacility(FACILITY_FILE);
        for (String key : facility.keySet()) {
            System.out.println(key + " number of uses: " + facility.get(key));
        }
     */

    public static void main(String args[]) {
        // init linkedHashMap
        java.util.LinkedHashMap<Integer, String> linkedHashMap = new java.util.LinkedHashMap<Integer, String>();
        // add elements to linkedHashMap
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(1, "PHP");
        linkedHashMap.put(4, "Python");
        // show linkedHashMap before remove
        System.out.println("Before remove:");
        show(linkedHashMap);
        // remove element
        linkedHashMap.remove(4);
        // show linkedHashMap after remove
        System.out.println("After remove:");
        // show hashMap
        show(linkedHashMap);
    }

    public static void show(java.util.LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
