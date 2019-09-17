import java.util.HashMap;

public class TelephoneBook
{
    public static void main(String[] args)
    {
        HashMap<String, String> phones = new HashMap<>();
        phones.put("William A. Lathan", "405-709-1865");
        phones.put("John K. Miller", "402-247-8568");
        phones.put("Hortensia E. Foster", "606-481-6467");
        phones.put("Amanda D. Newland", "319-243-5613");
        phones.put("Brooke P. Askew", "307-687-2982");
        System.out.println("John K. Miller's phone number is " + phones.get("John K. Miller"));
        for (String key: phones.keySet())
        {
            if (phones.get(key) == "307-687-2982")
            {
                System.out.println("The 307-687-2982 number is " + key + "'s");
            }
        }
        if (phones.keySet().contains("Chris E. Myers"))
        {
            System.out.println("Chris E. Myers' phone number is " + phones.get("Chris E. Myers"));
        }
        else
        {
            System.out.println("This name isn't in the phone book");
        }
    }
}
