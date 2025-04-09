package OOPs.abstractDemo;

public abstract class Parent { // If class contains one or more than one method then class is also be declared
                               // as abstract.
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
