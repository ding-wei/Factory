package cn.dingwei.abstractfactory;

import cn.dingwei.*;

/**
 * @author ding.wei
 * 生产显示器抽象工厂实现
 */
public class XianShiQiFactory  extends AbstractXianShiQiFactory{
    @Override
    XianShiQi getMingJi() {
        return new MingJi();
    }

    @Override
    XianShiQi getSanxing() {
        return new SanXing();
    }

    @Override
    XianShiQi getDell() {
        return new Dell();
    }

    @Override
    XianShiQi getHp() {
        return new Hp();
    }

    @Override
    XianShiQi getHangjia() {
        return new Hangjia();
    }

    @Override
    XianShiQi getHangJia() {
        return new Hangjia();
    }
}
