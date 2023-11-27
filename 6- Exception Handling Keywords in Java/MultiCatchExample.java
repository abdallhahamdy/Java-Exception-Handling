public class MultiCatchExample {

    public static void main(String[] args) {
        String numStr = "10a";  // This will cause NumberFormatException
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            int num = Integer.parseInt(numStr);   // Parsing integer from string
            System.out.println(numbers[num]);     // Accessing array element
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
