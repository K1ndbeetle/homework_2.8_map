package Transport;

import Driver.Driver;
import Interfaces.Competing;
import Transport.exception.TransportTypeException;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic> mechanics;

    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {
        if (brand == "" || brand == null || brand == "null") {
            this.brand = "default";
        } else this.brand = brand;
        if (model == "" || model == null || model == "null") {
            this.model = "default";
        } else this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanics = new ArrayList<>();
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic mechanic) {
        this.mechanics.add(mechanic);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.2;
        } else this.engineVolume = engineVolume;
    }

    public abstract boolean passDiagnostics() throws TransportTypeException;

    public abstract void printType();

    public abstract void startMove();

    public abstract void finishMove();

    @Override
    public String toString() {
        return "Марка " + brand +
                ", " + "модель " + model +
                ", " + "объём двигателя - " + engineVolume + " л.с.";
    }
}
