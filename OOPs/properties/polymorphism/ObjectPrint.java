package OOPs.properties.polymorphism;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    // By default toString method is present in Object class
    // Every class in java is by default inherited from Object class
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5);
        System.out.println(obj); // by default it will print the hashcode of the object
        System.out.println(obj.toString()); // same as above
    }

}
