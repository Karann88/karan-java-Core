package CollectionFW.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // hashmap is a key-value pair
        // Unordered collection
        // HashMap is not synchronized
        // HashMap stores internally array of linked list called buckets (Collision) Java 8 onwards
        // After java 8, if the linked list size exceeds 8, it converts it into a balanced tree 
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Karan");    // put - O(1)
        map.put(22, "Supender");
        map.put(31, "Bharat");
        System.out.println(map);

        String student = map.get(22);  // get - O(1)
        // String student = map.get(2); // null
        System.out.println(student);

        System.out.println(map.containsKey(22));
        System.out.println(map.containsValue("Karan"));

        // Set is like List but devoid of duplicates
        // Set<Integer> keys = map.keySet();

        for (int i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }

        // It is like List
        // In each entries, there is a key and a value
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Entry<Integer, String> entry : entries) {
            // System.out.println(entry.getKey() + ": " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        // map.remove(31);
        boolean res = map.remove(31, "Nitin");
        System.out.println("Removed :" + res);
        System.out.println(map);
    }
}
