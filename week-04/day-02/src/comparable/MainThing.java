package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainThing {
  public static void main(String[] args) {
    List<Thing> things = new ArrayList<>();
    things.add(new Thing("Get milk"));
    things.add(new Thing("Remove the obstacles"));
    things.add(new Thing("Stand up"));
    things.add(new Thing("Eat lunch"));
    things.get(2).complete();
    things.get(3).complete();
    Collections.sort(things);
    for (Thing thing : things) {
      System.out.println(thing);
    }
  }
}
