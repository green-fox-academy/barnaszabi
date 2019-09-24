import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {
  public static int countingLines (File file) {
    if (file.canRead()) {
      int count = 0;
      try {
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
          count++;
          sc.nextLine();
        }
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
      return count;
    }else {
      return 0;
    }
  }
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    File file = new File("CountLines.txt");
    System.out.println(countingLines(file));
  }
}
