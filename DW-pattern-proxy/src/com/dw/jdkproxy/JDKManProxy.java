package com.dw.jdkproxy;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKManProxy implements InvocationHandler {
    public Object obj;
    public Object getInstance(Object object) throws Exception{
        this.obj =object;
        Class<?> clzz = obj.getClass();
        return Proxy.newProxyInstance(clzz.getClassLoader(),clzz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是58：我要给你找工作，现在已经拿到你的简历");
        System.out.println("开始投递");

        method.invoke(this.obj,args);

        System.out.println("安排面试");

        return null;
    }
}
