package com.dw.single.register;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author ding.wei
 * 把类名放进Map 从MapH中取
 */
public class Register {

    private static Map<String,Object> singletonMap = new ConcurrentHashMap();


    public  Object getInstanc(String ClassName){
        if(!singletonMap.containsKey(ClassName)){
            Object obj = null;
            try {
                obj = Class.forName(ClassName).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            singletonMap.put(ClassName,obj);
            return obj;
        }else{
            return singletonMap.get(ClassName);
        }


    }


}
