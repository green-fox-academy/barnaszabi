import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance
{
    public static int sum(ArrayList list)
    {
        int sum = 0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += (int)list.get(i);
        }
        return sum;
    }
    public static int max(ArrayList list)
    {
        int max=0;
        for (int i = 0; i < list.size(); i++)
        {
            if ((int)list.get(i) > (int)list.get(max))
            {
                max=i;
            }
        }
        return (int)list.get(max);
    }
    public static int min(ArrayList list)
    {
        int min=0;
        for (int i = 0; i < list.size(); i++)
        {
            if ((int)list.get(i) < (int)list.get(min))
            {
                min=i;
            }
        }
        return (int)list.get(min);
    }
    public static int avg(ArrayList list)
    {
        int sum=0;
        for (int i = 0; i < list.size(); i++)
        {
            sum += (int)list.get(i);
        }
        return (sum/list.size());
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> finances = new ArrayList<>();
        finances.addAll(Arrays.asList(500, 1000, 1250, 175, 800 ,120));
        System.out.println("You spent: " + sum(finances));
        System.out.println("Your biggest expense was: " + max(finances));
        System.out.println("Your cheapest spending was: " + min(finances));
        System.out.println("Your average spending was: " + avg(finances));
    }
}
