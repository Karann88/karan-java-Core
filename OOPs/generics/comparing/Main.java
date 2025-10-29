package OOPs.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, 85.5f);
        Student s2 = new Student(2, 90.0f);
        Student s3 = new Student(3, 75.0f);
        Student s4 = new Student(4, 95.5f);

        Student[] students = { s1, s2, s3, s4 };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
 

        if (s1.compareTo(s2) < 0) {
            System.out.println("Student s2 has higher marks than s1");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("Student s1 has higher marks than s2");
        } else {
            System.out.println("Both students have equal marks");
            
        }
    }
}
