package com.dw.pattern.strategy;

import com.dw.pattern.strategy.vehicle.Airplane;
import com.dw.pattern.strategy.vehicle.Car;
import com.dw.pattern.strategy.vehicle.Travel;
import com.dw.pattern.strategy.vehicle.Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
       /* Vehicle vehicle = new Travel().byTransport(new Airplane());

        vehicle.chooseVehicle();*/

    Vehicle vehicle =new Travel().byTransport(VehicleType.Airplane);;

        vehicle.chooseVehicle();

    }
}
