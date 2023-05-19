
import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

public class CompressDirectory {
  public static void main(String[] args) throws IOException {
    String sourceDir = "./dir";
    String zipFilePath = "./output.zip";

    try (FileOutputStream fos = new FileOutputStream(zipFilePath);
        ZipOutputStream zos = new ZipOutputStream(fos)) {

      Path sourcePath = Paths.get(sourceDir);
      Files.walk(sourcePath)
          .filter(Files::isRegularFile)
          .forEach(file -> {
            try {
              String entryName = sourcePath.relativize(file).toString();
              zos.putNextEntry(new ZipEntry(entryName));
              Files.copy(file, zos);
              zos.closeEntry();
            } catch (IOException e) {
              e.printStackTrace();
            }
          });
    }

    System.out.println("Directory compressed successfully.");
  }
}
