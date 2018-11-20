package com.dw.pattern.strategy.vehicle;

/**
 * 选择开汽车去游玩
 */
public class Car implements Vehicle {
    @Override
    public void chooseVehicle() {
        System.out.println("选择开汽车去!!");
    }
}
