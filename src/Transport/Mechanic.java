package Transport;

import Transport.exception.TransportTypeException;

import java.util.Objects;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name,
                    String company) {
        if (name == "" || name == null || name == "null") {
            this.name = "default";
        } else this.name = name;
        if (company == "" || company == null || company == "null") {
            this.company = "default";
        } else this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void performMaintenance(Transport transport) throws TransportTypeException {
        transport.passDiagnostics();
    }

    public void fixTheCar(Transport transport) {
        System.out.println("Механик " + getName() + " из компании " + getCompany()
                + " отремонтировал транспортное средство " + transport.getBrand()
                + " " + transport.getModel() + ".");
    }

    @Override
    public String toString() {
        return "имя - " + name + ", " +
                "компания - " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}
