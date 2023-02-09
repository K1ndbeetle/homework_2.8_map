package Driver;

public class DriverD extends Driver{
    public DriverD(String FIO,
                   boolean driverLicense,
                   int experience) {
        super(FIO, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией D " + getFIO() + " начинает движение");
    }

    @Override
    public void stay() {
        System.out.println("Водитель с категорией D " + getFIO() + " остановился");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель с категорией D " + getFIO() + " заправляет автомобиль");
    }
}
