package tt.com.mouse.cgproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import tt.com.core.Event;
import tt.com.core.EventListener;
import tt.com.mouse.MouseEventCallback;
import tt.com.mouse.MouseEventType;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sc on 2018/11/5.
 */
public class CGProxyMouse extends EventListener implements MethodInterceptor {

    public static Map<String, Enum> m = new HashMap<>();
    static {
        m.put("onClick", MouseEventType.ON_CLICK);
        m.put("onDoubleClick",MouseEventType.ON_DOUBLE_CLICK);
        m.put("onUp",MouseEventType.ON_UP);
        m.put("onDown",MouseEventType.ON_DOWN);
        m.put("onMove",MouseEventType.ON_MOVE);
    }

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        String methodName=method.getName();
        Enum mousyEnm=m.get(methodName);
        Method reMethod = MouseEventCallback.class.getMethod(methodName, new Class<?>[]{Event.class});
        MouseEventCallback mouseEventCallback=new MouseEventCallback();
        addListenner(mousyEnm,mouseEventCallback,reMethod);
        proxy.invokeSuper(obj, args);
        trigger(mousyEnm);
        return null;
    }


}
