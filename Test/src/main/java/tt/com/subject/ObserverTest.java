package tt.com.subject;


import tt.com.core.Event;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2018/3/17.
 */
public class ObserverTest {

    public static void main(String[] args) {

        try{

            //观察者
            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});


            //这里写Lily
            Subject subject = new Subject();
            subject.addListenner(SubjectEventType.ON_ADD,observer,advice);
            subject.addListenner(SubjectEventType.ON_EDIT,observer,advice);
            subject.addListenner(SubjectEventType.ON_RMOVE,observer,advice);
            subject.addListenner(SubjectEventType.ON_QUERY,observer,advice);

            subject.add();
            subject.remove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
