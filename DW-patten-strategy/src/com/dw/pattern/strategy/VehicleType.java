package com.dw.pattern.strategy;

import com.dw.pattern.strategy.vehicle.Airplane;
import com.dw.pattern.strategy.vehicle.Car;
import com.dw.pattern.strategy.vehicle.HighSpeedRail;
import com.dw.pattern.strategy.vehicle.Vehicle;

public enum  VehicleType {
    Airplane(new Airplane()), CAR(new Car()), HIGHSPEEDRAIL(new HighSpeedRail());
    private Vehicle vehicle;

    VehicleType(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Vehicle get(){ return  this.vehicle;}
}
