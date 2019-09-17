import java.util.ArrayList;

public class ShoppingList
{
    public static void isThereMilk(ArrayList list)
    {
        if (list.contains("milk"))
        {
            System.out.println("There is milk on the list");
        }
        else
        {
            System.out.println("There isn't milk on the list");
        }
    }
    public static void isThereBanana(ArrayList list)
    {
        if (list.contains("banana"))
        {
            System.out.println("There is banana on the list");
        }
        else
        {
            System.out.println("There isn't banana on the list");
        }
    }
    public static void main(String[] args)
    {
        ArrayList<String> shopping = new ArrayList<>();
        shopping.add("eggs");
        shopping.add("milk");
        shopping.add("fish");
        shopping.add("apples");
        shopping.add("bread");
        shopping.add("chicken");
        isThereMilk(shopping);
        isThereBanana(shopping);
    }
}
