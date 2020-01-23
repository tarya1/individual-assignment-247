/**Copyright 2020, Written by Talin Arya 
returns what the robot will respond with the given strings */
import java.util.Random;

public class SpeakBehavior implements TalkBehavior {
    Random rand = new Random();
    String[] str1 = {"Hello", "How are you?", "Good day"};

    public String talk() {
        int rS = rand.nextInt(3);
        return str[rS];
    }
}
