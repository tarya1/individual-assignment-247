/** Written by Talin Arya 
returns what the robot will say from the given strings */
import java.util.Random;

public class SimpleSpeakBehavior implements TalkBehavior {
    Random randist = new Random();
    String[] str2 = {"Wall-E", "EVA!", "Pop", "Eva?", "Eee-va"};

    public String talk() {
        int rT = rand.nextInt(4);
        return str[rT];
    }
}
