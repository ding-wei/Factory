package com.dw.pattern.decorater.old;

public class Cook implements  Person {
    @Override
    public void fryCF() {
        System.out.println("我会做炒饭");
    }

    @Override
    public void fryCM() {
        System.out.println("我会做炒面");
    }
}
