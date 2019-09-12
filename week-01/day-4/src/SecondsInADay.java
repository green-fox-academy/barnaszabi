public class SecondsInADay
{
    public static void main(String[] args)
    {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsADay=24*60*60;
        int secondsPassed=((currentHours*60*60)+(currentMinutes*60)+currentSeconds);
        int remainingSeconds=secondsADay-secondsPassed;
        System.out.println(remainingSeconds);
    }
}
