public class Colors
{
    public static void main(String[] args)
    {
        // - Create a two dimensional array
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`
        String[][]colors = new String[3][5];
        colors[0][0] = "lime";
        colors[0][1] = "forest green";
        colors[0][2] = "olive";
        colors[0][3] = "pale green";
        colors[0][4] = "spring green";
        colors[1][0] = "orange red";
        colors[1][1] = "red";
        colors[1][2] = "tomato";
        colors[2][0] = "orchid";
        colors[2][1] = "violet";
        colors[2][2] = "pink";
        colors[2][3] = "hot pink";
    }
}
