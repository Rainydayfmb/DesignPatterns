package Observer.observer;

import Observer.subject.Subject;

/**
 * Author:Fmb
 * Description:
 * Date:17:41 2018/11/20
 * Modified By：
 */
public class NBAObserver implements Observer{

    private String name;
    private Subject subject;

    public NBAObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update(){
        System.out.println(subject.getSubjectAction()+"  "
                       +name+" 关闭NBA，继续工作");
    }
}
