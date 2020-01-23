/** Written By Talin Arya 
abstract class of all the child classes */
abstract class Robot {
    protected String name;
    protected MoveBehavior moveBehavior;
    protected TalkBehavior talkBehavior;

    public Robot(String name) {
        this.name = name;
    }

    public abstract String toString();

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void setTalkBehavior(TalkBehavior talkBehavior) {
        this.talkBehavior = talkBehavior;
    }
    public String move() {
        return moveBehavior.move();
    }
    public String talk() {
        return talkBehavior.talk();
    }
}
