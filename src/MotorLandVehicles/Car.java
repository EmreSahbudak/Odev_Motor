package MotorLandVehicles;

import MotorVehicles.Engine;
import MotorVehicles.MotorVehicle;

public class Car extends MotorLandVehisle {
    private int numberOfDoors;

    public Car(String brand, int year, Engine engine, String licensePlate, int numberOfWheels, int numberOfDoors) {
        super(brand, year, engine, licensePlate, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }

    /*@Override
    public String toString() {
        return "Car{" +
                "numberOfDoors= " + numberOfDoors +" licensePlate= " + getLicensePlate() +
                " numberOfWheels=" + getNumberOfWheels()+" brand= " + getBrand() +" year= "+getYear()
                +" enginePower= " + getEngine().getEnginePower() +
                " engineVolume= " + getEngine().getEngineVolume()+
                " fuelType= " + getEngine().getFuelType() +

                '}';
    }*/

}
