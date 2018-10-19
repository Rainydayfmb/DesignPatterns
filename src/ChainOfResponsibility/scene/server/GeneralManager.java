package ChainOfResponsibility.scene.server;

/**
 * Author:Fmb
 * Description:
 * Date:17:35 2018/10/19
 * Modified By：
 */
public class GeneralManager extends  Manager{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == "请假") {
            System.out.printf("%s:%s数量%d被批准 %n", this.getName(), request.getRequestContent(), request.getNumber());
        } else if (request.getRequestType() == "加薪" && request.getNumber() <= 500) {
            System.out.printf("%s:%s数量%d被批准 %n", this.getName(), request.getRequestContent(), request.getNumber());
        } else if (request.getRequestType() == "加薪" && request.getNumber() > 500) {
            System.out.printf("%s:%s数量%d再说吧 %n", this.getName(), request.getRequestContent(), request.getNumber());
        }
    }
}
