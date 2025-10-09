package OOPs.abstractDemo;

public class Son extends Parent {

    // public Son(int age) {
    //     this.age = age;
    // }

    public Son(int age) {
        super(age);
    }

    // Child class must override all the abstract methods of parent class otherwise child
    // class will also be declared as abstract.
    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}
