import java.util.HashMap;

public class ShoppingList2
{
    public static void main(String[] args)
    {
        HashMap<String, Double> products = new HashMap<>();
        HashMap<String, Integer> bob = new HashMap<>();
        HashMap<String, Integer> alice = new HashMap<>();
        products.put("Milk", 1.07);
        products.put("Rice", 1.59);
        products.put("Eggs", 3.14);
        products.put("Cheese", 12.60);
        products.put("Chicken Breasts", 9.40);
        products.put("Apples", 2.31);
        products.put("Tomato", 2.58);
        products.put("Potato", 1.75);
        products.put("Onion", 1.10);

        bob.put("Milk", 3);
        bob.put("Rice", 2);
        bob.put("Eggs", 2);
        bob.put("Cheese", 1);
        bob.put("Chicken Breasts", 4);
        bob.put("Apples", 1);
        bob.put("Tomato", 2);
        bob.put("Potato", 1);

        alice.put("Rice", 1);
        alice.put("Eggs", 5);
        alice.put("Chicken Breasts", 2);
        alice.put("Apples", 1);
        alice.put("Tomato", 10);

        Double bobPay = 0.;
        Double alicePay = 0.;
        for (String key:products.keySet())
        {
            if (bob.containsKey(key))
            {
                bobPay += bob.get(key)*products.get(key);
            }
            if (alice.containsKey(key))
            {
                alicePay += alice.get(key)*products.get(key);
            }
        }
        System.out.println("Bob spent " + bobPay);
        System.out.println("Alice spent " + alicePay);
        if (bob.get("Rice") > alice.get("Rice"))
        {
            System.out.println("Bob");
        }
        else if (bob.get("Rice") < alice.get("Rice"))
        {
            System.out.println("Alice");
        }
        else
        {
            System.out.println("Equal");
        }
        /*if (bob.get("Potato") > alice.get("Potato"))
        {
            System.out.println("Bob");
        }
        else if (bob.get("Potato") < alice.get("Potato"))
        {
            System.out.println("Alice");
        }
        else
        {
            System.out.println("Equal");
        }*/
        if (bob.size() > alice.size())
        {
            System.out.println("Bob");
        }
        else if (bob.size() < alice.size())
        {
            System.out.println("Alice");
        }
        else
        {
            System.out.println("No one");
        }
        int countBob = 0;
        int countALice = 0;
        for (String key:products.keySet())
        {
            if (bob.containsKey(key))
            {
                countBob += bob.get(key);
            }
            if (alice.containsKey(key))
            {
                countALice += alice.get(key);
            }
        }
        if (countBob > countALice)
        {
            System.out.println("Bob");
        }
        else if (countBob > countALice)
        {
            System.out.println("Alice");
        }
        else
        {
            System.out.println("No one");
        }
    }
}
