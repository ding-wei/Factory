package com.dw.staticed;

public class HuangniuProxy {
    private Person person;

    public  HuangniuProxy(Person person) {

       this.person = person;
    }
    public void need(){
        System.out.println("由黄牛去帮我买票");
        person.need();
    }

}
