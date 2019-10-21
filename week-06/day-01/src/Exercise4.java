import java.util.Arrays;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Exercise4 {
  public static void main(String[] args) {
    //Write a Stream Expression to get the average value of the odd numbers from the following list:

    Predicate<Integer> filter = (Integer number) -> number % 2 != 0;
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    int count = (int) numbers.stream()
        .filter(filter)
        .count();
    int sum = numbers.stream()
        .filter(filter).mapToInt(number -> number).sum();
    double avg = (double) sum / count;
    System.out.println(avg);
  }
}
