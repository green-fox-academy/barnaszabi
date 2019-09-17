import java.util.ArrayList;
import java.util.Arrays;
public class ListIntroduction2
{
    public static void separator()
    {
        System.out.println("--------------");
    }
    public static void main(String[] args)
    {
        ArrayList<String> A = new ArrayList<>();
        A.add("Apple");
        A.add("Avocado");
        A.add("Blueberries");
        A.add("Durian");
        A.add("Lychee");
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < A.size(); i++)
        {
            B.add(A.get(i));
        }
        separator();
        if (A.contains("Durian"))
        {
            System.out.println("It contains durian");
        }
        else
        {
            System.out.println("It doesn't contains durian");
        }
        B.remove("Durian");
        A.add(4,"Kiwifruit");
        separator();
        if (A.size()>B.size())
        {
            System.out.println("The size of A is bigger");
        }
        else if (A.size()<B.size())
        {
            System.out.println("The size of B is bigger");
        }
        else
        {
            System.out.println("Their size are equals");
        }
        separator();
        System.out.println(A.indexOf("Avocado"));
        separator();
        System.out.println(B.indexOf("Durian"));
        B.addAll(Arrays.asList("Passion fruit", "Pomelo"));
        separator();
        System.out.println(A.get(2));
    }
}
