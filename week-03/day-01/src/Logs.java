import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    String[] lol = FindingIPAddresses();
    for (int i = 0; i < lol.length; i++) {
      System.out.println(lol[i]);
    }
  }

  public static String[] FindingIPAddresses(){
    Path filePath = Paths.get("Log.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      String[] ipAddresses = new String[lines.size()];
      for (int i = 0; i < ipAddresses.length; i++) {
        ipAddresses[i] = lines.get(i).substring((lines.get(i).indexOf("   ")+3), lines.get(i).lastIndexOf("   "));
      }
      return ipAddresses;
    } catch (IOException e) {
      return null;
    }
  }
}
