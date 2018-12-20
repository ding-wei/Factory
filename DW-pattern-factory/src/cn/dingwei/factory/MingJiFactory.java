package cn.dingwei.factory;

import cn.dingwei.MingJi;
import cn.dingwei.XianShiQi;

public class MingJiFactory   implements  Factory {
    @Override
    public XianShiQi getXianShiQi() {
        return new MingJi();
    }
}
