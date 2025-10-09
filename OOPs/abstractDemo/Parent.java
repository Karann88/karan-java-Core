package OOPs.abstractDemo;

public abstract class Parent { // If class contains one or more than one method then class is also be declared
                               // as abstract.
    int age;

    public Parent(int age) {    // We can also create the constructor in abstract class.
        this.age = age;
    }

    // abstract Parent(); // We can't create constructor like this.

    // We can create static method in abstract class.
    static void hello() {     
        System.out.println("hey");
    }

    // Also we can create normal method in abstract class.
    void normal() {
        System.out.println("this is a normal method");
    }

    // What is abstract method == that's need to be overridden in child class.
    // static abstract void fun(); // We can't make abstract method as static because static method is used without object.
    abstract void career();

    abstract void partner(); // if we don't override this method in child class then child class will also be declared as abstract.

}
