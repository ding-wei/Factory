package com.dw.pattern.strategy.vehicle;

/**
 * @author ding.wei
 * 选择乘坐高铁去旅行
 */
public class HighSpeedRail implements Vehicle {
    @Override
    public void chooseVehicle() {
        System.out.println("选择高铁去旅行!!");
    }
}
