package Transport;

import Driver.DriverC;
import Transport.enums.LoadType;
import Transport.exception.TransportTypeException;

public class Trucks extends Transport <DriverC> {

    private LoadType loadTypes;

    public Trucks(String brand,
                  String model,
                  double engineVolume,
                  DriverC driver,
                  LoadType loadTypes) {
        super(brand, model, engineVolume, driver);
        this.loadTypes = loadTypes;
    }

    public LoadType getLoadTypes() {
        return loadTypes;
    }

    public void setLoadTypes(LoadType loadTypes) {
        this.loadTypes = loadTypes;
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        System.out.println("Диагностика пройдена грузовым автомобелем " + getBrand() + " " + getModel() + ".");
        return false;
    }

    @Override
    public void printType() {
        if (loadTypes == null) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + ". " + loadTypes);
        }
    }


    @Override
    public void startMove() {
        System.out.println("Грузовик " + getBrand() + getModel() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик " + getBrand() + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика " + getBrand() + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у грузовика " + getBrand() + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовика " + getBrand() + getModel());
    }
}
