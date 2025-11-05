package parkinglot.factory;

import parkinglot.fee.ParkingFeeStrategy;
import parkinglot.vehicle.BikeVehicle;
import parkinglot.vehicle.CarVehicle;
import parkinglot.vehicle.OtherVehicle;
import parkinglot.vehicle.Vehicle;

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