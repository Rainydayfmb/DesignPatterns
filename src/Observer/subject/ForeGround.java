package Observer.subject;

import Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Fmb
 * Description:前台
 * Date:17:40 2018/11/20
 * Modified By：
 */
public class ForeGround extends Subject {

    private List<Observer>  observers = new ArrayList<>();

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

    public ForeGround(String subjectAction) {
        super(subjectAction);
    }
}
