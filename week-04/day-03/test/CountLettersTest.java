import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

  @Test
  public void countLetters_WithaAAndB() {
    CountLetters countLetters = new CountLetters();
    HashMap<Character, Integer> map = countLetters.countLetters("aaab");
    HashMap<Character, Integer> map2 = new HashMap<>();
    map2.put('a',3);
    map2.put('b',1);
    assertEquals(map2, map);
  }

  @Test
  public void countLetters_WithText() {
    CountLetters countLetters = new CountLetters();
    HashMap<Character, Integer> map = countLetters.countLetters("alma");
    HashMap<Character, Integer> map2 = new HashMap<>();
    map2.put('a',2);
    map2.put('l',1);
    map2.put('m', 1);
    assertEquals(map2, map);
  }
}