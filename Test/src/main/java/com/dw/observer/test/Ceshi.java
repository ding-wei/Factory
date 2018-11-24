package com.dw.observer.test;

import java.lang.reflect.Method;

public class Ceshi {
    public static void main(String[] args) {
        int name = 1;
        try {
//            Class clazz = Aa.class;//Class.forName("com.dw.observer.test.Aa");
//            Method method = clazz.getMethod("sys", new Class[]{int.class});
//            Object ab = method.invoke(clazz.newInstance(), new Object[]{name});
//            System.out.println(ab);
            Aa a = new Aa();
            Class clazz1 = Class.forName("com.dw.observer.test.Aa");
            Class clazz2 = a.getClass();//Class.forName("com.dw.observer.test.Aa");
            Class clazz3 = Aa.class;//Class.forName("com.dw.observer.test.Aa");
            System.out.println(clazz1 == clazz3);
            System.out.println(clazz2);
            System.out.println(clazz2.newInstance());
            //clazz1.getDeclaredMethod();
            System.out.println(String.class.newInstance().isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
