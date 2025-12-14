package com.systemdesign.parkinglot.vehicle;
import com.systemdesign.parkinglot.fee.ParkingFeeStrategy;

public class OtherVehicle extends Vehicle {
    public OtherVehicle(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}