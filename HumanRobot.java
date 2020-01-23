/** Copyright 2020, Written by Talin Arya 
Robot's child class */
public class HumanRobot extends Robot {
    public HumanRobot(String name) {
        super(name);
        moveBehavior = new WalkBehavior();
        talkBehavior = new SpeakBehavior();
    }

    @Override
    public String toString() {
        return name + " is a typical human robot";
    }
}
