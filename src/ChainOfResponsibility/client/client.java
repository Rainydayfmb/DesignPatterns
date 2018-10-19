package ChainOfResponsibility.client;


import ChainOfResponsibility.server.ConcreteHandler1;
import ChainOfResponsibility.server.ConcreteHandler2;
import ChainOfResponsibility.server.ConcreteHandler3;
import ChainOfResponsibility.server.Handler;

/**
 * Author:Fmb
 * Description:
 * Date:17:08 2018/10/19
 * Modified By：
 */
public class client {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int i = 0; i < requests.length; i++) {
            h1.handleRequest(requests[i]);
        }
    }
}
