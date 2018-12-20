package cn.dingwei.simple;

import cn.dingwei.Dell;
import cn.dingwei.Hp;
import cn.dingwei.MingJi;
import cn.dingwei.SanXing;

/**
 * @author ding.wei
 * 简单工厂实现
 */
public class SimpleFactory {
    public String getXianShiQi(String name){
        if(name.equals("明基")){
            return new MingJi().getName();
        }else if (name.equals("戴尔")){
            return new Dell().getName();
        }else if (name.equals("三星")){
            return new SanXing().getName();
        }else if (name.equals("惠普")){
            return new Hp().getName();
        }else{
            System.out.println("出错了");
            return  "出错了";
        }
    }
}
