package Observer.subject;


import Observer.observer.Observer;

/**
 * Author:Fmb
 * Description:
 * Date:20:49 2018/11/20
 * Modified By：
 */
public abstract class Subject {

    protected String subjectAction;

    abstract void attach(Observer observer);

    abstract void detach(Observer observer);

    abstract void notifyObservers();

    public String getSubjectAction() {
        return subjectAction;
    }

    public void setSubjectAction(String subjectAction) {
        this.subjectAction = subjectAction;
    }

    public Subject(String subjectAction) {
        this.subjectAction = subjectAction;
    }
}
