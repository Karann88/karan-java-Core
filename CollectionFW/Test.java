package CollectionFW;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);  // LinkedList or list always call toString() method.

        System.out.println(list.get(1));  // Time Complexity O(n)
        System.out.println(list.size());  // Time Complexity O(1)

        list.addLast(5); // Time Complexity O(1)
        list.addFirst(1); // Time Complexity O(1)
        System.out.println(list);

        System.out.println(list.getFirst()); // Time Complexity O(1)
        System.out.println(list.getLast()); // Time Complexity O(1));

        list.removeFirst(); // Time Complexity O(1)
        System.out.println(list);

        list.removeFirstOccurrence(2); // Time Complexity O(n)
        System.out.println(list);

        list.removeIf(x -> x % 2 == 0); // Time Complexity O(n)
        System.out.println(list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog", "Cat", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion")); 
        animals.removeAll(animalsToRemove); // Time Complexity O(m*n)
        System.out.println(animals);
        
    }
}
