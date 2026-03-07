import java.io.FileReader;
import java.io.IOException;
public class R08_FIO02_J {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("test.txt");
            int data = reader.read();
            System.out.println("First character: " + (char) data);
            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());}
    }
}
