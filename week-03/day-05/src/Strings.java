public class Strings {
  public static void main(String[] args) {
    //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(changeXToY("xoxoxoxoxoxxoxoxoxoxoxoxoxxoxoxoxoxoxoxoxxoxoxoxoxoxoxxo"));
  }

  public static String changeXToY(String text){
    if (!text.contains("x")){
      return text;
    }else{
      return (text.substring(0,text.indexOf('x')) + 'y' +changeXToY(text.substring(text.indexOf('x')+1)));
    }
  }
}
