package ChainOfResponsibility.server;

/**
 * Author:Fmb
 * Description:
 * Date:17:00 2018/10/19
 * Modified By：
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.printf("%s处理请求%d %n", this.getClass().getName(), request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
