package com.dw.test;

public class pp<T> {
    private T ob; // 定义泛型成员变量

    public pp(T ob) {

        this.ob = ob;

    }

    public T getOb() {

        return ob;

    }


    public void setOb(T ob) {

        this.ob = ob;

    }


    public void showType() {

        System.out.println("T的实际类型是: " + ob.getClass().getName());

    }

}
