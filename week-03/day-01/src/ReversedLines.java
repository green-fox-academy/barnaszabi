import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    decrypt();
  }

  public static void decrypt (){
    try{
      List<String> lines = Files.readAllLines(Paths.get("reversed-lines.txt"));
      ArrayList<String> decryptedLines = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        String temp = "";
        for (int j = (lines.get(i).length() - 1); j >= 0; j--) {
          temp += lines.get(i).charAt(j);
        }
        decryptedLines.add(temp);
      }
      Files.write(Paths.get("decrypted-reversed-lines.txt"), decryptedLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}