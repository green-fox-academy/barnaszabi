import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("fox1", "green", 4));
    foxes.add(new Fox("fox2", "green", 7));
    foxes.add(new Fox("fox3", "blue", 3));
    foxes.add(new Fox("fox4", "green", 6));
    foxes.add(new Fox("fox5", "yellow", 5));

    List<Fox>greenFoxes = foxes.stream().filter(fox -> fox.getColor().equals("green")).collect(Collectors.toList());
    System.out.println(greenFoxes);

    List<Fox> youngFoxes = foxes.stream().filter(fox -> fox.getAge() < 5).collect(Collectors.toList());
    System.out.println(youngFoxes);

    Map<String, Long> foxesByColor = foxes.stream().collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
    System.out.println(foxesByColor);
  }
}
