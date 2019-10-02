import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum = new Sum();
  List<Integer> test = new ArrayList<>();
  @Test
  public void sumList_NormalNumbers() {
    test = Arrays.asList(2,3,4,5);
    int result = sum.sumList(test);
    assertEquals(14, result);
  }

  @Test
  public void sumList_Empty() {
    int result = sum.sumList(test);
    assertEquals(0, result);
  }

  @Test
  public void sumList_WithOneNumber() {
    test = Arrays.asList(5);
    int result = sum.sumList(test);
    assertEquals(5, result);
  }

  @Test
  public void sumList_Null() {
    test = null;
    Integer result = sum.sumList(test);
    assertEquals(null, result);
  }
}