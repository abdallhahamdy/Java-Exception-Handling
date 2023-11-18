import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }
    }
}