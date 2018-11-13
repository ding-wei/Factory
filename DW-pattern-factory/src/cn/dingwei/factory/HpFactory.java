package cn.dingwei.factory;

import cn.dingwei.Hp;
import cn.dingwei.XianShiQi;
/**
 * @author ding.wei
 * 生产惠普显示器的工厂
 */
public class HpFactory implements Factory{
    @Override
    /**
     * 获得显示器
     * @return
     */
    public XianShiQi getXianShiQi() {
        return new Hp();
    }
}
