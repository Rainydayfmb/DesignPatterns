package ChainOfResponsibility.scene.server;

/**
 * Author:Fmb
 * Description:
 * Date:17:24 2018/10/19
 * Modified By：
 */
public class Request {

    private String requestType;

    private String requestContent;

    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestType='" + requestType + '\'' +
                ", requestContent='" + requestContent + '\'' +
                ", number=" + number +
                '}';
    }
}
