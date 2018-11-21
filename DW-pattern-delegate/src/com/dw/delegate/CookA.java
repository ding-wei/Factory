package com.dw.delegate;

public class CookA implements Cook {

    @Override
    public void cookDish() {
        System.out.println("我来做炒菜");
    }
}
