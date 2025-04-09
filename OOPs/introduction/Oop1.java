/*Let's take a example to understand why we need OOP's Concept.
*Suppose we are creating data of 5 students contain {roll no, name, marks}
*In general way :
*int[] rno = new int[5]
*String[] name = new String[5]
*float[] marks = new float[5]

*we are trying to short our code , we don't wanna write in diff. lines 
*So we classes and object and here's the concept of OOPs arrives */

// class:- Is a named, group of properties and functions
// if you're creating your own datatype then use classes
// class is a template of an object
// object is an instance of a class

package OOPs.introduction;

public class Oop1 {
    public static void main(String[] args) {
        Student student1 = new Student(15, "karan", 88.5f);
        Student student2 = new Student();

        // student1.rno = 21;
        // student1.name = "Karan";
        // student1.marks = 80.67f;

        // student1.changeName("Shoe lover");
        student1.greeting(); // student1 is reference variable of type Student.

        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        Student random = new Student(student1);
        System.out.println(random.name);
        System.out.println(random.rno);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name);
    }
}

class Student {

    // Not use of below code when we will using constructor.
    int rno;
    String name;
    float marks;

    // We need a way to add the values of the above
    // properties object by object

    // We need one word to access every object

    void greeting() {
        // System.out.println("Hello, my name is " + name);
        System.out.println("Hello, my name is " + this.name); // this is replaced with the name of the reference
                                                              // variable.
    }

    void changeName(String name) {
        this.name = name;
    }

    Student(Student other) {
        // this keyword is replace with random object
        // other is replace with student1 object
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // Constructor is declared by the class name.
    Student() {
        // This is how you call a constructor form another constructor
        // internally: new Student (13, "default person", 100.0f);
        this(13, "default person", 100.0f);
    }

    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
