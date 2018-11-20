package com.dw.cglib;

public class CgLibTest {
    public static void main(String[] args) {
        try {
            DingWei dingWei = (DingWei)new CglibDWProxy().getInstance(DingWei.class);
            dingWei.iLOVE();
            System.out.println("--------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
