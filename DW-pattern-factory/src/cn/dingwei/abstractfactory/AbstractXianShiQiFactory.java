package cn.dingwei.abstractfactory;

import cn.dingwei.XianShiQi;

/**
 * @author ding.wei
 * 生产显示器的抽象工程
 */
public abstract class AbstractXianShiQiFactory {
   abstract XianShiQi getMingJi();
   abstract XianShiQi getSanxing();
   abstract XianShiQi getDell();
   abstract XianShiQi getHp();
   abstract  XianShiQi getHangjia();
   //增加航嘉显示器
   abstract  XianShiQi getHangJia();


   public void aa(){
       System.out.println("32423423");
   }
}
