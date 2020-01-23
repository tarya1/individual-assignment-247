/** Copyright 2020, Written by Talin Arya
child class of TalkBehavior that returns what the dog says */

public class BarkBehavior implements TalkBehavior {
    public String talk() {
        return "Woof Woof Woof";
    }
}
