package MotorVehicles;

public class Engine {
    private int enginePower;
    private int engineVolume;
    private FuelType fuelType;

    private int DEFAULT_ENGINEPOWER=1500;
    private int DEFAULT_ENGİNEVOLUME=1500;

    public Engine(int enginePower, int engineVolume, FuelType fuelType) {

        this.enginePower = enginePower;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public Engine(FuelType fuelType, int DEFAULT_ENGINEPOWER, int DEFAULT_ENGİNEVOLUME) {
        this.fuelType = fuelType;
        this.DEFAULT_ENGINEPOWER = DEFAULT_ENGINEPOWER;
        this.DEFAULT_ENGİNEVOLUME = DEFAULT_ENGİNEVOLUME;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getDEFAULT_ENGINEPOWER() {
        return DEFAULT_ENGINEPOWER;
    }

    public void setDEFAULT_ENGINEPOWER(int DEFAULT_ENGINEPOWER) {
        this.DEFAULT_ENGINEPOWER = DEFAULT_ENGINEPOWER;
    }

    public int getDEFAULT_ENGİNEVOLUME() {
        return DEFAULT_ENGİNEVOLUME;
    }

    public void setDEFAULT_ENGİNEVOLUME(int DEFAULT_ENGİNEVOLUME) {
        this.DEFAULT_ENGİNEVOLUME = DEFAULT_ENGİNEVOLUME;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", engineVolume=" + engineVolume +
                ", fuelType=" + fuelType +
                '}';
    }
}
