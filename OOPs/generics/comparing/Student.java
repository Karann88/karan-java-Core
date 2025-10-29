package OOPs.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        if (this.marks > o.marks) {
            return 1;
        } else if (this.marks < o.marks) {
            return -1;
        }
        return 0;
    }
}
