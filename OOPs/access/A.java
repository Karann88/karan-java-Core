package OOPs.access;

public class A {
    // private int num; // This is Data Hiding.   // we can access private via getters and setters method.
    protected int num;  // Access in Same package
    // int num;     // This is default access modifier which means we cannot access it outside the package.
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
