import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
  Animal animal = new Animal();

  @Test
  public void eat_Once() {
    animal.eat();
    assertEquals(49,animal.hunger);
  }

  @Test
  public void eat_Twenty() {
    for (int i = 0; i < 20; i++) {
      animal.eat();
    }
    assertEquals(30,animal.hunger);
  }

  @Test
  public void drink_Once() {
    animal.drink();
    assertEquals(49,animal.thirst);
  }

  @Test
  public void drink_Twenty() {
    for (int i = 0; i < 20; i++) {
      animal.drink();
    }
    assertEquals(30,animal.thirst);
  }

  @Test
  public void play_OnceWithHunger() {
    animal.play();
    assertEquals(51,animal.hunger);
  }

  @Test
  public void play_TwentyWithHunger() {
    for (int i = 0; i < 20; i++) {
      animal.play();
    }
    assertEquals(70,animal.hunger);
  }

  @Test
  public void play_OnceWithThirst() {
    animal.play();
    assertEquals(51,animal.thirst);
  }

  @Test
  public void play_TwentyWithThirst() {
    for (int i = 0; i < 20; i++) {
      animal.play();
    }
    assertEquals(70,animal.thirst);
  }
}