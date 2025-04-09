package OOPs.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4);
        box1.getL();
        Box box2 = new Box(box1);

        // System.out.println(box1.l + " " + box1.w + " " + box1.h);

        Boxweight box3 = new Boxweight();
        // Boxweight box4 = new Boxweight(2, 3, 4, 8);
        System.out.println(box3.h + " " + box3.weight);

        // Box box5 = new Boxweight(2, 3, 4 ,8);
        // System.out.println(box5);

        // There are many variables in both parent and child classes.
        // you are given access to variables that are in reference type i.e., Boxweight 
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the object itself is of type parent class, how will you call the constructor of child class
        // that is why error
        // Boxweight box6 = new Box(2, 3, 4);
        // System.out.println(box6);

        // BoxPrice box = new BoxPrice(5, 8, 200);

        // BoxColor box = new BoxColor(5, 8, "Black");
        // System.out.println(box.color);

        // Box.greeting();

        // Boxweight box = new Boxweight();
        // Boxweight.greeting();  // you can inherit but you cannot override
    }
}
