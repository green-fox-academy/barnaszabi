public class Cuboid
{
    public static void main(String[] args)
    {
        double a=5;
        double b=7;
        double c=10;
        double volume=a*b*c;
        double surface=2*(a*b+b*c+a*c);
        System.out.println("Surface Area: " +surface);
        System.out.println("Volume: " +volume);
    }
}
