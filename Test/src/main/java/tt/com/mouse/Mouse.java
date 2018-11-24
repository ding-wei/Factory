package tt.com.mouse;


import tt.com.core.EventListener;

/**
 * Created by sc on 2018/11/5.
 */
public class Mouse extends EventListener {

    public void onClick(){
        System.out.println("鼠标单击");
        //this.trigger(MouseEventType.ON_CLICK);
    }

    public void doubleClick(){
        System.out.println("鼠标双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up(){
        System.out.println("鼠标弹起");
        this.trigger(MouseEventType.ON_UP);
    }

    public void down(){
        System.out.println("鼠标按下");
        this.trigger(MouseEventType.ON_DOWN);
    }


    public void wheel(){
        System.out.println("鼠标滚动");
        this.trigger(MouseEventType.ON_WHEEL);
    }

    public void move(){
        System.out.println("鼠标移动");
        this.trigger(MouseEventType.ON_MOVE);
    }

    public void over(){
        System.out.println("鼠标悬停");
        this.trigger(MouseEventType.ON_OVER);
    }
}
