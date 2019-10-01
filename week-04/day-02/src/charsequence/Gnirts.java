package charsequence;

public class Gnirts implements CharSequence {
  String name;

  public Gnirts(String name) {
    this.name = name;
  }

  @Override
  public int length() {
    return name.length();
  }

  @Override
  public char charAt(int index) {
    return name.charAt(name.length() - 1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
