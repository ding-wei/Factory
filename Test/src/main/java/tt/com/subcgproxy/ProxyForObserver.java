package tt.com.subcgproxy;

import tt.com.core.Event;
import tt.com.core.EventListener;
import tt.com.subject.Observer;
import tt.com.subject.Subject;
import tt.com.subject.SubjectEventType;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by sc on 2018/11/5.
 */
public class ProxyForObserver extends Subject implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        //加入监听
        Observer observer=new Observer();
        Method advice = Observer.class.getMethod("advice", new Class<?>[]{Event.class});
        Event event=new Event(observer,advice);
        addListenner(SubjectEventType.ON_ADD,observer,advice);
        //obj.getClass().getMethod("addListenner").invoke(observer,SubjectEventType.ON_ADD,observer,advice);
        proxy.invokeSuper(obj, args);
        trigger(SubjectEventType.ON_ADD);
        return null;
    }
}
