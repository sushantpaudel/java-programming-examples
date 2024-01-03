import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
  public static void main(String[] args) {
    String filePath = "./output.txt";

    try (FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

      bufferedWriter.write("Hello, World!");
      bufferedWriter.newLine();
      bufferedWriter.write("This is a sample text.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
