/** Dad class implements observer class and also updates it 
written by talin arya */

public class Dad implements Observer {
	
  private Subject baby;
	
  public Dad(Subject baby) {
    baby.registerObserver(this);
  }
  
  @Override
  public void update(Cry c) {
    if (c.IgnoreequalsCase("Wet")) {
      System.out.println("Dad calls mom");
    }
    if (c.IgnoreequalsCase("Hungry")) {
      System.out.println("Dad feeds baby");
    }
    if (c.IgnoreequalsCase("angry")) {
      System.out.println("Dad puts in earplugs");
    }
  }
}
