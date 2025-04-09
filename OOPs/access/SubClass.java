package OOPs.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new SubClass(45, "Karan");
        // int n = obj.num;
    }
}
class SubSubclass extends SubClass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        A obj = new SubSubclass(45, "Karan");
        int n = obj.num;
    }
}

class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
        //TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "Karan");
        int n = obj.num;
    }
}