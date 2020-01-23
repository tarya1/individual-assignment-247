/** Copyright 2020, Written by Talin Arya
 Dog Robot class that extends Robot class */
class DogRobot extends Robot {

    public DogRobot(String name) {
        super(name);
        moveBehavior = new CrawlBehavior();
        talkBehavior = new BarkBehavior();
    }

    @Override
    public String toString() {
        return name + " is a happy dog robot";
    }
}
