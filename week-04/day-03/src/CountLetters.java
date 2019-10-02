import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer> countLetters(String text){
    HashMap<Character, Integer> letters = new HashMap<>();
    for (int i = 0; i < text.length(); i++) {
      if (!letters.containsKey(text.charAt(i))){
        letters.put(text.charAt(i), 1);
      }else {
        int temp = letters.get(text.charAt(i));
        letters.replace(text.charAt(i),temp,(temp+1));
      }
    }
    return letters;
  }
}
