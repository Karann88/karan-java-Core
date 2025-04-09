package OOPs.properties.inheritance;

public class BoxColor extends Boxweight {
    String color;

    public BoxColor() {
        super();
        this.color = " ";
    }

    BoxColor(double l, double w, double h, double weight, String color) {
        super(l, h, w, weight);
        this.color = color;
    }

    // BoxColor(BoxColor other) {
    //     super(other);
    //     this.color = other.color;
    // }

    BoxColor(double side, double weight, String color) {
        super(side, weight);
        this.color = color;
    }
}
