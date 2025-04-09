package OOPs.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

        // Can't change the reference variable.
        // final int bonus = 2;
        // bonus = 3;

        final A student = new A("Karan");
        student.name = "other name"; // change the value when it is non primitive datatype

        // When a non primitive is final, you cannot reassign it.
        // student = new A("new object");
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}
