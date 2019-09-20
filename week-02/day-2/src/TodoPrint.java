public class TodoPrint
{
    public static void main(String... args)
    {
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        String todoText = " - Buy milk\n";
        StringBuilder s = new StringBuilder(todoText);
        todoText = String.valueOf(s.insert(0, "My todo: \n").append(" - Download games\n    - Diablo"));
        System.out.println(todoText);
    }
}
