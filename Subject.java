/** subject class implements functions for the observer class
 written by talin arya */

public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObserver();
}
