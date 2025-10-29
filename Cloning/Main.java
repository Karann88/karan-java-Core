package Cloning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human karan = new Human(25, "Karan");
        // Human twin = new Human(human); // Using copy constructor to clone object.
        // It's a manual way of cloning and taking longer time.

        Human twin = (Human) karan.clone(); // Using clone() method to clone object. exact copy of original object.
        System.out.println("Original Human: " + karan.name + ", Age: " + karan.age);
        System.out.println("Twin Human: " + twin.name + ", Age: " + twin.age);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(karan.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
