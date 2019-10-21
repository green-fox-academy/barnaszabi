import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of characters in a given string!
    String text = "aaabbccccddd";
    Map<Character, Long> frequencyByCharacters = text.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    System.out.println(frequencyByCharacters);
  }
}
