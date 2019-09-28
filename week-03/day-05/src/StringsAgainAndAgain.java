public class StringsAgainAndAgain {
  public static void main(String[] args) {
    //Given a string, compute recursively a new string where all the adjacent chars are now separated by a *
    System.out.println(stringsAgainAndAgain("fhsadufhasldfjfhsad"));
  }

  public static String stringsAgainAndAgain(String text){
    if (text.length() <= 1){
      return text;
    }else{
      return (text.substring(0,1) + '*' + stringsAgainAndAgain(text.substring(1)));
    }
  }
}
