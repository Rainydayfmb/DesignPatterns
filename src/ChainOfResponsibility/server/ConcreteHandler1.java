package ChainOfResponsibility.server;

/**
 * Author:Fmb
 * Description:
 * Date:16:43 2018/10/19
 * Modified By：
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.printf("%s处理请求%d %n", this.getClass().getName(), request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
