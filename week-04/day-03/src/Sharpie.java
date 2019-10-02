import java.awt.*;

public class Sharpie{
  Color color;
  double width;
  double inkAmount;

  public Sharpie(Color color, double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use(){
    inkAmount--;
  }
}
