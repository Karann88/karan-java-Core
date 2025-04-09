package OOPs.staticExample;

public class Main {
    public static void main(String[] args) {
        // Human insaan1 = new Human(22, "Karan", "Male", false);
        // Human insaan2 = new Human(33, "Chhavi", "Female", true);
        // Human insaan3= new Human(30, "Tanvish", "Male", true);

        // System.out.println(Human.population);
        // System.out.println(Human.population);
        // System.out.println(Human.population);

        // In the end, obejct will be created 100% 
        Main funn = new Main();
        funn.fun2();
    }

    // this is not dependent on objects
    static void fun() {
        // greeting();  // you cannot use this because it requires an instance.
        // but the functions you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in 
        // a static context

        // Hence, here I am referencing it.
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
        // fun();
        System.out.println("Hello World");
    }
}
