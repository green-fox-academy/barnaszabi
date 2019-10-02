import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void isItAnagram() {
    Anagram anagram = new Anagram();
    boolean lel = anagram.isItAnagram("file", "life");
    assertEquals(true,lel);
  }
}