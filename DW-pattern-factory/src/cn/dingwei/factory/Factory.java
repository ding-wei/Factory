package cn.dingwei.factory;

import cn.dingwei.XianShiQi;

/**
 * @author ding.wei
 * 模仿spring 工厂实现
 */
public interface Factory {
    /**
     * 获得显示器
     * @return
     */
  XianShiQi getXianShiQi();

}
