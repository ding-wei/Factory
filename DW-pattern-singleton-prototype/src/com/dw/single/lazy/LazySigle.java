package com.dw.single.lazy;

/**
 * @author ding.wei
 * 懒汉模式在于你用的时候在给你
 */
public class LazySigle {
 public LazySigle getInstanc(LazySigle lazySigle){
     if(null == lazySigle){
         lazySigle = new LazySigle();
     }
     return  lazySigle;
 }
}
