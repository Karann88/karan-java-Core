package OOPs.singleton;

import OOPs.access.A;

public class Main1 {
    public static void main(String[] args) {
        // Singleton obj = new Singleton();
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all three reference variables are pointing to just one object.

        A a = new A(10, "Karan");
        a.getNum();
    }
}
