import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class SharpieTest {
  Sharpie sharpie;

  @Test
  public void use_Zero() {
    sharpie = new Sharpie(Color.blue,8.0);
    assertEquals(100.0,sharpie.inkAmount,0);
  }

  @Test
  public void use_Once() {
    sharpie = new Sharpie(Color.blue,8.0);
    sharpie.use();
    assertEquals(99,sharpie.inkAmount,0);
  }

  @Test
  public void use_UntilEmpty() {
    sharpie = new Sharpie(Color.blue,8.0);
    for (int i = 0; i < 100; i++) {
      sharpie.use();
    }
    assertEquals(0.0,sharpie.inkAmount,0);
  }
}