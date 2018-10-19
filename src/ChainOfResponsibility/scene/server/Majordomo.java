package ChainOfResponsibility.scene.server;

/**
 * Author:Fmb
 * Description:
 * Date:17:41 2018/10/19
 * Modified By：
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == "请假" && request.getNumber() <= 5) {
            System.out.printf("%s:%s数量%d被批准 %n", this.getName(), request.getRequestContent(), request.getNumber());
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }
}
