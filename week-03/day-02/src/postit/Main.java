package postit;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    PostIt first = new PostIt(Color.orange,"Idea 1", Color.blue);
    PostIt second = new PostIt(Color.pink,"Awesome", Color.black);
    PostIt third = new PostIt(Color.yellow,"Superb!", Color.green);
  }
}
