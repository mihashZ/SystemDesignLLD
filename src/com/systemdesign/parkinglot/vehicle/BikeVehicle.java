package com.systemdesign.parkinglot.vehicle;
import com.systemdesign.parkinglot.fee.ParkingFeeStrategy;

public class BikeVehicle extends Vehicle {
    public BikeVehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}