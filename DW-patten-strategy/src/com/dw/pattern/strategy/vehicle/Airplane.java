package com.dw.pattern.strategy.vehicle;

/**
 * @author ding.wei
 * 选择乘坐飞机去旅行
 */
public class Airplane implements  Vehicle{
    @Override
    public void chooseVehicle() {
        System.out.println("乘坐飞机去旅行");
    }
}
