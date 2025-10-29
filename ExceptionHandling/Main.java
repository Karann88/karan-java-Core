package ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        // int ans = a / b; // This will throw ArithmeticException
        // System.out.println("Result: " + ans);

        try {
            // int result = a / b;
            // divide(a, b);
            String name = "Karan";
            if (name.equals("Karan")) {
                throw new MyException("Name is Karan");
            }
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}
