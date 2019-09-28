import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    decrypt();
  }

  public static void decrypt (){
    try{
      List<String> lines = Files.readAllLines(Paths.get("reversed-order.txt"));
      ArrayList<String> decryptedLines = new ArrayList<>();
      for (int i = lines.size()-1; i >= 0; i--) {
        decryptedLines.add(lines.get(i));
      }
      Files.write(Paths.get("decrypted-reversed-order.txt"), decryptedLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}