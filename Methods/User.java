package Methods;
public class User {

    private String name;

    User() {
        this.name = "Default";
    }

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getName());

        User userWithName = new User("JECRC");
        System.out.println(userWithName.getName());
    }

}
