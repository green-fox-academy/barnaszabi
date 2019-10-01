package charsequence;

public class Shifter implements CharSequence{
  String name;
  int shift;
  public Shifter(String name, int shift) {
    this.name = name;
    this.shift = shift;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    int shifting = (shift + index) % name.length();
      return name.charAt(shifting);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
