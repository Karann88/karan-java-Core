package OOPs.access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Karan");

        // need to do a few things.
        // 1. access the data members
        // 2. modify the data members.

        // ArrayList<Integer> list = new ArrayList<>(23);
        // We can definetely print the array and change the array. 
        // But we cannot access the reference of that array directly.
        // Because it is priavte.
        // list.DEFAULT_CAPACITY;

        // If you wanna get or access something then your data variable should be private.
        // This is not due to little bit security purpose and that is Data Hiding. 
        // obj.num; // you cannot access because num variable is private.

        System.out.println(obj.getNum());
        // obj.setNum(30);
        
    }
}
