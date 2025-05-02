package Recursion;

public class Karan {
    public int id;
    public String name;
    public double salary;

    public Karan(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Karan karan = new Karan(101, "Karan", 50000.0);
        System.out.println("ID: " + karan.id);
        System.out.println("Name: " + karan.name);
        System.out.println("Salary: " + karan.salary);

        /*
         * karan.setId(1);
         * karan.setName("Karan");
         * karan.setSalary(50000.0);
         * 
         * System.out.println("ID: " + karan.id);
         * System.out.println("Name: " + karan.name);
         * System.out.println("Salary: " + karan.salary);
         */
    }

}
