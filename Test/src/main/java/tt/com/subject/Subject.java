package tt.com.subject;


import tt.com.core.EventListener;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2018/3/17.
 */
public class Subject extends EventListener {

    //通常的话，采用动态里来实现监控，避免了代码侵入
    public void add(){
        System.out.println("调用添加的方法");
        //trigger(SubjectEventType.ON_ADD);
    }

    public void remove(){
        System.out.println("调用删除的方法");
        //trigger(SubjectEventType.ON_RMOVE);
    }

  /*  @Override
    public void addListenner(Enum eventType, Object target, Method callback) {
        super.addListenner(eventType, target, callback);
    }

    public void addListenner(){

    }*/
}
