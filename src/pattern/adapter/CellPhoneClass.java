package pattern.adapter;

/**
 * @Description:
 * @Author：feipeng
 * @Date: 2017/5/27 14:32
 */

public class CellPhoneClass {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.provide2_5();
    }
}
