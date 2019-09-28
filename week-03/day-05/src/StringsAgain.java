public class StringsAgain {
  public static void main(String[] args) {
    //Given a string, compute recursively a new string where all the 'x' chars have been removed.
    System.out.println(stringsAgain("xxoxoxoxoxoxoxoxoxoxxoxoxoxoxoxoxxo"));
  }

  public static String stringsAgain(String text){
    if (!text.contains("x")){
      return text;
    }else{
      return (text.substring(0, text.indexOf('x')) + stringsAgain(text.substring(text.indexOf('x')+1)));
    }
  }
}
