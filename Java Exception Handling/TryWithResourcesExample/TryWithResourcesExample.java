import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("file.txt")) {
            int data = input.read();
            while(data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}