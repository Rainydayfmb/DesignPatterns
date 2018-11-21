package Observer.client;

import Observer.observer.NBAObserver;
import Observer.observer.StockObserver;
import Observer.subject.ForeGround;
import Observer.subject.Security;

/**
 * Author:Fmb
 * Description:
 * Date:17:56 2018/11/20
 * Modified By：
 */
public class client {

    public static void main(String[] args) {

        ForeGround foreGround = new ForeGround("我是前台小妹，老板回来了");
        Security security = new Security("我是保安小哥，老板回来了");
        foreGround.attach(new NBAObserver("W",foreGround));
        foreGround.attach(new StockObserver("L",foreGround));
        security.attach(new StockObserver("H",security));

        foreGround.notifyObservers();
        security.notifyObservers();
    }
}
