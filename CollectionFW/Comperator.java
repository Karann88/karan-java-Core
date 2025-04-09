package CollectionFW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comperator {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Karan", 7.6));
        students.add(new Student("Supender", 8.2));
        students.add(new Student("Bharat", 7.6));
        students.add(new Student("Rahul", 8.9));

        // Through lambda expression
        // students.sort((o1, o2) -> {
        // if (o2.getCgpa() - o1.getCgpa() > 0) {
        // return 1;
        // } else if (o2.getCgpa() - o1.getCgpa() < 0) {
        // return -1;
        // } else {
        // return 0;
        // }
        // });

        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName);

        students.sort(comparator);
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getCgpa());
        }

        List<String> list2 = Arrays.asList("Apple", "Banana", "Pineapple");
        list2.sort(new StringLenComparator());

        // Through lambda expression
        list2.sort((o1, o2) -> o1.length() - o2.length());
        // list2.sort((o1, o2) -> o2.length() - o1.length());
        System.out.println(list2);

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);

        // list.sort(null);
        // list.sort(new MyComparator());
        // System.out.println(list);

    }
}

class Student {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

}

// class MyComparator implements Comparator<Integer> {

//     @Override
//     public int compare(Integer o1, Integer o2) {
//         // For ascending order
//         // return o1 - o2;

//         // For descending order
//         return o2 - o1;

//     }
// }

class StringLenComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // For ascending order
        // return o1.length() - o2.length();

        // For descending order
        return o2.length() - o1.length();
    }
}
// o1 o2
// "ok" "bye"
