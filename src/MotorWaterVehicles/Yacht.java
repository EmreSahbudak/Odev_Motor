package MotorWaterVehicles;

import MotorVehicles.Engine;

public class Yacht extends MotorWaterVehicles {
    private int numberofBeds;
    private String engineBrand;

    public Yacht(String brand, int year, Engine engine, String numberOfEngine, int width,
                 int height, int registry, String hullMaterial, int numberOfCabin, int numberofBeds, String engineBrand) {
        super(brand, year, engine, numberOfEngine, width, height, registry, hullMaterial, numberOfCabin);
        this.numberofBeds = numberofBeds;
        this.engineBrand = engineBrand;
    }

    public int getNumberofBeds() {
        return numberofBeds;
    }

    public void setNumberofBeds(int numberofBeds) {
        this.numberofBeds = numberofBeds;
    }

    public String getEngineBrand() {
        return engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "numberofBeds=" + numberofBeds +
                ", engineBrand='" + engineBrand + '\'' +
                "} " + super.toString();
    }
}
