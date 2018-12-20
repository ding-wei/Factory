package com.dw.prototype.simple;

public class Test {
    public static void main(String[] args) {
        CloneSun cloneSun = new CloneSun();
        cloneSun.setAge(12);
        cloneSun.setName("孙悟空");
        try {
            CloneSun c2 = (CloneSun) cloneSun.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
