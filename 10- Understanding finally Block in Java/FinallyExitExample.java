public class FinallyExitExample {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.exit(0); // Terminates JVM
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}

// Output:
// Inside try block