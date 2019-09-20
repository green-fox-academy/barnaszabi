public class UrlFixer {
    public static void main(String... args)
    {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        //url = url.substring(0,4) + ":" + url.substring(5).replace("bots", "odds");
        url = url.replace("s","s:").replace("bots", "odds");

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(url);
    }
}