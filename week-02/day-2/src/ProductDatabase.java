import java.util.HashMap;

public class ProductDatabase
{

    public static String mostExpensive(HashMap<String, Integer> map)
    {
        Integer maxValue = 0;
        String maxKey = "";
        for (String key:map.keySet())
        {
            if (map.get(key) > maxValue)
            {
                maxValue = map.get(key);
                maxKey=key;
            }
        }
        return maxKey;
    }
    public static double avg(HashMap<String, Integer> map)
    {
        double sum = 0;
        for (String key: map.keySet())
        {
            sum += (double)map.get(key);
        }
        return (sum/map.size());
    }
    public static int productsBelow300(HashMap<String, Integer> map)
    {
        int counter = 0;
        for (String key: map.keySet())
        {
            if (map.get(key) < 300)
            {
                counter++;
            }
        }
        return counter;
    }
    public static void exactly125(HashMap<String, Integer> map)
    {
        int count = 0;
        for (String key:map.keySet())
        {
            if (map.get(key) == 125)
            {
                count++;
            }
        }
        if (count > 0)
        {
            System.out.println("There are products for 125");
        }
        else
        {
            System.out.println("There isn't any product for 125");
        }
    }
    public static String leastExpensive(HashMap<String, Integer> map, String max)
    {
        String minKey = max;
        Integer minValue = map.get(minKey);
        for (String key:map.keySet())
        {
            if (map.get(key) < minValue)
            {
                minValue = map.get(key);
                minKey=key;
            }
        }
        return minKey;
    }
    public static void main(String[] args)
    {
        HashMap<String, Integer> database = new HashMap<>();
        database.put("Eggs", 200);
        database.put("Milk", 200);
        database.put("Fish", 400);
        database.put("Apples", 150);
        database.put("Bread", 50);
        database.put("Chicken", 550);
        System.out.println("The prize of the  fish is " + database.get("Fish"));
        String maxKey = mostExpensive(database);
        System.out.println("The most expensive product is " + maxKey + " it costs " + database.get(maxKey));
        System.out.println("The average prize is " + avg(database));
        System.out.println("There are " + productsBelow300(database) + " products below 300");
        exactly125(database);
        String minKey = leastExpensive(database, maxKey);
        System.out.println("The least expensive product is " + minKey + " it costs " + database.get(minKey));
    }
}
