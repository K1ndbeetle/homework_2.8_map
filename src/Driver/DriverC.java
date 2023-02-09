package Driver;

public class DriverC extends Driver{
    public DriverC(String FIO,
                   boolean driverLicense,
                   int experience) {
        super(FIO, driverLicense, experience);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией C " + getFIO() + " начинает движение");
    }
    @Override
    public void stay() {
        System.out.println("Водитель с категорией C " + getFIO() + " остановился");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель с категорией C " + getFIO() + " заправляет автомобиль");
    }
}
