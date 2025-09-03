import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriterHidden {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".secretpassword.txt"))) {
            bufferedWriter.write("complexpassword");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(
                        ".secret/complexpassword.txt"))) {
            bufferedWriter.write("complexpassword");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
