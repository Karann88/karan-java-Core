package OOPs.properties.inheritance;

public class Boxweight extends Box{
    double weight;

    public Boxweight() {
        this.weight = -1;
    }

    Boxweight(Boxweight other) {
        super(other);
        this.weight = other.weight;
    }

    public Boxweight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public Boxweight(double l, double w, double h, double weight) {
        super(l, h, w);  // call the parent class constructor
        // used to initialize values present in parent class(call the parent class constructor).
        // System.out.println(super.weight);
        this.weight = weight;
    }
}
