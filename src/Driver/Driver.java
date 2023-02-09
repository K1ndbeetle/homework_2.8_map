package Driver;

public abstract class Driver {
    private String FIO;
    private boolean driverLicense;
    private int experience;

    public Driver(String FIO,
                  boolean driverLicense,
                  int experience) {
        this.FIO = FIO;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getFIO() {
        return FIO;
    }

    public abstract void startMove();

    public abstract void stay();

    public abstract void refuelCar();

}
