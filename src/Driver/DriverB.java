package Driver;

public class DriverB extends Driver{

    public DriverB(String FIO,
                   boolean driverLicense,
                   int experience) {
        super(FIO, driverLicense, experience);
    }


    @Override
    public void startMove(){
        System.out.println("Водитель с категорией B " + getFIO() + " начинает движение");
    }

    @Override
    public void stay() {
        System.out.println("Водитель с категорией B " + getFIO() + " остановился");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель с категорией B " + getFIO() + " заправляет автомобиль");
    }
}
