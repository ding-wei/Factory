package com.dw.observe.proxy;

import com.dw.observe.core.Event;
import com.dw.observe.core.EventLisenter;
import com.dw.observe.mouse.MouseEventCallback;
import com.dw.observe.mouse.MouseEventType;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class MouseProxy extends EventLisenter implements MethodInterceptor {
    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return  enhancer.create();


    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        String name = method.getName();
        MouseEventCallback callback = new MouseEventCallback();
        Method onClick = MouseEventCallback.class.getMethod("onClick", Event.class);
        addLisenter(MouseEventType.ON_CLICK, callback,onClick);

        methodProxy.invokeSuper(o,objects);
        this.trigger(MouseEventType.ON_CLICK);
        return null;
    }
}
