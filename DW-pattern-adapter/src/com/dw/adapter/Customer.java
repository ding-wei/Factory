package com.dw.adapter;

/**
 * @author ding.wei
 * 用户
 */
public class Customer {
    public static void main(String[] args) {
        System.out.println("我想用安卓充电线");
        new AndroidSocket().doing();
        System.out.println("我想用苹果充电线");
        new AppleSocketAdapter().doing();
    }
}
