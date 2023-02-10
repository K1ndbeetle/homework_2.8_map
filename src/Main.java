import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.*;
import Transport.enums.BodyTypes;
import Transport.enums.CapacityType;
import Transport.enums.LoadType;
import Transport.exception.TransportTypeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws TransportTypeException {

        Mechanic mechanic1 = new Mechanic("Иван", "Бик Авто");
        Mechanic mechanic2 = new Mechanic("Алексей", "Fit Service");
        Mechanic mechanic3 = new Mechanic("Илья", "Twin Top");

        DriverB driverB = new DriverB("Иван Иванов Иванович", true, 15);
        DriverD driverD = new DriverD("Фёдор Фёдорович Колесников", true, 10);
        DriverC driverC = new DriverC("Антон Антонович Антонов", true, 17);

        Car carAudi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                driverB,
                BodyTypes.SEDAN);

        Car carBmw = new Car(
                "BMW",
                "Z8",
                3.0,
                driverB,
                BodyTypes.COUPE);

/*        Car carKia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4,
                driverB,
                BodyTypes.SUV);

        Car carHyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                driverB,
                null);
*/
        /*
        printInfo(carAudi);
        printInfo(carBmw);
        printInfo(carKia);
        printInfo(carHyundai);
        System.out.println();
*/
        Bus busDaewoo = new Bus(
                "Daewoo",
                "BS 106",
                6.5,
                driverD,
                null);

        Bus busHiger = new Bus(
                "Higer",
                "KLQ 6122B",
                10,
                driverD,
                CapacityType.BIG);

/*        Bus busSetra = new Bus(
                "Setra",
                "S215 HD",
                8,
                driverD,
                CapacityType.GREAT);

        Bus busVolvo = new Bus(
                "Volvo",
                "9500",
                7.7,
                driverD,
                CapacityType.LITTLE);
*/
        /*
        printInfo(busDaewoo);
        printInfo(busHiger);
        printInfo(busSetra);
        printInfo(busVolvo);
        System.out.println();
*/
        Trucks trucksMan = new Trucks(
                "Man",
                "TGX",
                12.4,
                driverC,
                LoadType.N1);

        Trucks trucksScania = new Trucks(
                "Scania",
                "XT",
                16,
                driverC,
                null);
/*
        Trucks trucksTatra = new Trucks(
                "Tatra",
                "T815",
                12.7,
                driverC,
                LoadType.N2);

        Trucks trucksRenault = new Trucks(
                "Renault",
                "Magnum",
                12.8,
                driverC,
                LoadType.N3);
*/
/*
        printInfo(trucksMan);
        printInfo(trucksScania);
        printInfo(trucksTatra);
        printInfo(trucksRenault);
        System.out.println();

        carAudi.printType();
        carBmw.printType();
        carKia.printType();
        carHyundai.printType();
        System.out.println();

        busDaewoo.printType();
        busHiger.printType();
        busSetra.printType();
        busVolvo.printType();
        System.out.println();

        trucksMan.printType();
        trucksScania.printType();
        trucksTatra.printType();
        trucksRenault.printType();
        System.out.println();

        carAudi.passDiagnostics();
        carBmw.passDiagnostics();
        carKia.passDiagnostics();
        carHyundai.passDiagnostics();
        System.out.println();

        trucksMan.passDiagnostics();
        trucksScania.passDiagnostics();
        trucksTatra.passDiagnostics();
        trucksRenault.passDiagnostics();

        try {busDaewoo.passDiagnostics();
            busHiger.passDiagnostics();
            busSetra.passDiagnostics();
            busVolvo.passDiagnostics();
        }
        catch (TransportTypeException e) {
            System.err.println("Автобусы диагностику проходить не должны.");
        }
*/

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(mechanic1);
        mechanics.add(mechanic2);
        mechanics.add(mechanic3);

        System.out.println(mechanics);

        List<Mechanic> mechanicsOfTransport1 = new ArrayList<>();
        mechanicsOfTransport1.add(mechanic1);
        List<Mechanic> mechanicsOfTransport2 = new ArrayList<>();
        mechanicsOfTransport2.add(mechanic1);
        mechanicsOfTransport2.add(mechanic3);
        List<Mechanic> mechanicsOfTransport3 = new ArrayList<>();
        mechanicsOfTransport3.add(mechanic3);
        mechanicsOfTransport3.add(mechanic2);
        List<Mechanic> mechanicsOfTransport4 = new ArrayList<>();
        mechanicsOfTransport4.add(mechanic1);
        List<Mechanic> mechanicsOfTransport5 = new ArrayList<>();
        mechanicsOfTransport5.add(mechanic1);
        mechanicsOfTransport5.add(mechanic3);
        List<Mechanic> mechanicsOfTransport6 = new ArrayList<>();
        mechanicsOfTransport6.add(mechanic3);

        carAudi.addMechanic(mechanic1);
        carBmw.addMechanic(mechanic2);
        carBmw.addMechanic(mechanic3);

        trucksMan.addMechanic(mechanic2);
        trucksMan.addMechanic(mechanic1);
        trucksScania.addMechanic(mechanic3);

        busDaewoo.addMechanic(mechanic3);
        busHiger.addMechanic(mechanic3);

        System.out.println();

        driverAndMechanics(carAudi);
        driverAndMechanics(carBmw);

        driverAndMechanics(trucksMan);
        driverAndMechanics(trucksScania);

        driverAndMechanics(busDaewoo);
        driverAndMechanics(busHiger);

        System.out.println();

        try {
            mechanic1.performMaintenance(carAudi);
            mechanic2.performMaintenance(trucksMan);
            mechanic2.performMaintenance(carBmw);
            mechanic3.performMaintenance(busDaewoo);
        } catch (TransportTypeException e) {
            System.err.println("Автобусы не нуждаются в техобслуживании перед заездом");
        }

        System.out.println();

        mechanic2.fixTheCar(trucksMan);
        mechanic1.fixTheCar(carBmw);

        System.out.println();

        List<Transport> transport = new ArrayList<>();
        transport.add(carAudi);
        transport.add(carBmw);
        transport.add(trucksMan);
        transport.add(trucksScania);
        transport.add(busDaewoo);
        transport.add(busHiger);

        System.out.println(transport);

        System.out.println();

        ServiceStation serviceCar = new ServiceStation();
        ServiceStation serviceTruck = new ServiceStation();

        serviceCar.addCarQueue(carAudi);
        serviceCar.addCarQueue(carBmw);

        serviceTruck.addCarQueue(trucksMan);
        serviceTruck.addCarQueue(trucksScania);

        serviceCar.performMaintenance();
        serviceTruck.performMaintenance();

        System.out.println();

        Map<Transport, List<Mechanic>> transportAndMechanics = new HashMap<>();
        transportAndMechanics.put(carAudi, mechanicsOfTransport1);
        transportAndMechanics.put(carBmw, mechanicsOfTransport2);
        transportAndMechanics.put(trucksMan, mechanicsOfTransport3);
        transportAndMechanics.put(trucksScania, mechanicsOfTransport4);
        transportAndMechanics.put(busDaewoo, mechanicsOfTransport5);
        transportAndMechanics.put(busHiger, mechanicsOfTransport6);

        for (Map.Entry<Transport, List<Mechanic>> vehicle :
                transportAndMechanics.entrySet()) {
            System.out.println("Автомобиль " + vehicle.getKey().getBrand() + " " + vehicle.getKey().getModel() + ", механик(и): "
                    + vehicle.getValue().toString().replace("[", "").replace("]", "") + ".");
        }
        System.out.println();

    }

    public static void driverAndMechanics(Transport transport) {
        System.out.println("Водитель " +
                transport.getBrand() +
                " " + transport.getModel() +
                " является " + transport.getDriver().getFIO() +
                ", транспорт обслуживается механиком(механиками): "
                + transport.getMechanics().toString().replace("[", "").replace("]", "")
                + ".");
    }

    public static void printInfo(Transport<?> transport){
        System.out.println("Водитель с категорией B " + transport.getDriver().getFIO() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет учавствовать в заезде");
    }
}
