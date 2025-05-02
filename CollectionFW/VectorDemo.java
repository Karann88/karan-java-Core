package CollectionFW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

/* 
* Vector(implements List Interface) methods are synchronized.
* Vector is a legacy class.
* Vector ensures thread safety (one thread at a time).
* Vector is slow as compared to ArrayList (ArrayList supports multi-threading).
* It is like a dynamic array with growable capacity.
* Vector is a growable array with default capacity 10. 
*/

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(5, 3);
        v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);
        v.add(10);
        System.out.println(v.capacity());
        v.add(10);
        System.out.println(v.capacity());
        v.add(10);
        v.add(10);
        System.out.println(v.capacity());
        v.add(10);
        System.out.println(v.capacity());

        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // System.out.println(list);

        // Vector<Integer> v1 = new Vector<>(list);
        // System.out.println(v1);

        // for (int i = 0; i < v1.size(); i++) {
        // System.out.println(v1.get(i));
        // }

        /*
         * ArrayList is not synchronized.
         * It can access both thread at a time.
         * It is not thread safe.
         * ArrayList is faster than Vector.
         */

        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list.size());
    }

}