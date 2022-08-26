package Pattern.Observer;

import java.util.HashSet;

public class Observable {
    private HashSet<Observer> observers;

    public void subscribe(Observer observer){
        observer.add(observer);
    }
    public void unsubscribe(Observer observer){
        observer.remove(observer);
    }
    public void notifyObservers(){ //оповещение
        observers.forEach(observer -> observer.update());
    }
}
