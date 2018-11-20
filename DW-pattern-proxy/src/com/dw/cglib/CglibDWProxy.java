package com.dw.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDWProxy  implements MethodInterceptor{
    public Object getInstance(Class<?> clazz) throws  Exception{

        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return  enhancer.create();

    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        methodProxy.invokeSuper(o,objects);
        return null;
    }


}
