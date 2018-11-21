package com.dw.adapter;

/**
 * @author ding.wei
 * 有转换插口
 */
public class AppleSocketAdapter extends  AndroidSocket {
    @Override
    public void doing() {
        super.doing();
        System.out.println("我这里有转换器,转换成苹果充电器插口");
    }
}
