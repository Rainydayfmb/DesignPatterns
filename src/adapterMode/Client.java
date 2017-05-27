package adapterMode;

/**
 * @Description:
 * @Author：feipeng
 * @Date: 2017/5/27 13:50
 */

public class Client {
    public static void main(String[] args) {
        new Client().test();
    }

    public void test(){
        Target target=new Adapter();
        int v1=target.get110v();
        int v2=target.get22Ov();
        System.out.println("v1="+v1+",v2="+v2);
    }
}
