package Transport;

import Driver.DriverD;
import Transport.enums.CapacityType;
import Transport.exception.TransportTypeException;

public class Bus extends Transport <DriverD> {

    private CapacityType capacityType;

    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver,
               CapacityType capacityType) {
        super(brand, model, engineVolume, driver);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }

    @Override
    public void printType() {
        if (capacityType == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println("Автобус " + getBrand() + " " + getModel() + ". " + capacityType);
        }
    }

    @Override
    public void startMove() {
        System.out.println("Автобус " + getBrand() + getModel() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус " + getBrand() + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса " + getBrand() + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у автобуса " + getBrand() + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у автобуса " + getBrand() + getModel());
    }
}

