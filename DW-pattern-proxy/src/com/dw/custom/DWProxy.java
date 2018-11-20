package com.dw.custom;

import java.lang.reflect.Method;

public class DWProxy {
    public static final String ln="\r\n";
    public static Object newProxyInstance(DWClassLoader classLoader,Class<?> [] interfaces,DWInvocationHandler h){
        return null;
    }
    public static  String gengeratesrc(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupaoedu.vip.pattern.proxy.custom;" + ln);
        sb.append("import com.gupaoedu.vip.pattern.proxy.staticed.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("GPInvocationHandler h;" + ln);

        sb.append("public $Proxy0(GPInvocationHandler h) { " + ln);

        sb.append("this.h = h;");

        sb.append("}" + ln);


        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}");
            sb.append("}");
        }

        sb.append("}" + ln);

        return sb.toString();

    }
}
