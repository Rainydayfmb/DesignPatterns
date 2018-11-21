package Observer.subject;

import Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Fmb
 * Description:
 * Date:10:31 2018/11/21
 * Modified By：
 */
public class Security extends Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }

    public Security(String subjectAction) {
        super(subjectAction);
    }
}
