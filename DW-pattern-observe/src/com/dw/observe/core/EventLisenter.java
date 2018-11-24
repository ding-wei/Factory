package com.dw.observe.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 时间的注册和监听
 */
public class EventLisenter {
    //Map相当于注册器
    protected Map<Enum,Event> events = new HashMap<>();
    public void addLisenter(Enum enumType, Object target, Method callback){
        //注册事件
        //用反射调用这个方法
        events.put(enumType,new Event(target,callback));
    }
    public void  trigger(Event event){
        event.setSourse(this);
        event.setTime(System.currentTimeMillis());
        try {
            event.getCallBack().invoke(event.getTarget(),event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    protected  void trigger(Enum call){
        if(!events.containsKey(call)){return;}
        trigger(this.events.get(call).setTrigger(call.toString()));
    }
}
