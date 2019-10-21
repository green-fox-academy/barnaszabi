import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!
    String text = "This Is A Text";
    List<Character> uppercaseCharacters= text.chars()
        .mapToObj(c -> (char) c)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());
    System.out.println(uppercaseCharacters);
  }
}
