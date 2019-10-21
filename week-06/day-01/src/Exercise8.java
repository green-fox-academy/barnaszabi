import java.util.Arrays;
import java.util.List;

public class Exercise8 {
  public static void main(String[] args) {
    List<Character> characterList = Arrays.asList('t','h','i','s');
    String textOut = characterList.stream()
        .collect(StringBuilder::new,
        StringBuilder::appendCodePoint,
        StringBuilder::append)
        .toString();
    System.out.println(textOut);
  }
}
