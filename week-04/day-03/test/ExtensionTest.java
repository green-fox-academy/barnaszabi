//import org.junit.Test;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(Arrays.asList(5), extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(Arrays.asList(5), extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMaxOfThree_Equal() {
    assertEquals(Arrays.asList(5,5), extension.maxOfThree(5, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(Arrays.asList(5,5), extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian_Long() {
    assertEquals(Arrays.asList(7), extension.median(Arrays.asList(7,5,3,5,8,1,5,4,7,8,7,8,9,7,8,9,8)));
  }

  @Test
  void testMedian_five() {
    assertEquals(Arrays.asList(3), extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {

    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}