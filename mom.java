/** class implements observer class and updates it 
 written by talin arya */
 
public class Mom implements Observer {
	
  private Subject baby;
	
  public Mom(Subject baby) {
    baby.registerObserver(this);
  }
  
  @Override
  public void update(Cry c) {
    if (c.equalsIgnoreCase("Wet")) {
      System.out.println("Mom changes baby");
    }
    if (c.equalsIgnoreCase("Hungry")) {
      System.out.println("Mom cuddles and feeds baby");
    }
    if (c.equalsIgnoreCase("Angry")) {
      System.out.println("Mom hugs and rocks baby, maybe spoiling");
    }
  }
}


