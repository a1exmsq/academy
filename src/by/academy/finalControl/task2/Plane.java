package by.academy.finalControl.task2;


import java.util.Objects;

public class Plane extends AirTransport {

    private final String serialNumber;

    protected String name;

    public Plane(Double maxSpeed, String type, Double loadCapacity, Double fuelTankCapacity, Double fuelConsumption, String serialNumber, String name) {
        super(maxSpeed, type, loadCapacity, fuelTankCapacity, fuelConsumption);
        this.serialNumber = serialNumber;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Plane{" + "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", type='" + type + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", fuelConsumption=" + fuelConsumption +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (!Objects.equals(serialNumber, plane.serialNumber)) return false;
        return Objects.equals(name, plane.name);
    }

    @Override
    public int hashCode() {
        int result = serialNumber != null ? serialNumber.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


}





