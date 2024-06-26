import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class toi1 {
    public static void main(String[] args) {

        System.out.println("Hello, world!");

        try (PrintWriter pw = new PrintWriter("toi1.txt")) {
            

        } catch (FileNotFoundException e) {
            // Ç±Ç±Ç…ÉGÉâÅ[èàóù
        }

    }
}