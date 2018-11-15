package com.dw.single.hungry;

/**
 * @author ding.wei
 * 饿汉模式就是直接先给你
 */
public class HungrySingle {
    public static final  HungrySingle hungrySingle = new HungrySingle ();
    public void showMessage(){
        System.out.println("Hello World!");
    }

}
