package OOPs.staticExample;

// outer class is not static because it is not depending on any other class
public class InnerClasses {

    // Now below class is not depended on the objects of the Innerclasses
    // To this particular class, object of InnerClasses is not needed to be created
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Karan");
        Test b = new Test("Kunal");

        System.out.println(a);

        // System.out.println(a.name);
        // System.out.println(b.name);
    }
}
