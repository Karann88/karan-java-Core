package CollectionFW;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriterArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> copyOnWriterArrayList = new CopyOnWriteArrayList<>();
        // "Copy on write" means whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the the modification is apllied to
        // that copy.
        // This ensures that other threads reading the list while it's being modified
        // are unaffected.

        // Read Opeartions: Fast and direct, since they happen on a stable list without
        // interference from modifications.
        // Write Operations: A new copy of the list is created, and the modification is
        // applied to that copy.
        // Once the modification is done, the reference to the list is updated to point
        // to the new copy.

        // Read more

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Butter");
        System.out.println("Initial Shopping List: " + shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);
            // Try to modify the list while reading
            if (item.equals("Milk")) {
                shoppingList.add("Eggs");
                System.out.println("Added Eggs to the list");
            }
        }
        System.out.println("Final Shopping List: " + shoppingList);

        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");

        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(1000); // Small delay to simulate work
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in readerThread: " + e);
            }
        });

        // Thread writerThread = new Thread(() -> {
        //     try {
        //         while (true) {
        //             Thread.sleep(500); // Delay to allow reading to start first
        //             sharedList.add("NewItem");
        //             System.out.println("Added NewItem to the list");

        //             Thread.sleep(500);
        //             sharedList.remove("Item1");
        //             System.out.println("Removed Item1 from the list");
        //         }
        //     } catch (Exception e) {
        //         System.out.println("Exception in writerThread: " + e);
        //     }
        // });
        readerThread.start();
        // writerThread.start();
    }
}
