package cn.dingwei.abstractfactory;

import cn.dingwei.factory.*;

public class XianShiQiFactoryTest {
    public static void main(String[] args) {
        XianShiQiFactory xianShiQiFactory = new XianShiQiFactory();
        //获取航嘉显示器
        System.out.println("我想要"+xianShiQiFactory.getDell().getName());

    }
}
