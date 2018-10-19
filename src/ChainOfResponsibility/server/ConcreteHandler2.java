package ChainOfResponsibility.server;

/**
 * Author:Fmb
 * Description:
 * Date:16:57 2018/10/19
 * Modified By：
 */
public class ConcreteHandler2 extends Handler{

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.printf("%s处理请求%d %n", this.getClass().getName(), request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
