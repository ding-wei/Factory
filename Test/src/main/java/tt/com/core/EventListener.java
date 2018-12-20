package tt.com.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sc on 2018/11/5.
 */
public class EventListener {

    //map相当于一个注册器
    protected Map<Enum, Event> events = new HashMap<>();

    public void addListenner(Enum eventType, Object target, Method callback){
        //注册事件
        //用反射调用这个方法
        events.put(eventType,new Event(target,callback));
    }

    private void trigger(Event event) {
      //  event.setSource("souce1");
        event.setTime(System.currentTimeMillis());
        try {
            //获得回调方法
            event.getCallback().invoke(event.getTarget(),event);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void trigger(Enum call){
        if(!this.events.containsKey(call)){
            return;
        }
        Event event = events.get(call);
        //设置触发
        event.setTrigger(call.toString());
        trigger(event);
    }

    protected void trigger(Enum call,String aaa){
        if(!this.events.containsKey(call)){
            return;
        }
        Event event = events.get(call);
        //设置触发
        event.setTrigger(call.toString());
        trigger(event);
    }

}
