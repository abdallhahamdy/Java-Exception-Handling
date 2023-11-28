public class UncheckedExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println("Value at index 5 is: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
