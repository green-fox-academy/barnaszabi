import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    System.out.println(copy("my-file.txt", "copied.txt"));
  }
  public static boolean copy (String from, String to){
    try {
      List<String> copyFrom = Files.readAllLines(Paths.get(from));
      Files.write(Paths.get(to), copyFrom);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
