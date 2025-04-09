package OOPs.staticExample;

public class Human {
    int age;
    String name;
    String gender;
    boolean married;
    static long population;
    // When a member is declared static, it can be accessed before any of the object 
    // class is being created and without referencing to that object
    // static variables are not dependent on the object 

    static void message() {
        System.out.println("Hello World");
        // System.out.println(this.age); // Can't use this over here
    }
    public Human(int age, String name, String gender, boolean married) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.married = married;
        // this.population += 1;
        Human.population += 1;
        // this keyword cannot be using to access the static variable.
        // instead we should use class name to access the static variable.
        // Because population is same for all people in this world, that's why we are
        // using static variable above. static means universely true for all
    }
}
