package OOPs.access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // Already covered these two
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() { // Hashcode = A unique representation of an object via a number.
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34, 78.6f);
        ObjectDemo obj2 = new ObjectDemo(43, 56.9f);

        // if (obj1 < obj2) { // This is false.
        // System.out.println("obj1 is less than obj2");
        // }

        if (obj1 == obj2) {
            System.out.println("obj1 is equal to obj2");
        }

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());

        // System.out.println(obj.hashCode()); // Give some random gpaue of object.
        // System.out.println(obj2.hashCode()); // Hascode is not an address rather it's
        // giving a random unique number via some algorithm.
    }
}
