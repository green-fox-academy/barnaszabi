package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies = new ArrayList<>();

  public int countUsable(){
    int counter = 0;
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount > 0){
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash(){
    for (int i = 0; i < sharpies.size(); i++) {
      sharpies.remove(i);
    }
  }
}
