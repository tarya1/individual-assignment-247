/** baby class implements subject class and also defines all the constructors 
written by talin arya */

import java.util.ArrayList;

enum Cry {
   hungry, wet, angry
}

public class Baby implements Subject {
  
  private ArrayList<Observer> observers;
  Cry c;

  public Baby() {
    observers = new ArrayList<Observer>();
    System.out.println("A baby is born");
  }
  
  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }
 
  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }
  
  @Override
  public void notifyObserver() {
    for (Observer o : observers) {
      obs.update(c);
    }
  }
  
  public void angryCry() {
    c = c.angry;
    System.out.println(" ");
    System.out.println("The baby is angry");
    notifyObserver();
  }
  
  public void hungryCry() {
    c = c.hungry;
    System.out.println(" ");
    System.out.println("The baby is hungry");
    notifyObserver();
  }
  
  public void wetCry() {
    c = c.Wet;
    System.out.println(" ");
    System.out.println("The baby is wet");
    notifyObserver();
  }
}
