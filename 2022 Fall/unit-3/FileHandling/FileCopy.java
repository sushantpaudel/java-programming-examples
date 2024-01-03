import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
  public static void main(String[] args) {
    String sourceFilePath = "./file.txt";
    String targetFilePath = "./output.txt";

    try (FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(targetFilePath)) {

      byte[] buffer = new byte[1024];
      int bytesRead;
      while ((bytesRead = fileInputStream.read(buffer)) != -1) {
        fileOutputStream.write(buffer, 0, bytesRead);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
