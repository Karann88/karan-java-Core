package OOPs.singleton;

// Singleton class is a class that we have only create one object 
public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
