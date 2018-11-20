package com.dw.pattern.strategy.vehicle;

import com.dw.pattern.strategy.VehicleType;

/**
 * @author ding.wei
 * 决定旅行乘坐什么交通工具
 */
public class Travel {
    private Vehicle vehicle;
      public  Vehicle byTransport(Vehicle vehicle){
            System.out.println("现在选择什么交通工具去旅行!!");
        this.vehicle = vehicle;
        return  this.vehicle;
    }
    //这个参数，完全可以用Payment这个接口来代替
    //为什么？

    //完美地解决了switch的过程，不需要在代码逻辑中写switch了
    //更不需要写if    else if
    public Vehicle byTransport(VehicleType vehicleType){
        return vehicleType.get();

    }
}
