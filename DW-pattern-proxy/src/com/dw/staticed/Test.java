package com.dw.staticed;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        HuangniuProxy huangniuProxy = new HuangniuProxy(person);
        huangniuProxy.need();
    }
}
