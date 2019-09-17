import java.util.HashMap;
public class ProductDatabase2
{

    public static void main(String[] args)
    {
        HashMap<String, Integer> database = new HashMap<>();
        database.put("Eggs", 200);
        database.put("Milk", 200);
        database.put("Fish", 400);
        database.put("Apples", 150);
        database.put("Bread", 50);
        database.put("Chicken", 550);
        for (String key: database.keySet())
        {
            if (database.get(key) < 201)
            {
                System.out.println(key);
            }
        }
        for (String key:database.keySet())
        {
            if (database.get(key) > 150)
            {
                System.out.println(key + " " + database.get(key));
            }
        }
    }
}
