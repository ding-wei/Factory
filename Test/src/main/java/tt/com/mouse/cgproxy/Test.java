package tt.com.mouse.cgproxy;


import tt.com.mouse.Mouse;

/**
 * Created by sc on 2018/11/5.
 */
public class Test {

    public static void main(String[] args) {
        Mouse mouse = (Mouse) new CGProxyMouse().getInstance(Mouse.class);
        mouse.onClick();
    }
}
