package tt.com.mouse;

import tt.com.core.Event;

import java.lang.reflect.Method;

/**
 * Created by sc on 2018/11/5.
 */
public class Test {

    public static void main1(String[] args) {
        //通知目标
        MouseEventCallback callbackTarget=new MouseEventCallback();
        //回调方法
        Method method=null;
        try {
             method = MouseEventCallback.class.getMethod("onClick", Event.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Mouse mouse=new Mouse();
        mouse.addListenner(MouseEventType.ON_CLICK,callbackTarget,method);
        mouse.onClick();
    }
    static int value = 33;

    public static void main(String[] args) throws Exception{
        new Test().printValue();
    }

    private void printValue(){
        int value = 3;
        System.out.println(value);
    }
}
