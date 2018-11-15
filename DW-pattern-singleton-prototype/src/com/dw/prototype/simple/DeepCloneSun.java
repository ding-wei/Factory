package com.dw.prototype.simple;

import java.util.HashMap;
import java.util.Map;

public class DeepCloneSun implements  Cloneable{

    public Map<String,Object> message = new HashMap<>();
    public Bean bean;
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    protected DeepCloneSun clone() throws CloneNotSupportedException {
         DeepCloneSun cs = (DeepCloneSun) super.clone();
         Bean ben = (Bean) bean.clone();
         cs.bean = ben;
         return cs;
     }

}
