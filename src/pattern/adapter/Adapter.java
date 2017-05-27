package pattern.adapter;

import pattern.adapter.Target;

/**
 * @Description:
 * @Author：feipeng
 * @Date: 2017/5/27 14:28
 */

public class Adapter extends Adaptee implements Target {
    @Override
    public void provide2_5() {
        this.provide3_5();
    }
}
