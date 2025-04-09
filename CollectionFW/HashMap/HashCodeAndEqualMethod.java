package CollectionFW.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualMethod {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student(1, "Karan");
        Student s2 = new Student(2, "Supender");
        Student s3 = new Student(1, "Karan");

        map.put(s1, "Engineer"); // hashcode1 --> index1
        map.put(s2, "Designer"); // hashcode2 --> index2
        map.put(s3, "Manager");  // hashcode3 --> index3

        System.out.println("HashMap size: " + map.size());
        System.out.println("Value for s1: " + map.get(s1));
        System.out.println("Value for s3: " + map.get(s3));


        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham", 90); // hashcode1 --> index1
        map1.put("Neha", 89); // hashcode2 --> index2
        map1.put("Shubham", 99); // hashcode1 --> index1 --> equals() --> replace value
        System.out.println(map1);
    }
}

class Student {
    private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Student [toString()=" + super.toString() + "]";
    }

}
