package ChainOfResponsibility.server;

/**
 * Author:Fmb
 * Description:
 * Date:16:35 2018/10/19
 * Modified By：
 */
public abstract class Handler {

    //持有后继的责任
    protected Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
