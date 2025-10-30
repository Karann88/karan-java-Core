package CollectionFW;

import java.util.ArrayList;
import java.util.Arrays;
// ArrayList is not synchronized.
// It can access both thread at a time.
// It is not thread safe(follows Multi-threading concept).
// ArrayList is faster than Vector.
// ArrayList is like a dynamic array with growable capacity and default capacity 10.
// It contains duplicate elements and order of list is maintained.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.remove(Integer.valueOf(2));
        // System.out.println(list);
        
        // List<String> list = new ArrayList<>();
        // list.add("Apple");
        // list.add("Apple");
        // list.add("Banana");
        // list.add("Cherry");
        // list.add("Date");
        
        // list.remove("Apple");
        // System.out.println(list);

        // System.out.println(list.getClass().getName());

        // asList method has a fixed size.
        List<String>list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(0, "Sunday"); // This is allowed
        // list1.add("Wednesday"); // UnsupportedOperationException

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list3 = List.of("Apple", "Banana", "Cherry"); // Immutable list
        System.out.println(list3.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);    
        list4.add("Blueberry"); // This is allowed
        System.out.println(list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(10);
        list5.add(20);
        list5.add(30);
        list5.add(2, 40);
        System.out.println(list5);

        List<Integer> list6 = List.of(1, 2, 3, 4); // Immutable list
        list5.addAll(list6);
        System.out.println(list5);
        
    
        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());


        list.add(1);
        list.add(5);
        list.add(80);

        list.remove(1);
        list.add(2, 50);
        System.out.println(list);   // calls toString() method of ArrayList class.
        for (int x : list) {
            System.out.println(x);
        }
        
        // System.out.println(list.get(2));
        // System.out.println(list.size());
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // for (int x : list) {
        //     System.out.println(x);
        // }
        // System.out.println(list.contains(5));
        // System.out.println(list.contains(20));
    }
}
