import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {
  public boolean isItAnagram(String first, String second){
    List<Character> firstCharacters = new ArrayList<>();
    List<Character> secondCharacters = new ArrayList<>();
    if (first.length() == second.length()){
      for (int i = 0; i < first.length(); i++) {
        firstCharacters.add(first.charAt(i));
        secondCharacters.add(second.charAt(i));
      }
      Collections.sort(firstCharacters);
      Collections.sort(secondCharacters);
      return firstCharacters.equals(secondCharacters);
    }else {
      return false;
    }
  }
}
