public class TodoPrint
{
    public static void main(String... args)
    {
    String todoText = " - Buy milk\n";
    StringBuilder s = new StringBuilder(todoText);
    todoText = String.valueOf(s.insert(0, "My todo: \n").append(" - Download games\n    - Diablo"));
    System.out.println(todoText);
}
}
