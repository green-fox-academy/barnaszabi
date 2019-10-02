import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci fibonacci = new Fibonacci();

  @Test
  public void fibonacci_Null() {
    assertEquals(0,fibonacci.fibonacci(0));
  }

  @Test
  public void fibonacci_One() {
    assertEquals(1,fibonacci.fibonacci(1));
  }

  @Test
  public void fibonacci_Ten() {
    assertEquals(55,fibonacci.fibonacci(10));
  }
}