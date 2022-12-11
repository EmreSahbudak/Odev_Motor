package MotorLandVehicles;

import MotorVehicles.Engine;
import MotorVehicles.MotorVehicle;

public abstract class MotorLandVehisle extends MotorVehicle {
    private String licensePlate;
    private int numberOfWheels;

    public MotorLandVehisle(String brand, int year, Engine engine, String licensePlate, int numberOfWheels) {
        super(brand, year, engine);
        this.licensePlate = licensePlate;
        this.numberOfWheels = numberOfWheels;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "MotorLandVehisle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                "}\n" + super.toString();
    }
}
