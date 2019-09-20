import java.lang.StringBuilder;
public class TakesLonger
{
    public static void main(String... args)
    {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder s = new StringBuilder(quote);
        //quote = s.substring(0,21) + "always takes longer than " + s.substring(21);

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        quote = s.insert(quote.indexOf("you"), "always takes longer than ").toString();
        System.out.println(quote);
    }
}
