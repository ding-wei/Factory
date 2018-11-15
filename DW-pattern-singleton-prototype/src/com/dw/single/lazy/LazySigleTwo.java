package com.dw.single.lazy;

/**
 * @author ding.wei
 * 懒汉模式在于你用的时候在给你
 */
public class LazySigleTwo {
 public synchronized LazySigleTwo getInstanc(LazySigleTwo lazySigle){
     if(null == lazySigle){
         lazySigle = new LazySigleTwo();
     }
     return  lazySigle;
 }
}
