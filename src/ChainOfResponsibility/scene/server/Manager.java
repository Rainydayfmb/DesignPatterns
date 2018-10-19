package ChainOfResponsibility.scene.server;

/**
 * Author:Fmb
 * Description:
 * Date:17:17 2018/10/19
 * Modified By：
 */
public abstract class Manager {

    protected String name;

    protected  Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
