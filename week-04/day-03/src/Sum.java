import java.util.ArrayList;
import java.util.List;

public class Sum {
  public List<Integer> listOfNumbers = new ArrayList<>();

  public Integer sumList(List<Integer> listOfNumbers){
    Integer sum = 0;
    if (listOfNumbers == null) {
      return null;
    }else {
      for (int i = 0; i < listOfNumbers.size(); i++) {
        sum += listOfNumbers.get(i);
      }
      return sum;
    }
  }
}
