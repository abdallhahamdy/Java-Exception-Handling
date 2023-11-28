import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("sample.txt");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                    System.out.println("\nFile stream closed successfully!");
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file stream: " + e.getMessage());
            }
        }
    }
}
