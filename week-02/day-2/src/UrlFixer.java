public class UrlFixer {
    public static void main(String... args)
    {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.substring(0,4) + ":" + url.substring(5).replace("bots", "odds");
        System.out.println(url);
    }
}