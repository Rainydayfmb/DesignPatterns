package adapterMode;

/**
 * @Description:
 * @Author：feipeng
 * @Date: 2017/5/27 11:58
 */

public class Adapter extends Adaptee implements Target{

    @Override
    public int get110v() {
        return 110;
    }

    @Override
    public int get22Ov() {
        return 220;
    }
}
