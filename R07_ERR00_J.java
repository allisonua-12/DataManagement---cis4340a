import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class R07_ERR00_J {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
          
        }
        System.out.println("Noncompliant ERR00-J example");}
}
