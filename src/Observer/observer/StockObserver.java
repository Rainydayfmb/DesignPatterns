package Observer.observer;

import Observer.subject.Subject;

/**
 * Author:Fmb
 * Description:
 * Date:17:41 2018/11/20
 * Modified By：
 */
public class StockObserver implements Observer{

    private String name;
    private Subject subject;

    public StockObserver(String name, Subject suject) {
        this.name = name;
        this.subject = suject;
    }

    @Override
    public void update(){
        System.out.println(subject.getSubjectAction()+"  "
                       +name+" 关闭股市行情，继续工作");
    }
}
