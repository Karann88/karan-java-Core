package OOPs.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();
        
        Daughter daughter = new Daughter(28);
        daughter.career();

        Parent.hello();
        // Parent mom = new Parent(45);  For abstract classes you can't create object like this.
        // You must override the function to access above.
    }
}
