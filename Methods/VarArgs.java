package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun();
        // multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        // demo();

        demo(new String[]{"Kunal", "Rahul", "dvytsbhusc"});
        demo(args);    

    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
