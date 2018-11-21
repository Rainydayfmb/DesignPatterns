package ChainOfResponsibility.scene.server;

/**
 * Author:Fmb
 * Description:
 * Date:17:27 2018/10/19
 * Modified By：
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType() == "请假" && request.getNumber() <= 2) {
            System.out.printf("%s:%s数量%d天被批准 %n", this.getName(), request.getRequestContent(), request.getNumber());
        }else{
            if (superior !=null){
                superior.requestApplications(request);
            }
        }
    }
}
