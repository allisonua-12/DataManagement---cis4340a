import java.io.FileReader;
import java.io.IOException;
public class R08_FIO02_J {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("test.txt");
        int data = reader.read();
        System.out.println("First character: " + (char) data);
        reader.close();}
}
