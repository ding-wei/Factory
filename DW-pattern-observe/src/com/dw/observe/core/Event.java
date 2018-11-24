package com.dw.observe.core;

import java.lang.reflect.Method;

public class Event {
    //事件源
    private Object sourse;
    //通知目标
    private Object target;
    //回调
    private Method callBack;
    //触发
    private String trigger;

    private long Time;

    public Event(Object target, Method callBack) {
        this.target = target;
        this.callBack = callBack;
    }

    public Object getSourse() {
        return sourse;
    }

    public void setSourse(Object sourse) {
        this.sourse = sourse;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallBack() {
        return callBack;
    }

    public void setCallBack(Method callBack) {
        this.callBack = callBack;
    }

    public String getTrigger() {
        return trigger;

    }

    Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return Time;
    }

    Event setTime(long time) {
        Time = time;
        return this;
    }
}
