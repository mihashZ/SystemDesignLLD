package com.systemdesign.parkinglot.factory;

import com.systemdesign.parkinglot.fee.ParkingFeeStrategy;
import com.systemdesign.parkinglot.vehicle.BikeVehicle;
import com.systemdesign.parkinglot.vehicle.CarVehicle;
import com.systemdesign.parkinglot.vehicle.OtherVehicle;
import com.systemdesign.parkinglot.vehicle.Vehicle;

public class VehicleFactory {
	public static Vehicle createVehicle(String vehicleType, String licensePlate, ParkingFeeStrategy feeStrategy) {
		if (vehicleType.equalsIgnoreCase("Car")) {
			return new CarVehicle(licensePlate, vehicleType, feeStrategy);
		} else if (vehicleType.equalsIgnoreCase("Bike")) {
			return new BikeVehicle(licensePlate, vehicleType, feeStrategy);
		}
		return new OtherVehicle(licensePlate, vehicleType, feeStrategy); // For unsupported vehicle types
	}
}