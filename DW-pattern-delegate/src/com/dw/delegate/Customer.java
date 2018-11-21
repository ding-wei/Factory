package com.dw.delegate;

/**
 * @author ding.wei
 * 想吃菜的用户
 */
public class Customer {
    public static void main(String[] args) {
        System.out.println("我想吃炒饭");
       new Waiter().order("炒菜");
    }
}
